package src.LinearTest;

import src.Linear.DoubleNode;

/**
 * @author yaoyu  2019/1/10 - 9:53
 */


public class DoubleNodeTest {
    public static void main(String[] args) {
        DoubleNode dn1 = new DoubleNode(1);
        DoubleNode dn2 = new DoubleNode(2);
        DoubleNode dn3 = new DoubleNode(3);
        DoubleNode dn4 = new DoubleNode(4);

        dn1.after(dn2);
        dn2.after(dn3);
        dn3.after(dn4);
        System.out.println(dn3.getNext().getData());
        System.out.println(dn3.getPre().getData());
    }
}
