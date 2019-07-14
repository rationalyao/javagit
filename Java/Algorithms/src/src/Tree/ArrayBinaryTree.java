package src.Tree;

/**
 * @author yaoyu  2019/3/4 - 19:00
 */


public class ArrayBinaryTree {

    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    public void frontShow() {
        frontShow(0);
    }

    public void frontShow(int index) {
        if (data == null || data.length == 0) {
            return;
        }
        //先遍历当前节点的内容
        System.out.println(data[index]);
        //2*index + 1
        if (2*index + 1< data.length) {
            frontShow(2*index + 1);
        }
        if (2*index + 2 < data.length) {
            frontShow(2*index + 2);
        }
    }
}
