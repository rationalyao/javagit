package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/12 - 9:45
 */


public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1,6,3,4,7,4,3,8,0,19};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            for (int j = i-1; j>=0 ; j--) {
                if(arr[j+1]<arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

}

