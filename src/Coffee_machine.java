import java.util.Scanner;



public class Coffee_machine {
    static Ingredients ing1 = new Ingredients();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Для включения нажмите 1");
            String off_on = scan.nextLine();
            if (off_on.equals("1")) {
                System.out.println("Машина включена");
                System.out.println("Добавить ингридиенты - 1");
                System.out.println("Проверить состояние машины - 2");
                System.out.println("Почистить машину - 3");
                System.out.println("Приготовить кофе - 4");
                System.out.println("Выбрать профиль - 5");
                System.out.println("Выключить машину - 0");
                int button = scan.nextInt();
                switch (button) {
                    case 1:
                        System.out.println("Добавить воды - 1. Добавить молоко - 2. Добавить кофе - 3. Добавить все ингридиенты - 4.");
                        int swich1 = scan.nextInt();
                        switch (swich1) {
                            case 1:
                                ing1.replenishWater(Ingredients.water);
                                break;
                            case 2:
                                ing1.replenishMilk(Ingredients.milk);
                                break;
                            case 3:
                                ing1.replenishCoffee(Ingredients.coffee);
                                break;
                            case 4:
                                ing1.replenishWater(Ingredients.water);
                                ing1.replenishMilk(Ingredients.milk);
                                ing1.replenishCoffee(Ingredients.coffee);
                                break;
                        }
                    case 2:
                        System.out.println("Воды- " + Ingredients.water);
                        System.out.println("Молоко- " + Ingredients.milk);
                        System.out.println("Кофе- " + Ingredients.coffee);
                        System.out.println("Чистота машины- " + Ingredients.cleanliness);
                        break;
                    case 3:
                        if (Ingredients.cleanliness >= 75) {
                            System.out.println("Машину не нужно чистить!");
                            break;
                        } else ing1.machineCleanliness(Ingredients.cleanliness);

                }


            }

        }
    }
}
