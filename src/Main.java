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

        Dog dog2 = dog.myclone();

        measureBarkingNoiseDB(dog);
        printAnimalHeight(dog);

        Animal ann = dog;

        BarkingAnimal barking_animal = (BarkingAnimal) ann;

        try {
            dog.save("dog.txt", new Date(2023, 11, 27));
        } catch (IOException e) {
            System.err.println("Error saving file: " + e.getMessage());
        }


        var list_d = new ArrayList<Double>(List.of(
                3.14, 42.5, 18.56, 90.1
        ));

        var lst = list_d.stream()
                .filter(dbl -> dbl > 10)
                .map(dbl -> dbl * 2)
                .collect(Collectors.toList());



        double dbl = 9.99;
        do_something((int)dbl);

        Double dbl_obj = 9.6542342345453;
        Integer int_obj = dbl_obj.intValue();

        long ent = 429679356;
        do_something_else(ent);

        var farm = make_farm(15, 42);



        var vecdouble = new Vector<Double>();
        var vecint = new Vector<Integer>();
        var varDog = new Vector<Dog>();
        var varAni = new Vector<Animal>();
    }

    public void func(Object o, String className) {
        if (className == "class1" && o instanceof class1) {
            class1 cls = (class1) o;
        }
    }

    public static void measureBarkingNoiseDB(BarkingAnimal ba) {
        int measureCount = 15;
        ba.bark(measureCount);
    }

    public static void printAnimalHeight(Animal an) {
        System.out.println("Animal height: " + String.valueOf(an.getHeight()));
    }

    public static void do_something(int a) {
        int b = a + 13;
    }

    public static void do_something_else(double a) {
        double dbl = a + 15.6;
        System.out.println("Double = " + String.valueOf(a));
    }


    public static ArrayList<Animal> make_farm(int num_dogs, int num_cats) {
        var result = new ArrayList<Animal>();

        for(int i = 0; i < num_dogs; i++) {
            result.add(AnimalFactory.make_animal(AnimalFactory.AnimalType.DogType, 0, 100));
        }

        for(int i = 0; i < num_cats; i++) {
            result.add(AnimalFactory.make_animal(AnimalFactory.AnimalType.CatType, 0, 100));
        }

        return result;
    }
}