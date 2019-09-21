package application.CategorySelector;

public class Normal implements Category {

	@Override
	public String showTips() {
		// TODO Auto-generated method stub
		return "Eat a variety of foods. For good health, we need more than 40 different nutrients, and no single food can supply them all. It is not about a single meal, it is about a balanced food choice over time that will make a difference!"
				+ "\n\nBase your diet on plenty of foods rich in carbohydrates. About half the calories in our diet should come from foods rich in carbohydrates, such as cereals, rice, pasta, potatoes, and bread. It is a good idea to include at least one of these at every meal. Wholegrain foods, like wholegrain bread, pasta, and cereals, will increase our fibre intake."
				+ "\n\nReplace saturated with unsaturated fat. Fats are important for good health and proper functioning of the body. However, too much of it can negatively affect our weight and cardiovascular health. "
				+ "\n\nEnjoy plenty of fruits and vegetables.Fruits and vegetables are among the most important foods for giving us enough vitamins, minerals and fibre. We should try to eat at least 5 servings a day.";
	}
}
