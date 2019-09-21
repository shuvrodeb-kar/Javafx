package application;

import application.CategorySelector.Category;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;

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
    private Label lblresult;
    
    @FXML
    private Label lblTips;
    

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
    	double weight = Double.parseDouble(txtWeight.getText());
    	int age = Integer.parseInt(txtAge.getText());
    	double heightInMeter = (height*30.48)/100;
    	
    	BMIResult bmiResult= bmicalculation.Result(weight,heightInMeter,age, gender);
    	
    	//lblHealthyHeight.setText(bmiResult.healthyweight);
    	//lblGuideline.setText(bmiResult.categoryname);
    	
    	lblTips.setText(bmiResult.tips);
    	lblTips.setWrapText(true);
    	
    	lblresult.setText(bmiResult.bmi);
    	
    	
    }

}


