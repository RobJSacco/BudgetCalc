package application;

import budgetcalc.Calc;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;


public class CalcGuiController {  

  @FXML private TextField salaryFxml;
  @FXML private TextField rentFxml;

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
  }
  
  
}

