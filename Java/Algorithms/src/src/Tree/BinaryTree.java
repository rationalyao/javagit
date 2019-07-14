package src.Tree;

/**
 * @author yaoyu  2019/3/1 - 20:52
 */


public class BinaryTree {

    TreeNode root;

    //设置根节点
    public void setRoot(TreeNode root) {
        this.root = root;
    }
    //获取根节点
    public TreeNode getRoot() {
        return root;
    }
    
    public void frontShow() {
        if (root != null) {
            root.frontShow();
        }
    }

    public void midShow() {
        if (root != null) {
            root.midShow();
        }
    }

    public void afterShow() {
        if (root != null) {
            root.afterShow();
        }
    }

    public TreeNode frontSearch(int value) {
        return root.frontSearch(value);
    }

    //删除一棵子树
    public void delete(int i) {
        if (root.value == i) {
            root = null;
        }else {
            root.delete(i);
        }
    }


}
