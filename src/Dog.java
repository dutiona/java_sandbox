import java.io.FileWriter;
import java.io.IOException;

public class Dog extends Animal implements BarkingAnimal, Save {
    Dog(int age, int height) {
        super(age, height);
        System.out.println("Dog: age <" + age + ">, height <" + height + ">");
    }

    @Override
    public void bark(int num) {
        System.out.println("Dog is barking <" + num + "> times!");
    }

    @Override
    public void save(String filename) throws IOException {
        var fw = new FileWriter(filename);
        fw.write("age: " + this.age + "\n");
        fw.write("height: " + this.height + "\n");
        fw.close();
    }
}
