package list2;

import bean.Person;

import java.util.ArrayList;

/**
 * @author yaoyu  2019/3/1 - 18:51
 *
 * A:案例演示
 * 	* 集合嵌套之ArrayList嵌套ArrayList
 *
 * 	案列：
 * 	我们有学科，学科又分为若干个班级，整个学科是一个大集合，若干个班级分为每一个小集合
 */


public class Demo5_ArrayListArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Person>> list = new ArrayList<>();
        ArrayList<Person> first = new ArrayList<>();        //创建第一个班级
        first.add(new Person("张三",23));
        first.add(new Person("李四",24));
        first.add(new Person("王五",25));

        ArrayList<Person> second = new ArrayList<>();
        second.add(new Person("yy",23));
        second.add(new Person("kk",24));
        second.add(new Person("ww",25));

        list.add(first);
        list.add(second);
        for (ArrayList<Person> people : list) {
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }
}
