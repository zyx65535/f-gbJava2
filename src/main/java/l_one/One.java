package l_one;

import java.lang.reflect.Array;

import static java.lang.System.out;

public class One {


    public static void main(String[] args) {

        Object[] racePartipicants = new Object[3];
        Human human01 = new Human("Vasya", 11, 2.0);
        Robot robot01 = new Robot("bender", 21, 3.0);
        Cat cat01 = new Cat("murzik", 1, 4.2, 4.1);
        racePartipicants[0] = human01;
        racePartipicants[1] = robot01;
        racePartipicants[2] = cat01;

        Object[] barrier = new Object[3];
        barrier[0] = new RunningTrack(1.1);
        barrier[1] = new Wall(1.1);
        barrier[2] = new RunningTrack(5.1);


        for (int i = 0; i < racePartipicants.length; i++) {
            for (int j = 0; j < barrier.length; j++) {
                if (racePartipicants[i] instanceof Cat ) {
                    if ((barrier[j] instanceof RunningTrack)) {
                        if (((Cat) racePartipicants[i]).maximumRunLenght < ((RunningTrack) barrier[j]).length) {
                            out.println(((Cat) racePartipicants[i]).name + " не смог пробежать " + ((RunningTrack) barrier[j]).length + " и выбывает из гонки");
                            break;
                        } else {
                            ((Cat) racePartipicants[i]).run(((RunningTrack) barrier[j]).length);
                        }
                    } else if (barrier[j] instanceof Wall) {
                        if (((Cat) racePartipicants[i]).maximumJumpHeight < (((Wall) barrier[j]).height)) {
                            out.println(((Cat) racePartipicants[i]).name + " не смог прыгнуть " + ((Wall) barrier[j]).height + " и выбывает из гонки");
                            break;
                        } else {
                            ((Cat) racePartipicants[i]).jump(((Wall) barrier[j]).height);
                        }
                    }
                }





            }
        }
    }
//                        ((Cat) racePartipicants[i]).jump(((Wall) barrier[j]).height);
//                    } else {
//                        out.println("что-то");
//


//                    } else if (barrier[j] instanceof Wall) {
//                        ((Cat) racePartipicants[i]).jump(((Wall) barrier[j]).height);
//                    } else {
//                        out.println("что-то");
//
//                    }
//                    continue;

//
//                } else if (racePartipicants[i] instanceof Human) {
//                    ((Human) racePartipicants[i]).jump(1.1);
//                    ((Human) racePartipicants[i]).run(((Human) racePartipicants[i]).maximumRunLenght);
//                } else if (racePartipicants[i] instanceof Robot) {
//                    ((Robot) racePartipicants[i]).jump(1.2);
//                    ((Robot) racePartipicants[i]).run(((Robot) racePartipicants[i]).maximumRunLenght);
//                } else {
//                    out.println("Для данного типа не перешружены методы jump и run");



//
//            }


}



