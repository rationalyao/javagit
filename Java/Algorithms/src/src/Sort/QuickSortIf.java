package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/10 - 19:29
 */


public class QuickSortIf {
    public static void main(String[] args) {
        int[] arr = new int[] {2,1,3,5,6,4,3,45,8,0};
        System.out.println(Arrays.toString(arr));
        QuickSortIf(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void QuickSortIf(int[] arr,int start,int end) {
        int stand = arr[start];
        int low = start;
        int high = end;
        while (low < high) {
            while(low<high && stand<=arr[high]) {
                high--;
            }
            arr[low] = arr[high];

            while(low<high && stand>=arr[low]) {
               low++;
            }
            arr[high] = arr[low];
        }
        arr[high] = stand;
    }
}
