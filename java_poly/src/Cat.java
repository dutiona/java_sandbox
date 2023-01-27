import java.io.FileWriter;
import java.io.IOException;

public class Cat extends Animal implements Meow{

    public Cat(int age, int height) {
        super(age, height);

    }
    @Override
    public void meow(int num) {
        System.out.println("Cat meow <" + String.valueOf(num) + "> times!");
    }

    @Override
    public Cat myclone() {
        return new Cat(this.age, this.height);
    }
}
