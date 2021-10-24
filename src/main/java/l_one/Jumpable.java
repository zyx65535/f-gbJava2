package l_one;

public interface Jumpable {

    default void jump(double height) {
        System.out.println("Прыгнул");
    }
}
