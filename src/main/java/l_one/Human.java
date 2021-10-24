package l_one;

public class Human implements Runnable,Jumpable{
    protected String name;
    protected int age;
    protected double maximumRunLenght;

    public Human(String name, int age, double maximumRunLenght) {
        this.name = name;
        this.age = age;
        this.maximumRunLenght = maximumRunLenght;
    }

    @Override
    public void run(double length) {
        System.out.println(this.name + " побежал");
    }

    @Override
    public void jump(double height) {
        System.out.println(this.name + " прыгнул");
    }
}
