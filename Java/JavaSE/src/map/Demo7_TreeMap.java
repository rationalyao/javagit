package map;

import bean.Student;

import java.util.TreeMap;

/**
 * @author yaoyu  2019/3/3 - 14:36
 */


public class Demo7_TreeMap {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>();
        tm.put(new Student("zs",23),"beijing");
        tm.put(new Student("ls",24),"shanghai");
        tm.put(new Student("ww",26),"guagnzhou");
        System.out.println(tm);
    }
}
