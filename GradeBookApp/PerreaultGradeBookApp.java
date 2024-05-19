/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package GradeBookApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PerreaultGradeBookApp extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Grade Book Application");

        //create layout and scene
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));

        //add form fields and buttons
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

        //labels and textfields
        Label firstNameLabel = new Label("First Name: ");
        TextField firstNameField = new TextField();

        Label lastNameLabel = new Label("Last Name: ");
        TextField lastNameField = new TextField();

        Label courseLabel = new Label("Course: ");
        TextField courseField = new TextField();

        Label gradeLabel = new Label("Grade: ");
        ComboBox<String> gradeComboBox = new ComboBox<>();
        gradeComboBox.getItems().addAll("A", "B", "C", "D", "E", "F");

        //add to gridpane
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

        //event handlers will go here
        clearButton.setOnAction(e -> clearForm());
        saveButton.setOnAction(e -> saveEntry());
        viewGradesButton.setOnAction(e -> viewGrades());

        buttonBox.getChildren().addAll(clearButton, saveButton, viewGradesButton);
        return buttonBox;
    }

    private TextArea createGradeDisplayArea()
    {
        TextArea gradeDisplayArea = new TextArea();
        gradeDisplayArea.setEditable(false);
        gradeDisplayArea.setPrefHeight(200);
        return gradeDisplayArea;
    }

    private void clearForm()
    {
        //logic will go here
    }

    private void saveEntry()
    {
        //logic will go here
    }

    private void viewGrades()
    {
        //logic will go here
    }
}
