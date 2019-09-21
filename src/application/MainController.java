package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class MainController {
	

	@FXML
	private Label message;
	
	@FXML
	private TextField txtUserName;
	
	@FXML
	private PasswordField txtPassword;
		
	public void doLogin(ActionEvent event) {
		
		System.out.println(txtUserName.getText());		
		System.out.println(txtPassword.getText());
		
		String userName = txtUserName.getText();
		String password = txtPassword.getText();
		
		((Node)event.getTarget()).getScene().getWindow().hide();
		openBMIPage();
		/*
		 * if(!userName.isEmpty() && userName != null && password != null &&
		 * !password.isEmpty()) { if(DBConnector.doAuthenticate(userName, password)) {
		 * message.setText("Login successfull");
		 * 
		 * ((Node)event.getTarget()).getScene().getWindow().hide(); openBMIPage(); }
		 * else { message.setText("Login failed"); } } else {
		 * message.setText("User name and password cannot be empty"); }
		 */
	}
	
	private void openBMIPage() {
		try {
			
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("BMI.fxml"));			
			Stage stage = new Stage();		    
		    stage.setTitle("BMI calculator");
		    stage.setScene(new Scene(root));  
		    stage.show();
			
		} catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
