package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalcLauncher extends Application {
  @Override
  public void start(Stage stage) throws Exception {

//    System.out.println("Current Locale: " + Locale.getDefault());
//
//    URL location = getClass().getResource("GuiAccordion.fxml");
   //ResourceBundle resources = ResourceBundle.getBundle("fxml");
 //   FXMLLoader fxmlLoader = new FXMLLoader(location, resources);
  //  Parent root = FXMLLoader.load(location, resources);
    Parent root = FXMLLoader.load(getClass().getResource("/fxml/GUI.fxml"));
    //Parent root = FXMLLoader.load(getClass().getResource("/view/GUI.fxml"));
   CalcGuiController.setPrimaryStage(stage, root);
  }

  public static void main(String[] args) {
    launch(args);
  }
}
