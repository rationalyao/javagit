package src.Linear;

/**
 * @author yaoyu  2019/1/10 - 10:59
 */

/*
@param n 共有N个盘子
@param from 开始的柱子
@param in 中间的柱子
@param to 目标柱子
无论有多少个盘子，都只认为有两个。上面所有的盘子和最下面的一个盘子
 */

public class Hanoi {
    public static void main(String[] args) {
       hanoi(3,'A','B','C');
    }

    private static void hanoi(int n,char from,char in,char to) {
        if (n==1) {
            System.out.println("把第1个盘子从"+from+"移到"+to);
        }else {
            //移动上面所有盘子到中间位置
            hanoi(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("把第"+n+"个盘子移动到"+to);
            //把上面的所有盘子从中间位置移到目标位置
            hanoi(n-1,in,from,to);
        }
    }
}
