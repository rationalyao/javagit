package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author yaoyu  2019/1/17 - 14:33
 * A:Pattern和Matcher的概述
 * B:模式和匹配器的典型调用顺序
 * 	* 通过JDK提供的API，查看Pattern类的说明
 *
 * 	* 典型的调用顺序是
 * 	* Pattern p = Pattern.compile("a*b");
 * 	* Matcher m = p.matcher("aaaaab");
 * 	* boolean b = m.matches();
 *
 * 	需求：把一个字符串中的手机号码获取出来
 */


public class Demo8_Pattern {
    public static void main(String[] args) {
        //Demo1();
        String s = "我的手机号码是18912345678，曾经用过18987654321，还用过18812345678";

        String regex = "1[3578]\\d{9}";          //手机号码的正则表达式
        /*Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        boolean b = m.matches();
        System.out.println(b);*/

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        /*boolean b = m.find();
        System.out.println(b);
        String s1 = m.group();
        System.out.println(s1);*/
        while (m.find())
            System.out.println(m.group());

    }

    private static void Demo1() {
        //获取到正则表达式
        Pattern p = Pattern.compile("a*b");
        //获取匹配器
        Matcher m = p.matcher("aaaaab");
        boolean b = m.matches();

        //相当于
        System.out.println("aaaaab".matches("a*b"));

        System.out.println(b);
    }

}
