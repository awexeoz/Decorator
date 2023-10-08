import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clothes clothes = new BasicClothes();

        System.out.println("Добро пожаловать в магазин одежды");

        while(true){
            System.out.println("Выберите опцию");
            System.out.println("1.Базовая одежда");
            System.out.println("2.Спортивная одежда");
            System.out.println("3.Повседневная одежда");
            System.out.println("4.Модная одежда");
            System.out.println("5.Завершить");

            int ch = scanner.nextInt();
            switch(ch){
                case 1:
                    clothes = new BasicClothes();
                    break;
                case 2:
                    clothes = new SportClothesDecorator(clothes);
                    break;
                case 3:
                    clothes = new CasualClothesDecorator(clothes);
                    break;
                case 4:
                    clothes = new FashionClothesDecorator(clothes);
                    break;
                case 5:
                    System.out.println("Спасибо за посещение нашего магазина");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор");
            }

            System.out.println("Ваш выбор : " + clothes.getDescription());
            System.out.println("Цена : " + clothes.getPrice() + "$");
        }
    }
}