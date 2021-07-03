package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class InventoryManagementController implements Initializable{
  
  InventoryManagementModel inventoryModel = new InventoryManagementModel();
  
  
  @FXML
  private Label dbstatus;
  

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    if(this.inventoryModel.isDatabaseConnected()) { 
      this.dbstatus.setText("Connected");
    }
    else {
      this.dbstatus.setText("Not Connected");
    }
    
  }
	
}
