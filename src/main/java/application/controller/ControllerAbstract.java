package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import model.budgetcalc.Calc;

abstract class ControllerAbstract {
    
  @FXML protected void handleFinance(KeyEvent evt) {
    TextField source = (TextField) evt.getSource();
    final int loc = source.getCaretPosition();
    String string = source.getText();
    System.out.println();
    if ((evt.getCode().isModifierKey()) || evt.getCode().isNavigationKey()) {
      return;
    }    
    String financial = Calc.numericToFinancial(string, false);
    source.setText(financial);
    source.positionCaret(loc + financial.length() - string.length());
    refreshBudget();
  }
  
  protected abstract void refreshBudget();

}
