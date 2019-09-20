package application;

import application.CategorySelector.Category;
import application.CategorySelector.CategoryFactory;

public class BMICalculation {
	
	private double Calculate(double weight, double height) {		
		return weight/(height*height);
	}
	
	public BMIResult Result(double weight, double height, int age, String gender) {
		double res = Calculate(weight,height);
		CategoryFactory fac = new CategoryFactory(res);
		 
		BMIResult result = new BMIResult();
		if (age >= 18)
		{
			
			if(res < 18.5)
			{
				Category category = fac.getCategory(BMICategory.Thinness);
				result.categoryname = "Thinness";
				result.healthyweight = GetIdealWeight(gender, height);
				
			}
			else if(res >= 18.5 && res < 25) {
				Category category = fac.getCategory(BMICategory.Normal);
				result.categoryname = "Normal";
			}
			else if(res >= 25 && res < 30) {
				Category category = fac.getCategory(BMICategory.Overweight);
				result.categoryname = "Overweight";
			}
			else if(res >= 30 && res < 40) {
				Category category = fac.getCategory(BMICategory.Obese);
				result.categoryname = "Obese";
			}
		}
		else if(age < 18) {
			
		}
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
