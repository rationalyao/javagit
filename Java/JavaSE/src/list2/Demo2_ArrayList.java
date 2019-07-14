package list2;

import bean.Person;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings({"rawtypes","unchecked"})
/**
 * A:案例演示
 * 	需求：ArrayList去除集合中自定义对象元素的重复值(对象的成员变量值相同)
 * B:注意事项
 * 	重写equals()方法的
 * 	contains、remove方法判断是否包含底层依赖的是equals方法
 */


public class Demo2_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Person("张三",23));
        list.add(new Person("张三",23));
        list.add(new Person("李四",23));
        list.add(new Person("李四",23));
        list.add(new Person("李四",23));

        ArrayList newList = getSingle(list);
        System.out.println(newList);
    }
    public static ArrayList getSingle(ArrayList list) {
        ArrayList newList = new ArrayList();         //1.创建新集合
        Iterator it = list.iterator();              //2.根据传入的集合（老集合）获取迭代器
        while (it.hasNext()) {                       //3.遍历老集合
            Object obj = it.next();                  //记录每一个元素
            if (!newList.contains(obj)) {
                newList.add(obj);
            }
        }

        return newList;

    }
}
