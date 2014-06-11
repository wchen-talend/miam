package my.food;

import java.util.ArrayList;
import java.util.List;

public class DanDanMian implements Food {
	
	
	List<String> ingredients = new ArrayList<String>();
	
	String feedBack ;

	/* Exercise 1: implement Constructor */
	
	public DanDanMian(String noodle){
		ingredients.add(noodle);
	}
	public DanDanMian(String noodle,String spices){
		ingredients.add(noodle);
		ingredients.add(spices);
	}
	public DanDanMian(String noodle,String spices,String peanuts){
		ingredients.add(noodle);
		ingredients.add(spices);
		ingredients.add(peanuts);
	}
	
	public DanDanMian(String noodle,String spices,String peanuts,String pepper){
		ingredients.add(noodle);
		ingredients.add(spices);
		ingredients.add(peanuts);
		ingredients.add(pepper);
	}
	
	public DanDanMian(){
		this("noodle","spices","peanuts","");
	}
	
	public String getFeedBack(){
		return feedBack;
	}
	
	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	
	
	
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
