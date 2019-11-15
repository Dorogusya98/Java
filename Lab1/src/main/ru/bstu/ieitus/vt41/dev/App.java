package main.ru.bstu.ieitus.vt41.dev;

import main.ru.bstu.ieitus.vt41.dev.util.ConstructionUtil;

import java.util.Scanner;

public class App {

    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);

        int constructionCount, constructionType;
        System.out.print("Введите количество сооружений: ");
        constructionCount = scanner.nextInt();
        Construction[] constructions = new Construction[constructionCount];

        for(int i = 0; i < constructionCount; i++) {
            System.out.println(" 1 - Здание, 2 - Дом, 3 - Частный дом,\n" +
                               "4 - Многоквартирный дом, 5 - Отель, 6 - Ресторан\n" + "Введите тип сооружения: ");
            constructionType = scanner.nextInt();
            switch (constructionType) {

                case 1: {
                    System.out.println("Здание:");
                    Building building = new Building();
                    constructions[i] = building;
                    break;
                }

                case 2: {
                    System.out.println("Дом:");
                    House house = new House();
                    constructions[i] = house;
                    break;
                }

                case 3: {
                    System.out.println("Частный дом:");
                    PHouse privateHouse = new PHouse();
                    constructions[i] = privateHouse;
                    break;
                }

                case 4: {
                    System.out.println("Многоквартирный дом:");
                    MSHouse apartmentHouse = new MSHouse();
                    constructions[i] = apartmentHouse;
                    break;
                }

                case 5: {
                    System.out.println("Отель:");
                    Hotel hotel = new Hotel();
                    constructions[i] = hotel;
                    break;
                }

                case 6: {
                    System.out.println("Ресторан:");
                    Restaurant restaurant = new Restaurant();
                    constructions[i] = restaurant;
                    break;
                }

                default: {
                    System.out.println("Не удалось определить тип сооружения :( Попробуйте повторить попытку. ");
                    i--;
                    break;
                }
            }
        }
        ConstructionUtil.bubleSort(constructions);
        for(Construction construction : constructions){
            construction.ToString();
        }
    }
}
