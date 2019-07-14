package list2;

import java.util.LinkedList;

/**
 * @author yaoyu  2019/3/1 - 14:46
 */


public class Stack {
    private LinkedList list = new LinkedList();
    //模拟进栈方法
    public void in(Object obj) {
        list.addLast(obj);
    }

    public Object out() {
        return list.removeLast();
    }

    //模拟栈结构是否为空
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
