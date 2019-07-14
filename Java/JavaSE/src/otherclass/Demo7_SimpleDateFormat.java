package otherclass;

import java.text.DateFormat;

/**
 * @author yaoyu  2019/1/18 - 18:22
 */


public class Demo7_SimpleDateFormat {
    public static void main(String[] args) {
        Demo1();

    }

    private static void Demo1() {
        //DateFormat df = new DateFormat();     DateFormat 是抽象类，不允许实例化
        //相当于父类引用指向子类对象，右边的方法返回一个子类对象
        //DateFormat df1 = new SimpleDateFormat();
        DateFormat df1 = DateFormat.getDateInstance();
    }
}
