package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author yaoyu  2019/2/28 - 9:56
 */


public class Demo4_ListIterator {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");                            //Object obj = new String();
        list.add("b");
        list.add("world");
        list.add("c");
        list.add("d");
        list.add("e");

        ListIterator lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());          //获取元素并将指针向后移动
        }

        System.out.println("-------------------------------");

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());          //获取元素并将指针向前移动
        }
    }
}
