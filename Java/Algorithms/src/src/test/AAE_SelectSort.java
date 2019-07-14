package src.test;

import java.util.Arrays;

/**
 * @author yaoyu  2019/7/8 - 17:16
 */


public class AAE_SelectSort {
    public static void main(String[] args) {
        
        int[] arr1 = {1,43,5,2,54,236,34734,75,35,252};

        System.out.println(Arrays.toString(selectSort(arr1)));
    }
    
    public static int[] selectSort(int[] arr) {

        int length = arr.length;
        
        for (int i = 0; i < length; i++) {
            
            int min = i;
            
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[min]) {
                    int temp = arr[j];
                    arr[j] = arr[min];
                    arr[min] = temp;
                }    
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        
        return arr;
    }
}
