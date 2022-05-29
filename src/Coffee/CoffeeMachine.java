package Coffee;

import java.util.List;

enum Ingredients {
	WATER;
	MILK;
	COFFEE;
}

class Drink {
	private List<Ingredients> _ingredients;
	
	Drink(List<Ingredients> newIngredients) {

		this._ingredients = newIngredients;
	}
	
	public List<Ingredients> getIngredients() {
		return this._ingredients;
	}
	
	public void setIngredients(List<Ingredients> addingIngredients) {
		this._ingredients = addingIngredients;
	}
	
	public void addIngredients(List<Ingredients> addingIngredients) {
		this._ingredients.add(addingIngredients);
	}
}

public class CoffeeMachine {
	private int _waterCount;
	private int _milkCount;
	private int _coffeeCount;

	
	CoffeeMachine(int WATER, int MILK, int COFFEE) {
		this._waterCount = WATER;
		this._milkCount =MILK;
		this._coffeeCount = COFFEE;
	}
	
	public int getWater(){
		return this._waterCount;
	}
	
	public void addWater(int water) {
		if (_protect(water, Ingredients.WATER)) {
			this._waterCount += water;
		} else
			System.out.println("Много воды");
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
			case Ingredients.WATER:
				return this._waterCount + amount <= 100;
		}
	}
	
	public Drink makeEsspresso() {
		Drink drink = new Drink(  addingIngredients/*Ingredients.coffee, Ingredients.water*/);
		if (this._waterCount != 0 && this._coffeeCount != 0) {
			this._waterCount--;
			this._coffeeCount--;
		} return drink;
	}
	
	public Drink createEsspresso() {
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