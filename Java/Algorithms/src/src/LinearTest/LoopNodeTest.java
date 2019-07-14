package src.LinearTest;

import src.Linear.LoopNode;

/**
 * @author yaoyu  2019/1/10 - 9:26
 */


public class LoopNodeTest {
    public static void main(String[] args) {
        LoopNode ln1 = new LoopNode(1);
        LoopNode ln2 = new LoopNode(2);
        LoopNode ln3 = new LoopNode(3);
        LoopNode ln4 = new LoopNode(4);
        System.out.println("-------追加节点-------");
        ln1.after(ln2);
        ln2.after(ln3);
        ln3.after(ln4);
        System.out.println(ln1.getNext().getData());
        System.out.println(ln2.getNext().getData());
        System.out.println(ln3.getNext().getData());
        System.out.println(ln4.getNext().getData());
    }
}
