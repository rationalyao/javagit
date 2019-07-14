package jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yaoyu  2019/3/1 - 18:35
 *
 * 数组转集合
 * 数组转换成集合虽然不能增加减少元素，但是可以用集合的思想操作数组，也就是可以使用其他集合中的方法
 */


public class Demo4_AsList {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //集合转数组，加泛型
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        String[] arr = list.toArray(new String[10]);  //当集合转换数组时，数组的长度如果是小于等于集合的size时，转换后的数组长度等于集合的size
        System.out.println(Arrays.toString(arr));     //如果数组的长度大于size，分配的数组长度就和指定的长度一样
    }

    private static void demo2() {
        //int[] arr = {11,22,33,44,55};
        //List list = Arrays.asList(arr);     //基本数据类型的数组转换成集合会将整个数组当成一个元素转换
        //System.out.println(list);
        Integer[] arr = {11,22,33,44,55};     //讲数组转换成集合，数组必须是引用数据类型（包装类）
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list);
    }

    private static void demo1() {
        String[] arr = {"a","b","c"};
        List<String> list = Arrays.asList(arr);      //将数组转化成集合
        System.out.println(list);
        //list.add("d");                               //不能添加
        System.out.println(list);
    }
}
