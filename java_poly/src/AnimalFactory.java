import java.util.ArrayList;

public class AnimalFactory {
    enum AnimalType {
        CatType,
        DogType,
    }

    public static Animal make_animal(AnimalType type, int age, int height) {
        switch (type) {
            case DogType -> {
                return new Dog(age, height);
            }
            case CatType -> {
                return new Cat(age, height);
            }
        }
        throw new RuntimeException("Unsupported animal type!");
    }
}
