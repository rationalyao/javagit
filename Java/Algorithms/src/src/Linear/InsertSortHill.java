package src.Linear;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/11 - 10:33
 */


public class InsertSortHill {
    public static void main(String[] args) {
        int[] arr = new int[] {3,5,2,7,8,1,2,0,4,4,3,8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //希尔排序
    public static void shellSort(int[] arr) {
        //记录数组长度
        int length = arr.length;
        //遍历所有步长
        for (int d = length/2; d > 0 ; d/=2) {
            //遍历所有的元素
            for (int i = d; i < length; i++) {
                //遍历本组中所有的元素
                for (int j = i-d; j >= 0; j -= d) {
                    //如果当前元素大于加上步长之后的那个元素
                    if (arr[j] > arr[j+d]) {
                        int temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }

        }
    }
}

