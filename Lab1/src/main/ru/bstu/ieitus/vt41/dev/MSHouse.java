package main.ru.bstu.ieitus.vt41.dev;

import lombok.Data;

import java.util.Scanner;

@Data
public class MSHouse extends House{

    boolean hasElevator;
    boolean hasParking;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("Введите true, если есть лифт, иначе false:");
        hasElevator = scanner.hasNextBoolean();

        System.out.print("Введите true, если есть парковка, иначе false:");
        hasParking = scanner.hasNextBoolean();
    }

    @Override
    public String ToString() {
        return "Многоэтажный дом\n" + super.ToString()
                + "\n Наличие лифта: " + hasElevator
                + "\n Наличие парковки: " + hasParking + "\n";
    }
}
