package map;

import bean.Student;

import java.util.HashMap;

/**
 * @author yaoyu  2019/3/3 - 13:44
 * 案例演示
 * 	* HashMap集合键是Student值是String的案例
 */


public class Demo5_HashMap {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(new Student("张三",23), "北京");
        //hm.put(new Student("张三",23), "上海");
        hm.put(new Student("李四",24), "广州");
        hm.put(new Student("王五",25), "杭州");

        System.out.println(hm);
    }
}
