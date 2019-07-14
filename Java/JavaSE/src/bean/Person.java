package bean;

/**
 * @author yaoyu  2019/3/1 - 10:09
 */


public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
        super();
    }

    @Override
    public int hashCode() {
        final int num = 38;
        return name.hashCode() * num + age;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("执行了吗");
        Person p = (Person)obj;
        return this.name.equals(p.name) && this.age == p.age;

    }

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //按照年龄排序
    /*@Override
    public int compareTo(Person o) {
        int num = this.age - o.age;
        return num == 0 ? this.name.compareTo(o.name) : num;
    }*/

    //按照姓名排序
    /*@Override
    public int compareTo(Person o) {
        int num = this.name.compareTo(o.name);
        return num == 0 ? this.age - o.age : num;
    }*/

    @Override
    public int compareTo(Person o) {
        int length = this.name.length() - o.name.length();
        int num = length == 0 ? this.name.compareTo(o.name) : length;
        return num == 0 ? this.age - o.age : num;
    }
}
