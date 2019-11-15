package main.ru.bstu.ieitus.vt41.dev;

import java.util.Scanner;

public abstract class Construction {
    int constructionCost;
    String addressConstruction;

    public abstract void init(Scanner scanner);
    public abstract int getConstructionCost();
    public abstract String ToString();
}
