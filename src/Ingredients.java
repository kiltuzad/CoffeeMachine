 public class Ingredients {

    static int water;
    static int milk;
    static int coffee;
    static int cleanliness;

    int replenishWater(int amount) {
       amount = 100;
       for (water = 0; water < amount; water = water+10) {
           System.out.println("Воды- " + water);
       }
       return water;
   }
   int replenishMilk(int amount1){
         amount1 = 100;
         for (milk = 0; milk< amount1; milk=milk+10){
             System.out.println("Молока- "+ milk);
         }
         return milk;
     }
     int replenishCoffee(int amount2){
         amount2=100;
        for (coffee = 0; coffee< amount2; coffee=coffee+10){
            System.out.println("Кофе- "+coffee);
        }
        return coffee;
     }
     int machineCleanliness(int amount3){
        amount3 = 100;
        for (cleanliness = 0; cleanliness<amount3; cleanliness=cleanliness+10){
            System.out.println("Чистота машины- "+cleanliness);
        }
        return cleanliness;
     }


}