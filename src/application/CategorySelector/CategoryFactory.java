package application.CategorySelector;

import application.BMICategory;

public class CategoryFactory {
	
	public Category getCategory(BMICategory categoryType){
		if (categoryType == null)
			return null;
		
		if(categoryType.equals(BMICategory.SevereThinness)) {
			return new SevereThinness();				
		}
		else if(categoryType.equals(BMICategory.MildThinness)) {
			return new MildThinness();
		}
		
		else if(categoryType.equals(BMICategory.ModerateThinness)) {
			return new ModerateThinness();
		}
		
		else if(categoryType.equals(BMICategory.Obese)) {
			return new Obese();
		}
		
		else if(categoryType.equals(BMICategory.Normal)) {
			return new Normal();
		}
		
		else if(categoryType.equals(BMICategory.Overweight)) {
			return new Overweight();
		}
		
		return null;
	}

}
