package src.Tree;

/**
 * @author yaoyu  2019/3/1 - 20:53
 */


public class TestBinaryTree {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给数
        binTree.setRoot(root);
        //创建两个节点
        TreeNode rootL = new TreeNode(2);
        TreeNode rootR = new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setleftNode(rootL);
        root.setrightNode(rootR);
        //为第二层的左节点创建两个子节点
        rootL.setleftNode(new TreeNode(4));
        rootL.setrightNode(new TreeNode(5));
        //为第二层的右节点创建两个子节点
        rootR.setleftNode(new TreeNode(6));
        rootR.setrightNode(new TreeNode(7));
        //前序遍历树
        binTree.frontShow();
        System.out.println("-----");
        //中序遍历树
        binTree.midShow();
        System.out.println("-----");
        //后续遍历树
        binTree.afterShow();
        System.out.println("-----");
        //前序查找
        TreeNode result = binTree.frontSearch(10);
        System.out.println(result);
        System.out.println("-----");
        //删除一个子树
        binTree.delete(4);
        binTree.frontShow();
    }
}
