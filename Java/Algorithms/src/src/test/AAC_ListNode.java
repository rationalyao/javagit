package src.test;

import src.test.been.Node;

/**
 * @author yaoyu  2019/7/6 - 15:27
 */


public class AAC_ListNode {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.setData(1);

        Node node2 = new Node();
        node2.setData(2);

        Node node3 = new Node();
        node3.setData(3);
        
        node1.setNext(node2);
        node2.setNext(node3);

        System.out.println(reverseList(node3).getData());
        //System.out.println(reverseList(node1).getNext().getNext());;
        System.out.println(rreverseList(node1).getData());
    }
    
    // 非递归
    public static Node reverseList(Node node) {
        
        Node pre = null;
        Node next = null;
        
        while (node != null) {
            
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
            
        }
        return pre;
    }
    
    // 递归
    public static Node rreverseList(Node head) {
        
        if (head == null || head.next == null) return head; 
            
            Node temp = head.next;
            Node newHead = rreverseList(head.next);
            temp.next = head;
            head.next = null;
            
            return newHead;
        
    }
    
    
}
