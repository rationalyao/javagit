package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/7/13 - 19:15
 */

public class test{
    public static void main(String[] args) {
        int[] arr_test = {1,3154,45,2,6,4,1,52,6,326,43};
        System.out.println(Arrays.toString(BubbleSort(arr_test)));
    }

    public static int[] BubbleSort(int[] arr) {

        int length = arr.length;

        for (int i = 0;i < length - 1; i++) {
            for (int j = 0; j < length - i - 1 ; j ++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
