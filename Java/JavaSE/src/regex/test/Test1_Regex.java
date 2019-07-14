package regex.test;

/**
 * @author yaoyu  2019/1/16 - 12:01
 *  A:案例演示
 * 	* 需求：我有如下一个字符串:”91 27 46 38 50”，请写代码实现最终输出结果是：”27 38 46 50 91”
 *
 * 	分析：
 * 	1.将字符串切割成字符串数组
 * 	2.将字符串转换成数字并将其存储在一个等长度的int数组中
 * 	3.排序
 * 	4.将排序后的结果遍历并拼接成字符串
 */


public class Test1_Regex {
    public static void main(String[] args) {
        String s = "91,27,46,38,50";
        String regex = s;
        //1
        String[] strArr = s.split(",");
        int[] intArr = new int[strArr.length];
        //2
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        //3
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i; j < intArr.length-1; j++) {
                if (intArr[j]>intArr[j+1]) {
                    int temp = intArr[j];
                    intArr[j] = intArr[j+1];
                    intArr[j+1] = temp;
                }
            }
        }
        //Arrays.sort(arr);
        //4
        /*  会产生很多垃圾
        String strNew = "";
        for (int i = 0; i < intArr.length; i++) {
            strNew += intArr[i]+" ";
        }
        System.out.println(strNew);
        */
        //4.采用StringBuilder的append方法节约内存
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length) {
                sb.append(intArr[i]);
            }else {
                sb.append(intArr[i] + " ");
            }
        }
        System.out.println(sb);
    }
}
