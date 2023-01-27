import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public abstract class Animal implements Save {

    protected int age;
    protected int height;

    Animal(int age, int height) {
        this.age = age;
        this.height = height;
        System.out.println("Animal: age <" + age + ">, height <" + height + ">");
    }

    Animal(int age) {
        this.age = age;
        this.height = 100;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public void save(String filename) throws IOException {
        var fw = new FileWriter(filename);
        fw.write("age: " + this.age + "\n");
        fw.write("height: " + this.height + "\n");
        fw.close();
    }

    public void save(String filename, Date d) throws IOException {
        var new_filename = filename + "-" + d.toString();
        this.save(new_filename);
    }

    public void save(String filename, String custom_extension) {
        // ...
    }

    abstract Animal myclone();
}
