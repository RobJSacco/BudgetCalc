package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalcGuiController extends ControllerAbstract{  

  @FXML private TextField salaryFxml;
  @FXML private TextField rentFxml;
  @FXML private TextField foodFxml;
  @FXML private TextField utilsFxml;
  @FXML private TextField transportFxml;
  @FXML private TextField funFxml;
  @FXML private TextField debtFxml;
  @FXML private TextField savingsFxml;

  
  protected void refreshFields() {

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
    
    this.expenseFields = expenseFields;
    this.incomeFields = incomeFields;

  }
}

