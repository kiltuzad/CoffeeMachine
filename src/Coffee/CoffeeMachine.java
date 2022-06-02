package Coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Ingredients {
	WATER,
	MILK,
	COFFEE
}

class Drink {
	private List<Ingredients> _ingredients;
	
	Drink(List<Ingredients> newIngredients) {

		this._ingredients = newIngredients;
	}
	Drink() {
	}
	
	public List<Ingredients> getIngredients() {
		return this._ingredients;
	}
	
	public void setIngredients(List<Ingredients> addingIngredients) {
		this._ingredients = addingIngredients;
	}
	
	public void addIngredients(List<Ingredients> addingIngredients) {
		this._ingredients.addAll(addingIngredients);
	}
}

public class CoffeeMachine {
	private boolean _turnedOn;
	private int _waterCount;
	private int _milkCount;
	private int _coffeeCount;
	private int _cleanliness;


	
	CoffeeMachine(int water, int milk, int coffee) {
		this.addWater(water);
		this.addMilk(milk);
		this.addCoffee(coffee);
		this._cleanliness = 100;
		this._turnedOn = false;
	}
	
	public int getWater(){
		return this._waterCount;
	}
	
	public void addWater(int water) {
		if (this._turnedOn) {
			if (_protect(water, Ingredients.WATER)) {
				this._waterCount += water;
			} else
				System.out.println("Много воды");
		}
	}


	public void addCoffee(int coffee) {
		if (_protect(coffee, Ingredients.COFFEE)){
			this._coffeeCount += coffee;
		}else
			System.out.println("Много кофе");
	}

	public void addMilk(int milk){
		if (_protect(milk, Ingredients.MILK)){
			this._milkCount += milk;
		}else
			System.out.println("Много молока");
	}
	
	private boolean _protect(int amount, Ingredients ingredient) {
		switch(ingredient) {
			case WATER:
				return this._waterCount + amount <= 100;
			case COFFEE:
				return this._coffeeCount + amount <= 100;
			case MILK:
				return this._milkCount + amount <= 100;
			default: return false;
		}
	}
	
	public Drink makeEsspresso() {
		Drink drink = new Drink();
		if (this._waterCount != 0 && this._coffeeCount != 0) {
			List<Ingredients> ingredients = new ArrayList<Ingredients>();
			ingredients.add(Ingredients.COFFEE);
			ingredients.add(Ingredients.WATER);
			drink.setIngredients(ingredients);
			this._waterCount--;
			this._coffeeCount--;
			this._cleanliness -= 10;
		}
		return drink;
	}


}
/*
public class Main {
	public static void main(String[] args) {
    CoffeeMachine coffeeMachine = new CoffeeMachine(12, 12, 12);
	Drink drink = new Drink;
	switch(){
		case 1:
			drink.setIngredients(coffeeMachine.addWater());
			break;
		default:
			break;
	}
	}
}*/