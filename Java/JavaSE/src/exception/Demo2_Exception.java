package exception;

/**
 * @author yaoyu  2019/3/3 - 15:29
 * * A:异常处理的两种方式
 * 	* a:try…catch…finally
 * 		* try catch
 * 		* try catch finally
 * 		* try finally
 * 	* b:throws
 * * B:try...catch处理异常的基本格式
 * 	* try…catch…finally
 * * C:案例演示
 * 	* try...catch的方式处理1个异常
 */

//try：用来检测异常        catch：用来捕获异常     finally：释放资源
public class Demo2_Exception {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        try {
            int x = d.div(10, 5);
            System.out.println(x);
        }catch (ArithmeticException a) {
            System.out.println("除数出错了！不能为0");
        }
    }
}

class Demo2 {
    //除法运算
    public int div(int a, int b) {
        return a / b;
    }
}

