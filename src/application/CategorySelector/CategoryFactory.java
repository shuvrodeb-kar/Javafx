package application.CategorySelector;

import application.BMICategory;

public class CategoryFactory {
	
	private double _bmiResult = 0;
	public CategoryFactory(double bmiResult)
	{
		_bmiResult = bmiResult;
	}
	
	public Category getCategory(BMICategory categoryType){
		if (categoryType == null)
			return null;
		
		if(categoryType.equals(BMICategory.Thinness)) {
			Thinness thinness = new Thinness();
			if(_bmiResult < 16)
			{
				thinness = new SevereThinness();
			}
			else if(_bmiResult >= 16 && _bmiResult < 17)
			{
				thinness = new ModerateThinness();
			}			
			else if(_bmiResult >= 17 && _bmiResult < 18.5)
			{
				thinness = new MildThinness();
			}
			return thinness;
			
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
