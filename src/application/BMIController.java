package application;

import application.CategorySelector.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class BMIController {


    @FXML
    private TextField txtFeet;

    @FXML
    private TextField txtWeight;

    @FXML
    private TextField txtAge;

    @FXML
    private Button btnCalculate;

    @FXML
    private RadioButton radioMale;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private TextField txtInch;
    
    @FXML
    private Label lblGuideline;

    @FXML
    private Label lblHealthyHeight;

    @FXML
    void CalculateBMI(ActionEvent event) {
    	String gender = null;
    	if(radioMale.isSelected())
    	{
    		gender = "Male";
    	}
    	if(radioFemale.isSelected()) {
    		gender = "Female";
    	}
    	
    	BMICalculation bmicalculation = new BMICalculation();
    	double height = Double.parseDouble(txtFeet.getText()) + (Double.parseDouble(txtInch.getText())/12);
    	BMIResult bmiResult= bmicalculation.Result(Double.parseDouble(txtWeight.getText()),height , Integer.parseInt(txtAge.getText()), gender);
    	
    	lblHealthyHeight.setText(bmiResult.healthyweight);
    	lblGuideline.setText(bmiResult.categoryname);
    	
    	
    }

}


