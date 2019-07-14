package exception;

/**
 * @author yaoyu  2019/3/3 - 15:59
 */


public class Demo5_Throwable {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
        }catch (Exception e) {
            //System.out.println(e.getMessage());
            //System.out.println(e);
            e.printStackTrace();
        }
    }
}
