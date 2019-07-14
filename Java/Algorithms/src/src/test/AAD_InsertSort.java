package src.test;

import java.util.Arrays;

/**
 * @author yaoyu  2019/7/8 - 15:02
 */


public class AAD_InsertSort {
    public static void main(String[] args) {
        int[] arr1 = {1 ,35,43,667,4567,4,235243,5,2445};
        System.out.println(Arrays.toString(insertSort(arr1)));
    }
    
    public static int[] insertSort(int[] arr) {
        
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        
        return arr;
    }
}
