package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/14 - 9:11
 */


public class RadixSort {
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
        //用于临时存储临时数据的数组
        int[][] temp = new int[10][arr.length];
        //根据最大长度的数决定比较的次数
        for (int i=0, n=1; i<maxLength; i++, n*=10) {
            //用于记录在temp中相应的数组中存放数字的数量
            int[] counts = new int[10];
            for (int j=0; j<arr.length; j++) {
                //计算余数
                int remainder = arr[j]/n%10;
                //把点钱遍历的数据放入指定的数组中
                temp[remainder][counts[remainder]] = arr[j];
                counts[remainder]++;
            }
            //记录取的数字的元素需要放的位置
            int index = 0;
            //把数字取出来
            for (int j = 0; j < counts.length; j++) {
                //记录数量的数组中当前余数记录的数量不为零
                if (counts[j] != 0) {
                    //循环取出元素
                    for (int k = 0; k < counts[j]; k++) {
                        //取出元素
                        arr[index] = temp[j][k];
                        index++;
                    }
                    //把数量置为零
                    counts[j] = 0;
                }

            }
        }
    }
}
