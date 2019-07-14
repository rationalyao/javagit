package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/10 - 17:06
 */


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[] {3,4,6,7,2,7,2,8,9};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //快速排序
    public static void quickSort(int[] arr, int start, int end) {
        if (start<end) {
            //把数组中的第0个数字作为标准数
            int stard = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //循环找比标准数大的数和比标准数小的数
            while (low<high) {
                //右边的数比标准数大
                //在上边条件成立的循环过程中也可能low=high，所以还需要加low<high
                //因为stard为边界数，所以要加=
                while (low<high && stard<=arr[high]) {
                    high--;
                }
                //使用右边的数替换左边的数
                arr[low] = arr[high];
                //左边的数比标准数小
                while (low<high && arr[low]<= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            //把标准数赋给低所在的位置的元素
            arr[low] = stard;
            //处理所有小的数字
            quickSort(arr,start,low);
            //处理所有大的数字
            quickSort(arr,high+1,end);
            //当start = end，数组排序完毕
        }
    }
}
