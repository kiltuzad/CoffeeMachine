package Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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



	CoffeeMachine() {
		this._cleanliness = 100;
		this._turnedOn = false;
	}
	
	public int getWater(){
		return this._waterCount;
	}


	public int getMilk(){
		return this._milkCount;
	}

	public int getCoffee(){
		return this._coffeeCount;
	}

	public int getCleanliness(){
		return this._cleanliness;
	}


	/*public boolean set_turnedOn(){
		this._turnedOn = flip ;
			this._turnedOn = !this._turnedOn;
		return true;
	}*/

	public void set_turnedOn() {
		this._turnedOn =! this._turnedOn;
	}

	public boolean get_turnedOn(){
		return this._turnedOn;
	}



	/*public boolean flip(boolean turnedOn){
		this._turnedOn =! turnedOn;
		return turnedOn;
	}*/

	public void addCleanliness(){
		if(this._turnedOn){
			if(this._cleanliness >= 80){
				System.out.println("Машину чистить не нужно!");
			}else this._cleanliness += 10;
		}
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
		if (this._turnedOn) {
			if (_protect(coffee, Ingredients.COFFEE)) {
				this._coffeeCount += coffee;
			} else
				System.out.println("Много кофе");
		}
	}

	public void addMilk(int milk) {
		if (this._turnedOn) {
			if (_protect(milk, Ingredients.MILK)) {
				this._milkCount += milk;
			} else
				System.out.println("Много молока");
		}
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

	public void status(){
		System.out.println("Количество воды - " + this._waterCount);
		System.out.println("Количество молока - " + this._milkCount);
		System.out.println("Количество кофе - " + this._coffeeCount);
		System.out.println("Чистота машины - " + this._cleanliness);
	}
	
	public Drink makeEsspresso() {
		Drink drinkEss= new Drink();
		if (this._turnedOn) {
			if (this._waterCount >= 2 && this._coffeeCount >= 2 | this._cleanliness >=10) {
				List<Ingredients> ingredientsEss = new ArrayList<Ingredients>();
				ingredientsEss.add(Ingredients.COFFEE);
				ingredientsEss.add(Ingredients.WATER);
				drinkEss.setIngredients(ingredientsEss);
				this._waterCount--;
				this._coffeeCount--;
				this._cleanliness =- 5;
			}
		}
		return drinkEss;
	}

	public Drink makeEsspresso2(){
		Drink drinkEss2 = new Drink();
		if (this._turnedOn){
			if(this._waterCount >= 3 | this._coffeeCount >=3 | this._cleanliness >=15){
				List<Ingredients> ingredientsEss2 = new ArrayList<Ingredients>();
				ingredientsEss2.add(Ingredients.COFFEE);
				ingredientsEss2.add(Ingredients.WATER);
				drinkEss2.setIngredients(ingredientsEss2);
				this._waterCount =- 2;
				this._coffeeCount =- 2;
				this._cleanliness =- 10;
			}
		}
		return drinkEss2;
	}

	public Drink makeEsspresso3(){
		Drink drinkEss3 = new Drink();
		if (this._turnedOn){
			if(this._waterCount >= 4 | this._coffeeCount >=4 | this._cleanliness >=20){
				List<Ingredients> ingredientsEss3 = new ArrayList<Ingredients>();
				ingredientsEss3.add(Ingredients.COFFEE);
				ingredientsEss3.add(Ingredients.WATER);
				drinkEss3.setIngredients(ingredientsEss3);
				this._waterCount =-3;
				this._coffeeCount =-3;
				this._cleanliness =- 15;
			}
		}
		return drinkEss3;
	}

	public Drink makeCappuccino(){
		Drink drinkCap = new Drink();
		if (this._turnedOn){
			if (this._milkCount >= 4 | this._coffeeCount >=2 | this._cleanliness >=10 ){
				List<Ingredients> ingredientsCap = new ArrayList<Ingredients>();
				ingredientsCap.add(Ingredients.COFFEE);
				ingredientsCap.add(Ingredients.MILK);
				drinkCap.setIngredients(ingredientsCap);
				this._coffeeCount --;
				this._milkCount =- 2;
				this._cleanliness =- 5;
			}
		}
		return drinkCap;
	}

	public Drink makeCappuccino2(){
		Drink drinkCap2 = new Drink();
		if (this._turnedOn){
			if (this._milkCount >= 8 | this._coffeeCount >=4 | this._cleanliness >=15 ){
				List<Ingredients> ingredientsCap2 = new ArrayList<Ingredients>();
				ingredientsCap2.add(Ingredients.COFFEE);
				ingredientsCap2.add(Ingredients.MILK);
				drinkCap2.setIngredients(ingredientsCap2);
				this._coffeeCount =- 2;
				this._milkCount =- 4;
				this._cleanliness =- 10;
			}
		}
		return drinkCap2;
	}

	public Drink makeCappuccino3(){
		Drink drinkCap3 = new Drink();
		if (this._turnedOn){
			if (this._milkCount >= 10 | this._coffeeCount >=6 | this._cleanliness >=20 ){
				List<Ingredients> ingredientsCap3 = new ArrayList<Ingredients>();
				ingredientsCap3.add(Ingredients.COFFEE);
				ingredientsCap3.add(Ingredients.MILK);
				drinkCap3.setIngredients(ingredientsCap3);
				this._coffeeCount =- 3;
				this._milkCount =- 6;
				this._cleanliness =- 15;
			}else
				System.out.println("Проверьте состояние машины");
		}
		return drinkCap3;
	}

	public void recipeEsspresso(){
		System.out.println("20 гр отборнейшего кофе");
		System.out.println("100 мл воды с температурой 86-90 °C");
	}

	public void recipeCappuccino(){
		System.out.println("20 гр отборнейшего кофе");
		System.out.println("50 мл молока при температуре 60°C");
		System.out.println("50 мл молочной пенки");
	}

	public void menuMachine(){
		System.out.println("Добавить ингридидиенты - 1");
		System.out.println("Состояние машины - 2");
		System.out.println("Очистить машину - 3");
		System.out.println("Приготовить Эспрессо - 4");
		System.out.println("Приготовить Каапучино - 5");
		System.out.println("Создать профиль - 6");
		System.out.println("Выбрать профиль - 7");
		System.out.println("Рецепт Эспрессо - 8");
		System.out.println("Рецепт Капучино - 9");
		System.out.println("Выключить машину - 0");
	}

	public void menuAddIngridient(){
		System.out.println("Добавить воды - 1");
		System.out.println("Добавить кофе - 2");
		System.out.println("Добавить молоко - 3");
		System.out.println("Вернуться в меню - 4");
	}

	public void menuEsspresso(){
		System.out.println("Сколько кружек сделать ?");
		System.out.println("Сдлеать одну порцию - 1");
		System.out.println("Сдеть две порции - 2");
		System.out.println("Сделать три порции - 3");
		System.out.println("Вернуться в меню -4");
	}


}

