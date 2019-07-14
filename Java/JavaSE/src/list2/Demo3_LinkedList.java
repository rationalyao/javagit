package list2;

import java.util.LinkedList;
@SuppressWarnings({"rawtypes","unchecked"})
/**
 * * A:LinkedList类概述
 * * B:LinkedList类特有功能
 * 	* public void addFirst(E e)及addLast(E e)
 * 	* public E getFirst()及getLast()
 * 	* public E removeFirst()及public E removeLast()
 * 	* public E get(int index);
 */


public class Demo3_LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("a");
        list.addFirst("b");
        list.addFirst("c");
        list.addFirst("d");
        list.addLast("e");

        //System.out.println(list.getFirst());
        //System.out.println(list.getLast());
        //System.out.println(list.removeFirst());
        //System.out.println(list.removeLast());
        System.out.println(list.get(1));
        System.out.println(list);
    }
}
