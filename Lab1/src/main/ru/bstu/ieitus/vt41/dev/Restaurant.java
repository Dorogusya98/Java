package main.ru.bstu.ieitus.vt41.dev;

import lombok.Data;

import java.util.Scanner;

@Data
public class Restaurant extends Building {
    int seatsCount;

    @Override
    public void init(Scanner scanner) {
        super.init(scanner);

        System.out.print("Введите количество столов: ");
        seatsCount = scanner.nextInt();
    }

    @Override
    public String ToString() {
        return "Ресторан\n" + super.ToString()
                + "\n Количество столов: " + seatsCount + "\n";
    }
}
