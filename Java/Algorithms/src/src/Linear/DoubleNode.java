package src.Linear;

/**
 * @author yaoyu  2019/1/10 - 9:34
 */


public class DoubleNode {
    //上一个节点
    DoubleNode pre = this;
    //下一个节点
    DoubleNode next = this;
    //节点数据
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void after(DoubleNode doubleNode) {
        //找到当前节点的下下一个节点
        DoubleNode nextNext = next;
        //把新节点作为当前节点的下一个节点
        this.next = doubleNode;
        //把当前节点作为新节点的前一个节点
        doubleNode.pre = this;
        //让原来的下一个节点作为新节点的下一个节点
        doubleNode.next = nextNext;
        //原来节点的上一个节点为新节点
        nextNext.pre = doubleNode;
    }

    //获取节点数据
    public int getData() {
        return this.data;
    }

    //获取下一个节点
    public DoubleNode getPre() {
        return this.pre;
    }

    //获取上一个节点
    public DoubleNode getNext() {
        return this.next;
    }

}
