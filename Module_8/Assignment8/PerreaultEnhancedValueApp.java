/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

package Assignment8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PerreaultEnhancedValueApp extends Application {

    //UI
    private TextField txtMonthlyPayment;
    private TextField txtInterestRate;
    private ComboBox<Integer> cbYears;
    private Button btnCalculate;
    private Button btnClear;
    private TextArea txtResults;
    private Label lblFutureValueDate;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //initialize UI
        primaryStage.setTitle("Future Value Calculator");
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        //monthly payment label
        Label lblMonthlyPayment = new Label("Monthly Payment:");
        GridPane.setConstraints(lblMonthlyPayment, 0, 0);

        //monthly payment text field
        txtMonthlyPayment = new TextField();
        GridPane.setConstraints(txtMonthlyPayment, 1, 0);

        //interest label
        Label lblInterestRate = new Label("Interest Rate (%):");
        GridPane.setConstraints(lblInterestRate, 0, 1);

        //interest text field
        txtInterestRate = new TextField();
        GridPane.setConstraints(txtInterestRate, 1, 1);

        //years label
        Label lblYears = new Label("Years:");
        GridPane.setConstraints(lblYears, 0, 2);

        //yearscombobox
        cbYears = new ComboBox<>();
        cbYears.getItems().addAll(1, 2, 3, 4, 5);
        cbYears.setValue(0); // Default value
        GridPane.setConstraints(cbYears, 1, 2);

        //calc button
        btnCalculate = new Button("Calculate");
        btnCalculate.setOnAction(e -> calculateResults());
        GridPane.setConstraints(btnCalculate, 0, 3);

        //clear button
        btnClear = new Button("Clear");
        btnClear.setOnAction(e -> clearFormFields());
        GridPane.setConstraints(btnClear, 1, 3);

        //results text
        txtResults = new TextArea();
        txtResults.setEditable(false);
        txtResults.setPrefRowCount(5);
        GridPane.setConstraints(txtResults, 0, 4, 2, 1);

        //FV date label
        lblFutureValueDate = new Label();
        GridPane.setConstraints(lblFutureValueDate, 0, 5, 2, 1);

        grid.getChildren().addAll(lblMonthlyPayment, txtMonthlyPayment,
                lblInterestRate, txtInterestRate,
                lblYears, cbYears,
                btnCalculate, btnClear,
                txtResults, lblFutureValueDate);

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //method to clear form fields
    private void clearFormFields() {
        txtMonthlyPayment.setText("");
        txtInterestRate.setText("");
        txtResults.setText("");
        lblFutureValueDate.setText("");
        cbYears.setValue(0);
    }

    //method for calculation
    private void calculateResults() {
        try {
            double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
            double rate = Double.parseDouble(txtInterestRate.getText());
            int years = cbYears.getValue();

            double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);
            txtResults.setText("The future value is " + futureValue);

            // Set the date
            String currentDate = getTodayDate();
            lblFutureValueDate.setText("Calculation as of " + currentDate);
        } catch (NumberFormatException e) {
            txtResults.setText("Enter valid numeric values.");
        }
    }

    //method to get current date
    private String getTodayDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(new Date());
    }
}
