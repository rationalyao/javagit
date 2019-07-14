package generic;

import bean.Person;

import java.util.ArrayList;
import java.util.Iterator;
@SuppressWarnings({"rawtypes","unchecked"})
/**
 * ###16.06_集合框架(泛型概述和基本使用)(掌握)
 * * A:泛型概述
 * * B:泛型好处
 * 	* 提高安全性(将运行期的错误转换到编译期)
 * 	* 省去强转的麻烦
 * * C:泛型基本使用
 * 	* <>中放的必须是引用数据类型
 * * D:泛型使用注意事项
 * 	* 前后的泛型必须一致,或者后面的泛型可以省略不写(1.7的新特性菱形泛型)
 */


public class Demo1_Generic {
    public static void main(String[] args) {
        //demo1();
        //int[] arr = new byte[5];                        //数组要保证前后数据类型一致
        //ArrayList<Person> = new ArrayList<Object>();    //集合的泛型要保证前后数据类型一致
        ArrayList<Object> list = new ArrayList<>();       //新特性，菱形泛型
        ArrayList<Object> list1 = new ArrayList<>();      //泛型最好不要定义object，没有意义
        list1.add("aaa");
        list1.add(true);
    }

    private static void demo1() {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("yy",24));
        list.add(new Person("kk",23));

        Iterator<Person> it = list.iterator();
        while (it.hasNext()) {
            //System.out.println(it.next());
            Person p = (Person)it.next();       //向下转型
            System.out.println(p.getName() + "..." + p.getAge());
        }
    }
}
