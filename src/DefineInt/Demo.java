package DefineInt;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Numeric> list = new ArrayList<>();
        list.add(new IntegerValue(0));
        list.add(new IntegerValue(-10));
        list.add(new IntegerValue(80));
        list.add(new IntegerValue(90.9));
        list.add(new IntegerValue(90.9));
        list.add(new IntegerValue(90.9));

        extractIntegers(list);
    }


    public static <T extends Numeric> ArrayList<Integer> extractIntegers(ArrayList<T> list) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (T element : list) {
            if (element.isInt())
                integers.add(element.defineInteger());
        }
        System.out.println(integers);
        return integers;
    }
}
