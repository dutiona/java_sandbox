import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        float f = 3.14F;
        final double d = 3.14159789012345;
        char c = 'e';
        boolean bool = true;

        Integer a_obj = a;
        Float f_obj = f;
        Double d_obj = d;
        Boolean b_obj = bool;

        String str = "" + c;



        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(a);
        arr.add(a_obj);

        System.out.println(String.format("Table content: %s", arr.toString()));


        /*
        Integer a = 5;
        Object o = a;

        System.out.println("Hello world!");

        System.out.println("Yes!");
        */


        Dog dog = new Dog(15, 42);

        measureBarkingNoiseDB(dog);

        try {
            dog.save("dog.txt");
        } catch (IOException e) {
            System.err.println("Error saving file: " + e.getMessage());
        }


        var list_d = new ArrayList<Double>(List.of(
                3.14, 42.5, 18.56, 90.1
        ));

        var lst = list_d.stream()
                .filter(dbl -> dbl > 10)
                .map(dbl -> dbl * 2 )
                .collect(Collectors.toList());
    }

    public void func(Object o, String className) {
        if(className == "class1" && o instanceof class1) {
            class1 cls = (class1) o;
        }
    }

    public static void measureBarkingNoiseDB(BarkingAnimal ba) {
        int measureCount = 15;
        ba.bark(measureCount);
    }
}