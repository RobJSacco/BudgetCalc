package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import model.budgetcalc.Budget;
import model.budgetcalc.Calc;

abstract class ControllerAbstract {
   
  @FXML protected Label totalIncome;
  @FXML protected Label totalExpense;
  @FXML protected Label net;

  protected TextField[] expenseFields;
  protected TextField[] incomeFields;
  
 // @FXML abstract protected void handleFinance(KeyEvent evt);

  
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
  

  protected void refreshBudget() {
    refreshFields();
    Double[] incomes =  fieldstoDoubles(incomeFields);
    Double[] expenses = fieldstoDoubles(expenseFields);
    Budget budget = new Budget(incomes, expenses);

    String incomeString = Calc.numericToFinancial(String.format("%3.0f", budget.getIncome()) , false);
    String expensesString = Calc.numericToFinancial(String.format("%3.0f", budget.getExpenses()) , false);
    String netString = Calc.numericToFinancial(String.format("%3.2f", budget.getNet()) , true);
    
    totalIncome.setText(incomeString);
    totalExpense.setText(expensesString);
    net.setText(netString);
  }
  
  protected abstract void refreshFields();

  protected static Double[] fieldstoDoubles(TextField[] fields) {
    int i = 0;
    Double[] doubles = new Double[fields.length];

    for (TextField field : fields) {
      
      doubles[i] = Calc.financialToDouble(field.getText());
      i++;
    }    
    return doubles;
  }
}
