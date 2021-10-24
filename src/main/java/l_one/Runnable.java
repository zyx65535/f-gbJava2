package l_one;

public interface Runnable {

    default void run(double lenght) {

        System.out.println("Пробежал" + lenght);
    }
}
