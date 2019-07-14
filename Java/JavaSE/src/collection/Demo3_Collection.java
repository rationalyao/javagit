package collection;

import bean.Student;

import java.util.ArrayList;
import java.util.Collection;
@SuppressWarnings({"rawtypes","unchecked"})

/**
 *A:集合的遍历
 *  其实就是依次获取集合中的每一个元素。
 *B:案例演示
 * 	把集合转成数组，可以实现集合的遍历
 * 	toArray()
 */


public class Demo3_Collection {
    public static void main(String[] args) {
        //demo1();
        Collection c = new ArrayList();
        c.add(new Student("张三",23));
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        c.add(new Student("赵六",26));

        Object[] arr = c.toArray();                   //将集合转成数组
        for (int i = 0; i < arr.length; i++) {
            Student s = (Student)arr[i];
            System.out.println(s.getName());
        }
    }

    private static void demo1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Object[] arr = c.toArray();         //将集合转成数组
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            System.out.println(arr[i]);
        }
    }
}
