package exception;

/**
 * @author yaoyu  2019/3/3 - 14:40
 * * A:JVM默认是如何处理异常的
 * 	* main函数收到这个问题时,有两种处理方式:
 * 	* a:自己将该问题处理,然后继续运行
 * 	* b:自己没有针对的处理方式,只有交给调用main的jvm来处理
 * 	* jvm有一个默认的异常处理机制,就将该异常进行处理.
 * 	* 并将该异常的名称,异常的信息.异常出现的位置打印在了控制台上,同时将程序停止运行
 * * B:案例演示
 * 	* JVM默认如何处理异常
 */


public class Demo1_Exception {
    public static void main(String[] args) {
        //demo1();
        Demo d = new Demo();
        int x = d.div(10,0);
        System.out.println(x);
    }

    private static void demo1() {
        int[] arr = {11,22,33,44,55};
        //arr = null;
        System.out.println(arr[10]);
    }
}

class Demo {
    //除法运算
    public int div(int a, int b) {
        return a/b;
    }
}