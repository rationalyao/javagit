package set;

import java.util.LinkedHashSet;

/**
 * @author yaoyu  2019/3/2 - 15:34
 * linkedhashset底层是链表实现的，是set集合整唯一一个能保证怎么存就怎么取的集合对象
 * 因为是hashset的子类，所以也是保证元素唯一的，与hashset的原理一样
 */


public class Demo2_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("a");
        lhs.add("a");
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");

        System.out.println(lhs);
    }
}
