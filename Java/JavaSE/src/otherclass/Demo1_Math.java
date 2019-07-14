package otherclass;

/**
 * @author yaoyu  2019/1/17 - 19:17
 * A:Math类概述
 * 	* Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。
 * B:成员方法
 * 	* public static int abs(int a)
 * 	* public static double ceil(double a)
 * 	* public static double floor(double a)
 * 	* public static int max(int a,int b) min自学
 * 	* public static double pow(double a,double b)
 * 	* public static double random()
 * 	* public static int round(float a) 参数为double的自学
 * 	* public static double sqrt(double a)
 */


public class Demo1_Math {
    public static void main(String[] args) {
        System.out.println(Math.PI);                  //π
        System.out.println(Math.abs(-10));            //取绝对值
        System.out.println(Math.ceil(12.3));
        System.out.println(Math.ceil(12.99));         //天花板,向上取整，但是结果是一个double值
        System.out.println(Math.floor(12.99));        //地板，向下取整，记过是一个double值
        System.out.println(Math.max(12.4,12.9));      //获取两个数中最大值（类型相同）
        System.out.println(Math.pow(3,3));            //3的3次方
        System.out.println(Math.random());            //生成0.0 - 1.0之间的小数，左闭右开
        System.out.println(Math.round(3.5));          //四舍五入
        System.out.println(Math.sqrt(4));             //开平方
        System.out.println(Math.sqrt(2));
    }
}