class Menu {

	static Scanner scanner = new Scanner(System.in);
	static CoffeeMachine coffeeMachine = new CoffeeMachine();

	public static void main(String[] args) {

		String on = scanner.nextLine();
		System.out.println("Для включения нажмите 1");
		if (on.equals("1")) coffeeMachine.set_turnedOn();
		{
			System.out.println("Машина включена");
			coffeeMachine.menuMachine();
			int num = scanner.nextInt();
			switch (num) {
				case 1 -> switchAddIngridient();
				case 2 -> coffeeMachine.status();
				case 3 -> coffeeMachine.addCleanliness();
				case 4 -> switchMakeEsspresso();
				case 5 -> switchMakeCappucchino();
				case 8 -> coffeeMachine.recipeEsspresso();
				case 9 -> coffeeMachine.recipeCappuccino();

			}
		}
		System.out.println("Машина выключена");
	}

	public static void switchAddIngridient() {
		int num1 = scanner.nextInt();
		coffeeMachine.menuAddIngridient();
		switch (num1) {
			case 1 -> coffeeMachine.addWater(1);
			case 2 -> coffeeMachine.addCoffee(1);
			case 3 -> coffeeMachine.addMilk(1);
			case 4 -> ;
		}
	}

	public static void switchMakeEsspresso() {
		int num2 = scanner.nextInt();
		coffeeMachine.menuEsspresso();
		switch (num2) {
			case 1 -> coffeeMachine.makeEsspresso();
			case 2 -> coffeeMachine.makeEsspresso2();
			case 3 -> coffeeMachine.makeEsspresso3();
			case 4 -> switch_turnedOn();
		}
	}

	public static void switchMakeCappucchino() {
		int num3 = scanner.nextInt();
		coffeeMachine.menuEsspresso();
		switch (num3) {
			case 1 -> coffeeMachine.makeCappuccino();
			case 2 -> coffeeMachine.makeCappuccino2();
			case 3 -> coffeeMachine.makeCappuccino3();
			case 4 -> switch_turnedOn();
		}
	}
}



		/*
		CoffeeMachine coffeeMachine = new CoffeeMachine(12, 12, 12);
	Drink drink = new Drink;
	switch(){
		case 1:
			drink.setIngredients(coffeeMachine.addWater());
			break;
		default:
			break;
	}
}*/