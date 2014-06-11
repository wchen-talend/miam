package my.food;

import java.util.ArrayList;
import java.util.List;


public class ChaShaoBao implements Food {

	List<String> ingredients = new ArrayList<String>();
	
	//pork¡±, ¡°oyster sauce¡±, ¡°bread
	//add something
	public ChaShaoBao(String oyster,String sauce,String bread){
		ingredients.add(oyster);
		ingredients.add(sauce);
		ingredients.add(bread);
		ingredients.add("banana");
		ingredients.add("apple");
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

}
