package application;

import java.math.BigDecimal;
import java.math.RoundingMode;

import application.CategorySelector.Category;
import application.CategorySelector.CategoryFactory;

public class BMICalculation {
	
	private double Calculate(double weight, double height) {		
		return weight/(height*height);
	}
	
	public static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();

	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public BMIResult Result(double weight, double height, int age, String gender) {
		double res = Calculate(weight,height);
		CategoryFactory fac = new CategoryFactory();
		 
		BMIResult result = new BMIResult();
		
		result.bmi = "BMI = "+ Double.toString(round(res,2));
		if (age >= 18)
		{			
			if(res < 16)
			{
				Category category = fac.getCategory(BMICategory.SevereThinness);				
				//result.healthyweight = GetIdealWeight(gender, height);
				result.categoryname = "Severe Thinness";
				result.tips = category.showTips();
			}
			if(res >= 16 && res < 17)
			{
				Category category = fac.getCategory(BMICategory.ModerateThinness);				
				//result.healthyweight = GetIdealWeight(gender, height);
				result.categoryname = "Moderate Thinness";
				result.tips = category.showTips();
			}
			if(res >= 17 && res < 18.5)
			{
				Category category = fac.getCategory(BMICategory.MildThinness);				
				//result.healthyweight = GetIdealWeight(gender, height);
				result.categoryname = "Mild Thinness";
				result.tips = category.showTips();
			}
			else if(res >= 18.5 && res < 25) {
				Category category = fac.getCategory(BMICategory.Normal);
				result.categoryname = "Normal";
				result.tips = category.showTips();
			}
			else if(res >= 25 && res < 30) {
				Category category = fac.getCategory(BMICategory.Overweight);
				result.categoryname = "Overweight";
				result.tips = category.showTips();
			}
			else if(res >= 30 && res < 40) {
				Category category = fac.getCategory(BMICategory.Obese);
				result.categoryname = "Obese";
				result.tips = category.showTips();
			}
		}
		else if(age < 18) {
			
		}
		
		result.bmi = result.bmi + ". This is considered " + result.categoryname; 
		return result;
	}
	
	private String GetIdealWeight(String gender, double height) {
		
		double extraheight =0;		
		if(height > 5)
		{
			extraheight = height-5;
		}
		if(gender == "Male") {
			//Male:	48.0 kg + 2.7 kg per inch over 5 feet
			return Double.toString(48.0 + (2.7*extraheight));			
		}
		else if(gender == "Female") {
			//Female:	45.5 kg + 2.2 kg per inch over 5 feet
			return Double.toString(45.5 + (2.2*extraheight));
		}
		return null;

	}
	
	

}
