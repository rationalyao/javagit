package collection;

import bean.Student;

/**
 * @author yaoyu  2019/1/18 - 18:43
 * A:案例演示
 * 	* 需求：我有5个学生，请把这个5个学生的信息存储到数组中，并遍历数组，获取得到每一个学生信息。
 * *
 * 		Student[] arr = new Student[5];					//存储学生对象
 * 		arr[0] = new Student("张三", 23);
 * 		arr[1] = new Student("李四", 24);
 * 		arr[2] = new Student("王五", 25);
 * 		arr[3] = new Student("赵六", 26);
 * 		arr[4] = new Student("马哥", 20);
 *
 * 		for (int i = 0; i < arr.length; i++) {
 * 			System.out.println(arr[i]);
 * 		}
 *
 * B:画图演示
 * 	* 把学生数组的案例画图讲解
 * 	* 数组和集合存储引用数据类型,存的都是地址值
 */


public class Demo1_Array {
    public static void main(String[] args) {
        //int[] arr = new int[5];                  //创建基本数据类型数组
        Student[] arr = new Student[5];            //创建引用类型数组
        arr[0] = new Student("张三",23);  //创建一个学生对象存储在数组的第1个位置
        arr[1] = new Student("李四",24);  //创建一个学生对象存储在数组的第2个位置
        arr[2] = new Student("王五",25);  //创建一个学生对象存储在数组的第3个位置

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
