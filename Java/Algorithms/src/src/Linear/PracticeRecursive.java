package src.Linear;

/**
 * @author yaoyu  2019/1/10 - 10:35
 */


public class PracticeRecursive {
    public static void main(String[] args) {
        print(3);
    }

    private static void print(int i) {
        if (i > 0) {
            System.out.println(i);
            print(i-1);
        }
    }

}
