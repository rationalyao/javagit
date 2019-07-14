package src.Tree;

/**
 * @author yaoyu  2019/3/1 - 20:55
 */


public class TreeNode {
    //节点的权
    int value;
    //节点的左儿子
    TreeNode leftNode;
    //节点的右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }
    //设置左儿子
    public void setrightNode(TreeNode rNode) {
        this.rightNode = rNode;
    }
    //设置右儿子
    public void setleftNode(TreeNode lNode) {
        this.leftNode = lNode;
    }

    //前序遍历
    public void frontShow() {
        //先遍历当前节点的内容
        System.out.println(value);
        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }
        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }
    
    //中序遍历树
    public void midShow() {
        if (leftNode != null) {
            leftNode.midShow();
        }
        System.out.println(value);
        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    //后序遍历树
    public void afterShow() {
        if (leftNode != null) {
            leftNode.afterShow();
        }
        if (rightNode != null) {
            rightNode.afterShow();
        }

        System.out.println(value);
    }

    //前序查找
    public TreeNode frontSearch(int value) {
        TreeNode target = null;
        //对比当前节点的值
        if (this.value == value) {
            return this;
        //当前节点的值不是要查找的节点
        }else {
            //查找左二子
            if (leftNode != null) {
                //有可能可以查到，查不到target依然为null
                target = leftNode.frontSearch(value);
            }
            //如果不为空，说明左儿子中已经找到
            if (target != null) {
                return target;
            }
            //查找右儿子
            if (rightNode != null) {
                target = rightNode.frontSearch(value);
            }
        }
        return target;
    }

    public void delete(int i) {
        TreeNode parent = this;
        //判断左儿子
        if (parent.leftNode != null && parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        //判断右儿子
        if (parent.rightNode != null && parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }
        //递归检查并删除左儿子
        parent = leftNode;
        if (parent != null) {
            parent.delete(i);
        }
        //递归检查并删除右儿子
        parent = rightNode;
        if (parent != null) {
            parent.delete(i);
        }
    }
}

