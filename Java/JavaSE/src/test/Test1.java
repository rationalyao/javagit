package test;

import java.util.HashSet;
import java.util.Random;

/**
 * @author yaoyu  2019/3/2 - 15:38
 * 获取10个1-20的随机数，要求随机数不能重复，并把最终的数输出到控制台
 * 1.有random类创建随机数对象
 * 2.需要存储10个不同的随机数，可以用hashset
 * 3.如果hashset的size是小于10，既可以不断的存储，如果大于等于10则停止存储
 * 4.通过random类中的nextint方法获取1-20的随机数,并将这些随机数存储在hashset集合中
 * 5.遍历hashset
 */


public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        HashSet<Integer> hs = new HashSet();
        while (hs.size()<10) {
            hs.add(r.nextInt(20) + 1);
        }
        for (Integer h : hs) {
            System.out.println(h);
        }
    }
}
