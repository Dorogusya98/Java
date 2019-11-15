# Java
Вариант 5
Создать абстрактный класс Construction (сооружение) 
public abstract void init(Scanner scanner) // считывание параметров с консоли 
public int getConstructionCost(); //  возвращает стоимость возведения сооружения 
public String toString() // возвращается состояние объекта в виде строки 
// (определяется только в наследниках, т.к. // определен в классе Object) 
Построить иерархию классов: Сооружение → Здание → Отель → Ресторан → Дом → Многоквартирный дом → Частный дом 
Написать программу, которая: 
1) Считывает с консоли количество сооружений. 
2) В цикле считывает параметры. Сначала спрашивается тип сооружения и создается объект нужного класса. 
Затем у объекта вызывается метод init() и вводятся характеристики объекта  (основной материал, из которого сделано сооружение, стоимость возведения сооружения и т.д.). 
Метод init() разный у разных классов. 
3) Считанные объекты помещаются в массив. 
4) Массив сооружений сортируется по стоимости возведения и в отсортированном виде выводится на экран (вывод через toString()) 
