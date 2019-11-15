package main.ru.bstu.ieitus.vt41.dev;

import lombok.Data;

import java.util.Scanner;

@Data
public class House extends Construction{
    int floorCount;
    int peopleCount;

    @Override
    public void init(Scanner scanner) {
        System.out.print("Введите адресс:");
        addressConstruction = scanner.next();

        System.out.print("Введите стоимость возведения сооружения:");
        constructionCost = scanner.nextInt();

        System.out.print("Введите количество этажей:");
        floorCount = scanner.nextInt();

        System.out.print("Введите количество жильов");
        peopleCount = scanner.nextInt();
    }

    @Override
    public int getConstructionCost() {
        return constructionCost;
    }

    @Override
    public String ToString() {
        return " Адресс возведения здания: " + addressConstruction +
                "\n Стоимость возведения здания: " + constructionCost +
                "\n Количество этажей: " + floorCount + "\n";
    }
}
