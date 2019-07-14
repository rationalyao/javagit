package collection;

import bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressWarnings({"rawtypes","unchecked"})
/**
 * A:迭代器概述
 *  集合是用来存储元素,存储的元素需要查看,那么就需要迭代(遍历)
 * B:案例演示
 * 	迭代器的使用
 */


public class Demo5_Iterator {
    public static void main(String[] args) {
        //demo1();
        Collection c = new ArrayList();
        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        c.add(new Student("赵六",26));
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.getName()+ "..." + s.getAge());
        }
    }

    private static void demo1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        //对集合中的元素迭代（遍历）
        /*Iterator it = c.iterator();          //获取迭代器
        boolean b1 = it.hasNext();           //判断集合中是否有元素，有就返回true
        Object obj1 = it.next();
        System.out.println(b1);
        System.out.println(obj1);

        boolean b2 = it.hasNext();           //判断集合中是否有元素，有就返回true
        Object obj2 = it.next();
        System.out.println(b2);
        System.out.println(obj2);*/

        Iterator it = c.iterator();          //获取迭代器
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
