package regex;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/16 - 11:45
 */


public class Demo5_Split {
    public static void main(String[] args) {
        Demo1();
        System.out.println("---------------");
        String s = "金三胖.郭美美.李dayone";
        String[] arr = s.split("\\.");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static void Demo1() {
        String s = "金三胖 郭美美 李dayone";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
