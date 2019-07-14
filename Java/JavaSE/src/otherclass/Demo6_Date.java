package otherclass;

import java.util.Date;

/**
 * @author yaoyu  2019/1/18 - 17:46
 * A:Date(util)类的概述
 * 	* 类 Date 表示特定的瞬间，精确到毫秒。
 * B:构造方法
 * 	* public Date()
 * 	* public Date(long date)
 * C:成员方法
 * 	* public long getTime()
 * 	* public void setTime(long time)
 */


public class Demo6_Date {
    public static void main(String[] args) {
        //Demo1();
        //Demo2();
        //Demo3();
    }

    private static void Demo3() {
        //设置毫秒值改变了时间对象
        Date d1 = new Date();
        d1.setTime(1000);
        System.out.println(d1);
    }

    private static void Demo2() {
        //通过时间对象获取毫秒值
        Date d1 = new Date();
        System.out.println(d1.getTime());
        //通过系统类的方法获取当前时间的毫秒值
        System.out.println(System.currentTimeMillis());
    }

    private static void Demo1() {
        //无参构造代表的是当前时间
        Date d1 = new Date();
        System.out.println(d1);

        //参数传为0代表的是1970年1月1日
        Date d2 = new Date(0);
        Date d3 = new Date(1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
