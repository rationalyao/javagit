package src.Sort;

import src.Linear.Myqueue;

import java.util.Arrays;
/**
 * @author yaoyu  2019/1/14 - 9:11
 */


public class RadixQueueSort {
    public static void main(String[] args) {
        int[] arr =new int[] {1,25,46,5,332,45,7,68,8,667};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void radixSort(int[] arr) {
        //1.找到存数组中最大的数字
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
        }
        //2.(重要！！！！！)计算最大数是几位数
        int maxLength = (max+"").length();
        //用于临时存储临时数据的队列的数组
        Myqueue[] temp = new Myqueue[10];
        //为队列数组赋值
        for (int i = 0; i < temp.length; i++) {
            temp[i] = new Myqueue();
        }
        //根据最大长度的数决定比较的次数
        for (int i=0, n=1; i<maxLength; i++, n*=10) {
            //把每一个数字分别计算余数
            for (int j=0; j<arr.length; j++) {
                //计算余数
                int remainder = arr[j]/n%10;
                //把点钱遍历的数据放入指定的队列中
                temp[remainder].add(arr[j]);
            }
            //记录取的数字的元素需要放的位置
            int index = 0;
            //把所有队列中数字取出来
            for (int k = 0; k < temp.length; k++) {
                //循环取出元素
                while (!temp[k].isEmpty()) {
                    //取出元素
                    arr[index] = temp[k].poll();
                    //记录下一个位置
                    index++;
                }
            }
        }
    }
}
