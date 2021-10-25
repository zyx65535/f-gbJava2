package l_two;

import java.sql.Array;

public class Two {

    public static void main(String[] args) {
        int[][] a = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = (int) Math.random() * 10 + 1;
            }
        }
        checkArray(a);

    }

    public static void checkArray(int[][] a) {
        try {
            if (a.length == 4 & a[0].length == 4 & a[1].length == 4 & a[2].length == 4 & a[3].length == 4 ) {
                System.out.println("На вход подан массив 4х4");
            } else {
                throw new Exception("На вход было подано что-то другое.");
            }
        } catch (IndexOutOfBoundsException exc) {
            System.out.println("IndexOutOfBoundsException" + exc.getStackTrace());
        } catch (Exception exception) {
            System.out.println("Exception" + exception.getStackTrace() + exception.getLocalizedMessage());
        } catch (Error e) {
                System.out.println("Error" + e.getStackTrace());
        }

        try {
            int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum = sum + a[i][j];
            }
            if (i == 3) {
                System.out.println(sum);
            }
            }
        } catch (Exception exception2) {
            System.out.println(exception2);
        }

//        if (a.length == 4 & a[0].length == 4 & a[1].length == 4 & a[2].length == 4 & a[3].length == 4 ) {
//            System.out.println("На вход подан массив 4х4");
//        } else {
//            System.out.println("На вход подан массив не 4х4");
//        }

    }
}
