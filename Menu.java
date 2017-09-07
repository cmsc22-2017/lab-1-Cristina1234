interface Menu {}

class Soup implements Menu{
	MenuInfo info;
	boolean isVegetarian;
	
	Soup(MenuInfo info, boolean isVegetarian){
		this.info = info;
		this.isVegetarian = isVegetarian;
	}
}

class Salad implements Menu{
	MenuInfo info;
	boolean isVegetarian;
	String dressingName;
	
	Salad(MenuInfo info, boolean isVegetarian, String dressingName){
		this.info = info;
		this.isVegetarian = isVegetarian;
		this.dressingName = dressingName;
	}
}

class Sandwich implements Menu{
	MenuInfo info;
	String breadKind;
	String filling1;
	String filling2;
	
	Sandwich(MenuInfo info, String breadKind, String filling1, String filling2){
		this.info = info;
		this.breadKind = breadKind;
		this.filling1 = filling1;
		this.filling2 = filling2;
	}
}

class MenuInfo{
	String name;
	int price;
	
	MenuInfo(String name, int price){
		this.name = name;
		this.price = price;
	}
}



class ExamplesMenu{
	MenuInfo soup1 = new MenuInfo("Beef Soup", 15);
	MenuInfo soup2 = new MenuInfo("Veggie Soup", 10);
	Menu soupA = new Soup(this.soup1, false);
	Menu soupB = new Soup(this.soup2, true);
	
	MenuInfo salad1 = new MenuInfo("Fruit Salad", 30);
	MenuInfo salad2 = new MenuInfo("Chicken Salad", 45);
	Menu saladA = new Salad(this.salad1, true, "Blue Cheese");
	Menu saladB = new Salad(this.salad2, false, "Russian Dressing");
	
	MenuInfo sandwich1 = new MenuInfo("Chicken Sandwich", 40);
	MenuInfo sandwich2 = new MenuInfo("Veggie Sandwich", 35);
	Menu sandwichA  = new Sandwich(this.sandwich1, "bread roll", "peanut", "butter");
	Menu sandwichB = new Sandwich(this.sandwich2, "challah", "mayo", "lettuce");
	
	
}