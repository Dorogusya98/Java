package main.ru.bstu.ieitus.vt41.dev.util;

import main.ru.bstu.ieitus.vt41.dev.*;

public class ConstructionUtil {

    public static void bubleSort(Construction[] arr) {
        for(int i = arr.length-1; i > 0; i--)
            for(int j = 0; j < i; j++){
                if( arr[i].getConstructionCost() > arr[j+1].getConstructionCost() ){
                    Construction tmp = arr[i];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
    }
}
