package generic;

import bean.Person;
import bean.Tool;

/**
 *  A:案例演示
 * 	* 泛型的由来:通过Object转型问题引入
 * 	* 早期的Object类型可以接收任意的对象类型，但是在实际的使用中，会有类型转换的问题。
 * 	  也就存在这隐患，所以Java提供了泛型来解决这个安全问题。
 */


public class Demo3_Generic {
    public static void main(String[] args) {
        //demo1();
        Tool<String> t = new Tool<>();
        t.show("abc");
        t.showw(true);
        Tool.print("hh");
    }

    private static void demo1() {
        Tool<Person> t = new Tool<>();
        t.setQ(new Person("张三",23));
        System.out.println(t);
    }
}
