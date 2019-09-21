package application.CategorySelector;

public class Obese implements Category {

	@Override
	public String showTips() {
		return "Have low-fat, low-sugar snacks on hand. Whether you are at home, at work, or on the go, healthy snacks may help to combat hunger and prevent overeating."
				+ "\n\nSelect a mix of colorful vegetables each day. Choose dark leafy greens, such as spinach, kale, collards, and mustard greens, and reds and oranges such as carrots, sweet potatoes, red peppers, and tomatoes."
				+ "\n\nEat breakfast every day. People who eat breakfast are less likely to overeat later in the day.\n\nChoose whole grains more often. Try whole-grain breads and pastas, oatmeal, brown rice, or bulgur."
				+ "\n\nChoose fresh fruit more often than fruit juice. Fruit juice has little or no fiber, the calories may be high, and many juices have added sugar."
				+ "\n\nLimit foods and beverages that are high in sugar.";
	}

}
