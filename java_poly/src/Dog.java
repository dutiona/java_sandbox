import java.io.FileWriter;
import java.io.IOException;

public class Dog extends Animal implements BarkingAnimal {
    Dog(int age, int height) {
        super(age, height);
        System.out.println("Dog: age <" + age + ">, height <" + height + ">");
    }

    @Override
    public void bark(int num) {
        System.out.println("Dog is barking <" + num + "> times!");
    }

    public Dog myclone() {
        return new Dog(this.age, this.height);
    }
}
