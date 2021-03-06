package my.stomach;

import java.util.ArrayList;
import java.util.List;

import my.country.Customer;
import my.food.ChaShaoBao;
import my.food.DanDanMian;
import my.food.Food;
import my.food.Pizza;

public class Stomach {

	List<Food> foodsInside = new ArrayList<Food>();
	
	public Stomach() {
		foodsInside.add(new Pizza());
		foodsInside.add(new DanDanMian());
		foodsInside.add(new DanDanMian());
		foodsInside.add(new DanDanMian("tup-3.2 from wchen"));
		foodsInside.add(new DanDanMian("ma fan"));
		foodsInside.add(new DanDanMian("^_^","^_^","^_^"));
		/* Exercise 2 : add your food */
		//foodsInside.add(new Pizza()); //I like Pizza
		//foodsInside.add(new Pizza()); //I like Pizza
		foodsInside.add(new ChaShaoBao("^_^","sauce","bread"));
		foodsInside.add(new ChaShaoBao("^_^","sauce1","bread1"));
		foodsInside.add(new ChaShaoBao("^_^","sauce1","bread1"));
		foodsInside.add(new ChaShaoBao("^_^","sauce1","bread1"));
		foodsInside.add(new DanDanMian("(^_^)","(^_^)","(^_^)"));
		// I'm hacker, you eat so much
		foodsInside.clear(); //^_^
		foodsInside.add(new ChaShaoBao("^_^","sauce1","bread1"));
		foodsInside.add(new ChaShaoBao("^_^","sauce1","bread1"));
		//foodsInside.add(new DanDanMian("***","***","***"));
		foodsInside.clear(); //^_^
		foodsInside.add(new ChaShaoBao("^_^","sauce1","bread1"));
		foodsInside.add(new ChaShaoBao("^_^","branch1_branch2","branch1_branch2"));
	    foodsInside.add(new ChaShaoBao("^_^","change it a","change it a"));
		Customer custemer = new Customer();
		custemer.haochibu();
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("My stomach contains " + foodsInside.size() + " food(s):\n\n");
		for (Food food : foodsInside) {
			sb.append(foodsInside.indexOf(food) + 1 + ")");
		
			/* Display the name of the food object */
			sb.append(food.getClass().getSimpleName() + ":");
			sb.append("\n");
			
			/* Display the list of ingredients */
			sb.append(food.getIngredients());
			sb.append("\n\n");
			
			/* Exercise 3: Display the country of origin see class Country */ 
			sb.append(food.getCountryOrigin());
			sb.append("\n\n");
		}
		return sb.toString();
	}
}
