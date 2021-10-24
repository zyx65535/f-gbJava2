package l_one;

public class Cat implements Runnable,Jumpable{
    protected String name;
    protected int age;
    protected double maximumJumpHeight;
    protected double maximumRunLenght;

    public Cat(String name, int age, double maximumJumpHeight, double maximumRunLenght) {
        this.name = name;
        this.age = age;
        this.maximumJumpHeight = maximumJumpHeight;
        this.maximumRunLenght = maximumRunLenght;
    }

    @Override
    public void run(double length) {
        if (length > this.maximumRunLenght) {
            System.out.println(this.name + " не может пробежать " + length + " м");
        } else {
            System.out.println(this.name + " пробежал " + length + " м.");
        }
    }

    @Override
    public void jump(double height) {
        if (height > maximumJumpHeight) {
            System.out.println(this.name + " не может перепрыгнуть " + height + " м");
        } else {
            System.out.println(this.name + " перепрыгнул " + height + " м");
        }
    }
}
