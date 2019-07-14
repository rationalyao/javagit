package src.templates;

/**
 * @author yaoyu  2019/1/9 - 19:39
 */


public class Templates3 {
    public static void main(String[] args) {
        //模板五：ifn
        int[] arr = new int[0];
        if (arr == null) {
            System.out.println("--------");
        }
        if (arr != null) {
            System.out.println("--------");
        }
        //变形：inn
        if (arr != null) {
            System.out.println("-----__!!");
        }
    }
}
