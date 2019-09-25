package application;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import model.budgetcalc.Budget;
import model.budgetcalc.Calc;


public class CalcGuiController {  

  @FXML private TextField salaryFxml;
  @FXML private TextField rentFxml;
  @FXML private TextField foodFxml;
  @FXML private TextField utilsFxml;
  @FXML private TextField transportFxml;
  @FXML private TextField funFxml;
  @FXML private TextField debtFxml;
  @FXML private TextField savingsFxml;
  @FXML private Label incomeFxml;
  @FXML private Label expensesFxml;
  @FXML private Label netFxml;
  
  public static void setPrimaryStage(Stage stage, Parent root) {
    
    Scene scene = new Scene(root, 600, 400);

    stage.setTitle("BudgetCalculator");
    stage.setScene(scene);
    stage.show();
  }

  @FXML protected void handleFinance(KeyEvent evt) {
    TextField source = (TextField) evt.getSource();
    final int loc = source.getCaretPosition();
    String string = source.getText();
    if ((evt.getCode().isModifierKey()) || evt.getCode().isNavigationKey()) {
      return;
    }    
    String financial = Calc.numericToFinancial(string, false);
    source.setText(financial);
    source.positionCaret(loc + financial.length() - string.length());
    refreshBudget();
  }
  
  @FXML protected void refreshBudget() {
    Double salary = Calc.financialToDouble(salaryFxml.getText());
    Double rent = Calc.financialToDouble(rentFxml.getText());
    Double food = Calc.financialToDouble(foodFxml.getText());
    Double utils = Calc.financialToDouble(utilsFxml.getText());
    Double transport = Calc.financialToDouble(transportFxml.getText());
    Double fun = Calc.financialToDouble(funFxml.getText());
    Double debt = Calc.financialToDouble(debtFxml.getText());
    Double savings = Calc.financialToDouble(savingsFxml.getText());
    double[] budgetNumbers = Budget.budget(salary, rent, food, utils, transport, fun, debt, savings);
    Double income = budgetNumbers[0];
    Double expenses = budgetNumbers[1];
    Double net = budgetNumbers[2];
    String incomeString = Calc.numericToFinancial(String.format("%3.0f", income) , false);
    String expensesString = Calc.numericToFinancial(String.format("%3.0f", expenses) , false);
    String netString = Calc.numericToFinancial(String.format("%3.2f", net) , true);
    incomeFxml.setText(incomeString);
    expensesFxml.setText(expensesString);
    netFxml.setText(netString);
  }
  
}

