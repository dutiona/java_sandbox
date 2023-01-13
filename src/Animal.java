public class Animal {

    protected int age;
    protected int height;

    Animal(int age, int height) {
        this.age = age;
        this.height = height;
        System.out.println("Animal: age <" + age + ">, height <" + height + ">");
    }
}
