package src.Sort;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/12 - 10:11
 */


public class ShellSort {
    public static void main(String[] args) {
        int[] arr = new int[] {1,34,453,534,5,436,5,6,456,45,64,5,234,235467,6};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        int length = arr.length;
        //控制步长
        for(int d = length/2; d>0; d/=2) {
            //遍历每一个元素
            for (int i = 0; i < length; i++) {
                //从后往前按步长比较
                for (int j = i-d; j>=0; j-=d) {
                    //如果前面的元素大于后面的元素，则交换位置
                    if (arr[j]>arr[j+d]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
    }

}
