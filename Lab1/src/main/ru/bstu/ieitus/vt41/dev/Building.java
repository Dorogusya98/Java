package main.ru.bstu.ieitus.vt41.dev;

import lombok.Data;

import java.util.Scanner;

@Data
public class Building extends Construction{
    String nameBilding;

    public Building(){
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }
    @Override
    public void init(Scanner scanner) {

    System.out.print("Введите адресс:");
    addressConstruction = scanner.next();

    System.out.print("Введите стоимость возведения сооружения:");
    constructionCost = scanner.nextInt();

    System.out.print("Введите название:");
    nameBilding = scanner.next();
    }

    @Override
    public int getConstructionCost() {
        return constructionCost;
    }

    @Override
    public String ToString() {
        return " Название здания: " + nameBilding +
                "\n Адресс возведения здания: " + addressConstruction +
                "\n Стоимость возведения здания: " + constructionCost + "\n";
    }
}
