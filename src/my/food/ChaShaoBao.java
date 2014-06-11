package my.food;

import java.util.ArrayList;
import java.util.List;


public class ChaShaoBao implements Food {

	List<String> ingredients = new ArrayList<String>();
	
	List<String> foodsInside = new ArrayList<String>();
	
	
	//pork¡±, ¡°oyster sauce¡±, ¡°bread
	//add something
	public ChaShaoBao(String oyster,String sauce,String bread){
		ingredients.add(oyster);
		ingredients.add(sauce);
		ingredients.add(bread);
		foodsInside.add(oyster);
	}
	
	public ChaShaoBao(String oyster,String sauce,String bread,String banana){
		ingredients.add(oyster);
		ingredients.add(sauce);
		ingredients.add(bread);
		ingredients.add(banana);
	}
	
	/* Exercise 1: implement Constructor */
	
	@Override
	public List<String> getIngredients() {
		return ingredients;
	}

	@Override
	public String getCountryOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getCalory() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Integer getBanana() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Integer getApple() {
		// TODO Auto-generated method stub
		return null;
	}

}
