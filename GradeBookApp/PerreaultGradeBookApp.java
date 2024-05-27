/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package GradeBookApp;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PerreaultGradeBookApp extends Application 
{
    private TextField firstNameField;
    private TextField lastNameField;
    private TextField courseField;
    private ComboBox<String> gradeComboBox;
    private TextArea gradeDisplayArea;

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) 
    {
        primaryStage.setTitle("Grade Book Application");

        // Create layout and scene
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        // Add form fields and buttons
        layout.getChildren().addAll(createFormFields(), createButtons(), createGradeDisplayArea());

        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private GridPane createFormFields() 
    {
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        // Labels and textfields
        Label firstNameLabel = new Label("First Name: ");
        firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name: ");
        lastNameField = new TextField();

        Label courseLabel = new Label("Course: ");
        courseField = new TextField();

        Label gradeLabel = new Label("Grade: ");
        gradeComboBox = new ComboBox<>();
        gradeComboBox.getItems().addAll("A", "B", "C", "D", "E", "F");

        // Add to gridpane
        grid.add(firstNameLabel, 0, 0);
        grid.add(firstNameField, 1, 0);
        grid.add(lastNameLabel, 0, 1);
        grid.add(lastNameField, 1, 1);
        grid.add(courseLabel, 0, 2);
        grid.add(courseField, 1, 2);
        grid.add(gradeLabel, 0, 3);
        grid.add(gradeComboBox, 1, 3);

        return grid;
    }

    private HBox createButtons() 
    {
        HBox buttonBox = new HBox(10);
        
        Button clearButton = new Button("Clear");
        Button saveButton = new Button("Save");
        Button viewGradesButton = new Button("View Grades");

        // Event handlers
        clearButton.setOnAction(e -> clearForm());
        saveButton.setOnAction(e -> saveEntry());
        viewGradesButton.setOnAction(e -> viewGrades());

        buttonBox.getChildren().addAll(clearButton, saveButton, viewGradesButton);
        return buttonBox;
    }

    private TextArea createGradeDisplayArea() 
    {
        gradeDisplayArea = new TextArea();
        gradeDisplayArea.setEditable(false);
        gradeDisplayArea.setPrefHeight(200);
        return gradeDisplayArea;
    }

    private void clearForm() 
    {
        firstNameField.clear();
        lastNameField.clear();
        courseField.clear();
        gradeComboBox.getSelectionModel().clearSelection();
    }

    private void saveEntry() 
    {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String course = courseField.getText();
        String grade = gradeComboBox.getValue();

        if (firstName.isEmpty() || lastName.isEmpty() || course.isEmpty() || grade == null) 
        {
            showAlert("Error", "Please complete student fields and enter a grade.");
            return;
        }

        Student student = new Student(firstName, lastName, course, grade);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("grades.csv", true))) 
        {
            File file = new File("grades.csv");
            if (file.length() == 0) 
            {
                writer.write("firstName,lastName,course,grade");
                writer.newLine();
            }
            writer.write(student.toCSV());
            writer.newLine();
            showAlert("Success", "Grade saved.");
            clearForm();
        } catch (IOException e) 
        {
            showAlert("Error", "An error occurred. Grade not saved.");
            e.printStackTrace();
        }
    }

    private void viewGrades() 
    {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("grades.csv"))) 
        {
            String line;
            reader.readLine(); // Skip header row
            while ((line = reader.readLine()) != null) 
            {
                String[] data = line.split(",");
                if (data.length == 4) 
                {
                    students.add(new Student(data[0], data[1], data[2], data[3]));
                }
            }
        } 
        catch (IOException e) 
        {
            showAlert("Error", "An error occurred. Grades not read");
            e.printStackTrace();
        }

        StringBuilder displayText = new StringBuilder();
        for (Student student : students) 
        {
            displayText.append(student.toString()).append("\n");
        }
        gradeDisplayArea.setText(displayText.toString());
    }

    private void showAlert(String title, String message) 
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
