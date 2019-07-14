package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/12 - 10:28
 */


public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[] {132,2,42,54,235,23,6,543,676,57,245,2345,2345,2,6345,6,45,36121,2,98,8};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        //遍历所有元素
        for (int i = 0; i < arr.length; i++) {
            //初始化每轮最小值的索引
            int minIndex = i;
            //找到每轮最小值索引
            for (int j = i+1; j < arr.length; j++) {
                //同时记录较小数及其索引可以用这种方法，节省时间
                if(arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

}
