package list;

import bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * A:案例演示
 * 向list集合中存储学生对象
 * 	* 通过size()和get()方法结合使用遍历。
 */


public class Demo2_List {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("赵六",26));
        for (int i = 0; i < list.size(); i++) {
            Student s = (Student)list.get(i);
            System.out.println(s.getName() + "..." + s.getAge());            //通过索引获取每一个元素
        }
    }
}
