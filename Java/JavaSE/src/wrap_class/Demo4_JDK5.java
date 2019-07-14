package wrap_class;

/**
 * @author yaoyu  2019/1/11 - 19:46
 * JDK5的新特性：
 *      *自动装箱：把基本类型转换为包装类类型
 *      *自动拆箱：把包装类类型转换为基本类型
 */


public class Demo4_JDK5 {
    public static void main(String[] args) {
        Demo1();
        Demo2();
        Demo3();
    }

    public static void Demo1() {
       //JDK5之前
       int x = 100;
       //将基本数据类型包装成对象,装箱
       Integer i1 = new Integer(x);

       //将对象转换为基本数据类型，拆箱
       int y = i1.intValue();
    }

    public static void Demo2() {
        Integer i1 = 100;          //自动装箱,把基本数据类型转换成对象
        int x = i1 + 200;          //自动拆箱，把对象转化成基本数据类型
        System.out.println(x);
    }

    public static void Demo3() {
        //底层用i1调用的是intValue，但是i3是null，null调用方法就会出现空指针异常
        Integer i1 = null;
        int x = i1 + 100;
        System.out.println(x);
    }
}
