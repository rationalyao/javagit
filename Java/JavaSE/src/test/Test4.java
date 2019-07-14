package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/**
 * @author yaoyu  2019/3/2 - 18:15
 * 在一个集合中存储了无序并重复的字符串，定义一个方法，让其有序（字典顺序），而且不能去除重复
 */


public class Test4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        list.add("heima");
        list.add("bbbb");
        list.add("aaa");

        sort(list);

        System.out.println(list);
    }

    public static void sort(List<String> list) {
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num = s1.compareTo(s2);
                return num == 0? 1 : num;
            }
        });
        ts.addAll(list);
        list.clear();
        list.addAll(ts);
    }



}
