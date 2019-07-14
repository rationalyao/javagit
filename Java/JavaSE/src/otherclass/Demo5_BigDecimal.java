package otherclass;

import java.math.BigDecimal;

/**
 * @author yaoyu  2019/1/18 - 10:41
 * A:BigDecimal的概述
 * 	* 由于在运算的时候，float类型和double很容易丢失精度，演示案例。
 * 	* 所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 * 	* 不可变的、任意精度的有符号十进制数。
 * B:构造方法
 * 	* public BigDecimal(String val)
 * C:成员方法
 * 	* public BigDecimal add(BigDecimal augend)
 * 	* public BigDecimal subtract(BigDecimal subtrahend)
 * 	* public BigDecimal multiply(BigDecimal multiplicand)
 * 	* public BigDecimal divide(BigDecimal divisor)
 * D:案例演示
 * 	* BigDecimal类的构造方法和成员方法使用
 */


public class Demo5_BigDecimal {
    public static void main(String[] args) {
        /*BigDecimal bd1 = new BigDecimal(2.0);           //这种方式在开发中不推荐，不精确
        BigDecimal bd2 = new BigDecimal(1.1);
        System.out.println(bd1.subtract(bd2));*/
        //Demo1();
        //Demo2();


    }

    private static void Demo2() {
        //这种方式在开发中也是推荐的
        BigDecimal bd1 = BigDecimal.valueOf(2.0);
        BigDecimal bd2 = BigDecimal.valueOf(1.1);
        System.out.println(bd1.subtract(bd2));
    }

    private static void Demo1() {
        //通过构造中传入字符串的方式，开发时推荐
        BigDecimal bd1 = new BigDecimal("2.0");           //这种方式在开发中不推荐，不精确
        BigDecimal bd2 = new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2));
    }
}
