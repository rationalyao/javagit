package set;

import bean.Person;

import java.util.HashSet;

/**
 * @author yaoyu  2019/3/2 - 14:02
 * set集合无索引，不可以重复，存取顺序不一致，无序。
 */


public class Demo1_HashSet {
    public static void main(String[] args) {
        //demo1();
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",23));
        hs.add(new Person("李四",24));
        hs.add(new Person("王五",25));
        hs.add(new Person("王五",25));

        System.out.println(hs.size());
        System.out.println(hs);
    }

    private static void demo1() {
        HashSet<String> hs = new HashSet<>();      //创建HashSet对象
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");                  //当向set集合中存储重复元素时，返回为false
        hs.add("b");
        hs.add("c");
        hs.add("d");
        hs.add("e");
        System.out.println(b1);                    //HashSet的继承体系中有重写toString方法
        System.out.println(b2);
        System.out.println(hs);

        for (String h : hs) {
            System.out.println(h);                 //只要能用迭代器迭代的，就可以使用增强for循环遍历
        }
    }
}
