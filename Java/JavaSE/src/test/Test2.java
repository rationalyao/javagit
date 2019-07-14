package test;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author yaoyu  2019/3/2 - 15:48
 * 1.创建scanner对象
 * 2.创建hashset对象，将字符存储去掉重复
 * 3.将字符串转换成字符数组，获取每一个字符存储在hashset集合中，自动去重复
 * 4.遍历hashset，打印每一个字符
 */


public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        HashSet<Character> hs = new HashSet<>();
        String line = sc.nextLine();
        char[] arr = line.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
        for (Character h : hs) {
            System.out.println(h);
        }
    }
}
