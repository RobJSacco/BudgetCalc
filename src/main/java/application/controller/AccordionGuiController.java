package application.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AccordionGuiController extends ControllerAbstract {  

  @FXML private TextField salary1;
  @FXML private TextField salary2;
  @FXML private TextField salary3;
  @FXML private TextField expense1;
  @FXML private TextField expense2;
  @FXML private TextField expense3;
  @FXML private TextField expense4;
  @FXML private TextField expense5;
  @FXML private TextField expense6;
  @FXML private TextField expense7;
  @FXML private TextField expense8;
  @FXML private TextField expense9;
  @FXML private TextField expense10;
  @FXML private TextField expense11;
  @FXML private TextField expense12;
  @FXML private TextField expense13;
  @FXML private TextField expense14;
  @FXML private TextField expense15;
  @FXML private TextField expense16;
  @FXML private TextField expense17;
  @FXML private TextField expense18;
  @FXML private TextField expense19;
  @FXML private TextField expense20;
  @FXML private TextField expense21;
  @FXML private TextField expense22;

  protected void refreshFields() {

    TextField[] expenseFields = {
        expense1,
        expense2,
        expense3,
        expense4,
        expense5,
        expense6,
        expense7,
        expense8,
        expense9,
        expense10,
        expense11,
        expense12,
        expense13,
        expense14,
        expense15,
        expense16,
        expense17,
        expense18,
        expense19,
        expense20,
        expense21,
        expense22,
    };

    TextField[] incomeFields = {
        salary1,
        salary2,
        salary3
    };

    this.expenseFields = expenseFields;
    this.incomeFields = incomeFields;

  }

}

