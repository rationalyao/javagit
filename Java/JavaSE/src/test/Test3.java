package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author yaoyu  2019/3/2 - 16:08
 * 将集合中的重复元素去掉
 * 1.创建一个list集合存储若干个重复元素
 * 2.单独定义一个方法取出重复
 * 3.遍历list集合
 */


public class Test3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");

        getSingle(list);
        System.out.println(list);
    }

    public static void getSingle(List<String> list) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.addAll(list);
        list.clear();
        list.addAll(lhs);
    }


}
