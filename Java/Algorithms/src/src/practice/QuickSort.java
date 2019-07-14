package src.practice;

/**
 * @author yaoyu  2019/7/13 - 14:59
 */


import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr_test = {12,54,4235,26,3,45,12,45,256,2};
        QuickSort(arr_test, 0, arr_test.length - 1);
        System.out.println(Arrays.toString(arr_test));
    }

    public static void QuickSort(int[] arr, int start, int end) {

        int low = start;
        int high = end;
        int stand = arr[start];

        if (start < end) {
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
            QuickSort(arr, start, low);
            QuickSort(arr, high+1, end);
        }
    }
}