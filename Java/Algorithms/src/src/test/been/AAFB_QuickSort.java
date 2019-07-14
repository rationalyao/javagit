package src.test.been;

import java.util.Arrays;

/**
 * @author yaoyu  2019/7/11 - 9:33
 */


public class AAFB_QuickSort {
    public static void main(String[] args) {
        int[] arr1 = {1,12545,3,6,347,44,4524,52,6,37,3467,35,3};
        quickSort(arr1, 0, arr1.length-1);
        System.out.println(Arrays.toString(arr1));
    }
    
    private static void quickSort(int[] arr, int start, int end) {
        
        if (start < end) {
            
            int low = start;
            int high = end;
            int stand = arr[start];
            
            while (low < high) {
                while (low < high && stand <= arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                
                while (low < high && stand >= arr[low]) {
                    low++;
                }
                
                arr[high] = arr[low];
            }
            
            arr[low] = stand;
            quickSort(arr, start, low);
            quickSort(arr, high+1, end);
        }
    }
}
