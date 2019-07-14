package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/10 - 16:51
 */


public class BubbleSort {
    public static void main(String[] args) {
       int[] arr = {11,33,55,22,77,44,66};
       System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    // 冒泡排序
    private static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        //控制轮次数
        for (int i = 0; i < length-1; i++) {
            //控制每轮比较次数，-i为了提高效率
            for (int j = 0; j < length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
