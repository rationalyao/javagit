package collection;

import bean.Student;

import java.util.ArrayList;
import java.util.Collection;

@SuppressWarnings({"rawtypes","unchecked"})
/**
 *   A:案例演示
 * 		基本功能演示
 * 		boolean add(E e)
 * 		boolean remove(Object o)
 * 		void clear()
 * 		boolean contains(Object o)
 * 		boolean isEmpty()
 * 		int size()
 *
 * * B:注意:
 * 		collectionXxx.java使用了未经检查或不安全的操作.
 * 		注意:要了解详细信息,请使用 -Xlint:unchecked重新编译.
 * 		java编译器认为该程序存在安全隐患
 * 		温馨提示:这不是编译失败,所以先不用理会,等学了泛型你就知道了
 */

//add方法如果是list集合，一直都返回true，因为list集合中是可以存储重复元素的
//如果是Set集合当存储元素重复时，就会返回false
//ArrayList父类的父类重写toString方法，所以在打印对象的引用时候，输出的结果不是Object类中的toString方法

public class Demo2_Collection {
    public static void main(String[] args) {
        //demo1();
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        c.remove("b");             //删除指定元素
        System.out.println(c);
        System.out.println(c.contains("b"));   //是否包含
        System.out.println(c.contains("a"));
        System.out.println(c.isEmpty());        //是否为空
        System.out.println(c.size());         //获取元素的个数
        c.clear();                    //清空元素
        System.out.println(c);
        System.out.println(c.isEmpty());
    }

    private static void demo1() {
        Collection c = new ArrayList();          //父类引用指向子类对象
        boolean b1 = c.add("abc");
        boolean b2 = c.add(true);                //自动装箱 new Boolean(true);
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student("张三",23));
        boolean b5 = c.add("abc");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        System.out.println(c);
    }

}
