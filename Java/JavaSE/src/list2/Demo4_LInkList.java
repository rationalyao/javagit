package list2;

import java.util.LinkedList;

/**
 * * 栈
 * 	* 先进后出
 * * 队列
 * 	* 先进先出
 */


public class Demo4_LInkList {
    public static void main(String[] args) {
        //demo1();
        Stack s = new Stack();
        s.in("a");
        s.in("b");
        System.out.println(s.out());
        System.out.println(s.isEmpty());
        System.out.println(s.out());
        System.out.println(s.isEmpty());
    }

    private static void demo1() {
        LinkedList list = new LinkedList();
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");

        /*System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());*/

        while (!list.isEmpty()) {
            System.out.println(list.removeLast());
        }
    }

}
