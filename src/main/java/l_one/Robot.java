package l_one;

public class Robot implements Runnable,Jumpable{
    protected String name;
    protected int age;
    protected double maximumRunLenght;

    public Robot(String name, int age, double maximumRunLenght) {
        this.name = name;
        this.age = age;
        this.maximumRunLenght = maximumRunLenght;

    }

    @Override
    public void run(double lenght) {
        System.out.println(this.name + " побежал");
    }

    @Override
    public void jump(double height) {
        System.out.println(this.name + " прыгнул");
    }
}
