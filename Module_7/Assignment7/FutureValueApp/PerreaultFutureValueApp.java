/*Citation Liang, (2019). Introduction to Java programming and Data Structures: Comprehensive version (17th ed.). Pearson Education inc.*/
/*Krasso, R., (2021). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved*/
/*Payne, D., (2021). CSD 405 Intermediate Java Programming. Bellevue University, all rights reserved.*/

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PerreaultFutureValueApp extends Application 
{

    private TextField txtInvestmentAmount = new TextField();
    private TextField txtYears = new TextField();
    private TextArea txtFutureValue = new TextArea();
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Label lblInterestRateFormat = new Label("");
    private ComboBox<Integer> cmbInterestRate = new ComboBox<>();
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");

    @Override
    public void start(Stage primaryStage) {
        //GridPane
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);

        //GridPane controls
        pane.add(new Label("Investment Amount:"), 0, 0);
        pane.add(txtInvestmentAmount, 1, 0);
        pane.add(new Label("Years:"), 0, 1);
        pane.add(txtYears, 1, 1);
        pane.add(lblMonthlyPayment, 0, 2);
        pane.add(txtFutureValue, 1, 2);
        pane.add(lblInterestRate, 0, 3);
        pane.add(cmbInterestRate, 1, 3);
        lblInterestRateFormat.setTextFill(Color.RED);
        pane.add(lblInterestRateFormat, 1, 4);
        GridPane.setHalignment(lblInterestRateFormat, HPos.RIGHT);

        //HBox
        HBox actionBtnContainer = new HBox();
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.setSpacing(10);
        actionBtnContainer.getChildren().add(btnClear);
        actionBtnContainer.getChildren().add(btnCalculate);

        //addHBox to GridPane
        pane.add(actionBtnContainer, 1, 5);

        //primary stage
        primaryStage.setTitle("Perreault Future Value App");
        primaryStage.setScene(new Scene(pane, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) 
    {
        launch(args);
    }
}
