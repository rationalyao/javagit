package collection;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"rawtypes","unchecked"})
/**
 * A:案例演示
 * *
 * 		带All的功能演示
 *
 * 		boolean addAll(Collection c)
 * 		boolean removeAll(Collection c)
 * 		boolean containsAll(Collection c)
 * 		boolean retainAll(Collection c)
 */


public class Demo4_CollectionAll {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        //c2.add("a");
        //c2.add("b");
        c2.add("z");

        //取交集，如果调用的集合改变就返回true，如果调用集合不变则返回false
        boolean b = c1.retainAll(c2);         //取交集
        System.out.println(b);
        System.out.println(c1);
    }

    private static void demo3() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("z");

        boolean b = c1.containsAll(c2);          //判断是否包含
        System.out.println(b);
    }

    private static void demo2() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        //c2.add("a");
        //c2.add("b");
        c2.add("z");

        boolean b = c1.removeAll(c2);             //删除的是交集
        System.out.println(b);
        System.out.println(c1);
    }

    private static void demo1() {
        Collection c1 = new ArrayList();
        c1.add("a");
        c1.add("b");
        c1.add("c");
        c1.add("d");

        Collection c2 = new ArrayList();
        c2.add("a");
        c2.add("b");
        c2.add("c");
        c2.add("d");

        c1.addAll(c2);                  //将c2中的每一个元素添加到c1中
        c1.add(c2);                     //将c2看成一个对象添加到c1中国
        System.out.println(c1);
    }
}
