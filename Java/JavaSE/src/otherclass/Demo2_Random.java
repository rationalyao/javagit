package otherclass;

import java.util.Random;

/**
 * @author yaoyu  2019/1/18 - 9:01
 */


public class Demo2_Random {
    public static void main(String[] args) {
        Demo1();
        Demo2();
        Demo3();
    }

    private static void Demo3() {
        Random r = new Random();
        //0-9范围内的随机整数
        System.out.println(r.nextInt(10));
    }

    private static void Demo2() {
        //-1244746321
        //1060493871
        Random r = new Random(1000);
        int a = r.nextInt();
        int b = r.nextInt();
        System.out.println(a);
        System.out.println(b);
    }

    private static void Demo1() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt());
        }
    }
}
