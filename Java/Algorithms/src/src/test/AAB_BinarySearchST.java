package src.test;

/**
 * @author yaoyu  2019/7/6 - 9:15
 */


public class AAB_BinarySearchST {
    public static void main(String[] args) {
        int[] arr1 = {1,4,6,88,99,100};
        System.out.println(BinarySearchST(arr1, 88));
        System.out.println(RRinarySearchST(arr1, 1, 0, 5));
    }
    
    // 二分查找
    public static int BinarySearchST(int[] arr, int des) {
        int low = 0;
        int height = arr.length - 1;
        
        while (low < height) {
            int middle = (low + height)/2;
            
            if (arr[middle] == des) {
                return middle;
            }else if (arr[middle] < des){
                low = middle;
            }else {
                height = middle;
                middle = low;
            }
        }
        return -1;
    }
    
    // 递归二分查找
    public static int RRinarySearchST (int[] arr, int des, int low , int height) {
        
            int middle = (low + height)/2;
            
            if (arr[middle] == des) {
                return middle;
            }else if (arr[middle] > des) {
                return RRinarySearchST(arr, des, low, middle - 1);
            }else {
                return RRinarySearchST(arr, des, middle - 1, height);
            }
    }
}
