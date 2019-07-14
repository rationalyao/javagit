package src.Tree;

/**
 * @author yaoyu  2019/3/4 - 19:07
 */


public class TestArrayBinaryTree {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6,7};
        ArrayBinaryTree abt = new ArrayBinaryTree(arr);
        abt.frontShow();
    }
}
