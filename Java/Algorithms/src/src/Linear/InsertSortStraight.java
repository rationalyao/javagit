package src.Linear;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/11 - 9:59
 */


public class InsertSortStraight {
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,1,5,0,8,3,7};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        //记录参数数组长度
        int length = arr.length;
        //直接插入排序
        //控制比较轮次
        for (int i = 1; i < length; i++) {
            //控制每轮比较次数
            for (int j = i-1; 0<=j ; j--) {
                //如果前一个元素大于后一个元素，则交换位置
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

    }
}
