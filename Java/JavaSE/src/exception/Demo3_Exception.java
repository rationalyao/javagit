package exception;

/**
 * @author yaoyu  2019/3/3 - 15:41
 */


public class Demo3_Exception {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {11,22,33,44,55};
        try {
            System.out.println(a/b);
            arr = null;
            System.out.println(arr[1]);
        }catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界");
        }catch (Exception e) {
            System.out.println("出错了");
        }
    }
}
