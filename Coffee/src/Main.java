import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Выбор вида кофе
        System.out.println("Выберите вид кофе:");
        System.out.println("1. Капучино");
        System.out.println("2. Американо");
        System.out.println("3. Латте");
        int choice = scanner.nextInt();

        Coffee coffee = null;

        switch (choice) {
            case 1:
                coffee = new Cappuccino();
                break;
            case 2:
                coffee = new Americano();
                break;
            case 3:
                coffee = new Latte();
                break;
            default:
                System.out.println("Неверный выбор");
                System.exit(0);
        }

        // Добавление добавок
        System.out.println("Хотите ли вы добавить молоко? (Да/Нет)");
        String addMilk = scanner.next();

        if (addMilk.equalsIgnoreCase("Да")) {
            coffee = new MilkDecorator(coffee);
        }

        System.out.println("Хотите ли вы добавить сахар? (Да/Нет)");
        String addSugar = scanner.next();

        if (addSugar.equalsIgnoreCase("Да")) {
            coffee = new SugarDecorator(coffee);
        }

        // Вывод заказа
        System.out.println("Ваш заказ: " + coffee.getDescription());
        System.out.println("Итоговая стоимость: " + coffee.cost() + " тенге");
    }
}
