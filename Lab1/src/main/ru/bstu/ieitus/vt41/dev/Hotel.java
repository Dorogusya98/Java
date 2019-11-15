package main.ru.bstu.ieitus.vt41.dev;

import lombok.Data;

import java.util.Scanner;

@Data
public class Hotel extends Building {
    int roomCount;

    public Hotel() {
        Scanner scanner = new Scanner(System.in);
        init(scanner);
    }

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("Введите количество комнат:");
        roomCount = scanner.nextInt();
    }

    @Override
    public String ToString() {
        return "Отель\n" + super.ToString()
                + "\n Количество комнат: " + roomCount + "\n";
    }

}
