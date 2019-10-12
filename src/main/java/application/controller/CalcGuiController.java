package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import model.budgetcalc.Budget;
import model.budgetcalc.Calc;

public class CalcGuiController extends ControllerAbstract {  

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

  protected void refreshBudget() {

    TextField[] expenseFields = {
        rentFxml,
        foodFxml,
        utilsFxml,
        transportFxml,
        funFxml,
        debtFxml,
        savingsFxml
    };
    
    TextField[] incomeFields = {
        salaryFxml
    };
    
    Double[] incomes =  fieldstoDoubles(incomeFields);
    Double[] expenses = fieldstoDoubles(expenseFields);

    Budget budget = new Budget(incomes, expenses);

    String incomeString = Calc.numericToFinancial(String.format("%3.0f", budget.getIncome()) , false);
    String expensesString = Calc.numericToFinancial(String.format("%3.0f", budget.getExpenses()) , false);
    String netString = Calc.numericToFinancial(String.format("%3.2f", budget.getNet()) , true);
    
    incomeFxml.setText(incomeString);
    expensesFxml.setText(expensesString);
    netFxml.setText(netString);
  }

  private static Double[] fieldstoDoubles(TextField[] fields) {
    int i = 0;
    Double[] doubles = new Double[fields.length];

    for (TextField field : fields) {
      
      doubles[i] = Calc.financialToDouble(field.getText());
      i++;
    }
    
    return doubles;
  }
}

