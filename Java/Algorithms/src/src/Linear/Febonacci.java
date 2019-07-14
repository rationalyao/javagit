package src.Linear;

/**
 * @author yaoyu  2019/1/10 - 10:47
 */


public class Febonacci {
    public static void main(String[] args) {
        //菲波那切数列：1 1 2 3 5 8 13 21 34 55 89......
        System.out.println(febonacci(20));
    }

    private static int febonacci(int i) {
        if (i==1 || i==2) {
            return 1;
        }else {
            return febonacci(i-1) + febonacci(i-2);
        }


    }
}
