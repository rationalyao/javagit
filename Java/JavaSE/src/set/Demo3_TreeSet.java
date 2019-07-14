package set;

import bean.Person;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author yaoyu  2019/3/2 - 16:15
 * treeset集合是用来对元素进行排序的,也可以保证元素的唯一
 */


public class Demo3_TreeSet {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        //demo4();
        //需求：将字符串按照长度排序
        TreeSet<String> ts = new TreeSet<>(new CompareByLen());
        ts.add("aaaaaa");
        ts.add("z");
        ts.add("nba");
        ts.add("cba");

        System.out.println(ts);
    }

    private static void demo4() {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("zhangsan",23));
        ts.add(new Person("lisi",24));
        ts.add(new Person("wangwu",43));
        ts.add(new Person("zhaoliu",23));
        ts.add(new Person("zhouqi",13));

        System.out.println(ts);
    }

    private static void demo3() {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三", 28));
        ts.add(new Person("李四", 21));
        ts.add(new Person("王五", 25));
        ts.add(new Person("赵六", 26));
        ts.add(new Person("周七", 26));

        System.out.println(ts);
    }

    private static void demo2() {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person("张三",28));
        ts.add(new Person("李四",21));
        ts.add(new Person("王五",25));
        ts.add(new Person("赵六",26));
        ts.add(new Person("周七",26));
        System.out.println(ts);
    }

    private static void demo1() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        System.out.println(ts);
    }
}

class CompareByLen implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int num = s1.length() - s2.length();
        return num == 0 ? s1.compareTo(s2) : num;
    }
}
