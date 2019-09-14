package application;

import application.CategorySelector.Category;
import application.CategorySelector.CategoryFactory;

public class BMICalculation {
	
	private double Calculate(double weight, double height) {		
		return weight/(height*height);
	}
	
	public String Result(double weight, double height) {
		double res = Calculate(weight,height);
		CategoryFactory fac = new CategoryFactory(res);
		Category category = null;
		if(res < 18.5)
		{
			category = fac.getCategory(BMICategory.Thinness);
		}
		else if(res >= 18.5 && res < 25) {
			category = fac.getCategory(BMICategory.Normal);
		}
		else if(res >= 25 && res < 30) {
			category = fac.getCategory(BMICategory.Overweight);
		}
		else if(res >= 30 && res < 40) {
			category = fac.getCategory(BMICategory.Obese);
		}
		
		return category.showTips();
	}
	

}
