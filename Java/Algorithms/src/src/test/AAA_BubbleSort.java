package src.test;


import java.util.Arrays;

/**
 * @author yaoyu  2019/7/6 - 8:14
 */


public class AAA_BubbleSort {
    public static void main(String[] args) {
        int[] arr1 = {1,5423,23,123,5324,21};
        System.out.println(Arrays.toString(BubbleSort(arr1)));
    }
    
    public static int[] BubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[length - 1 - i]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr;
            
    }
    
}


