package exception;

/**
 * @author yaoyu  2019/3/4 - 14:19
 * * A:throws的方式处理异常
 * 	* 定义功能方法时，需要把出现的问题暴露出来让调用者去处理。
 * 	* 那么就通过throws在方法上标识。
 * * B:案例演示
 * 	* 举例分别演示编译时异常和运行时异常的抛出
 */


public class Demo6_Exception {
    public static void main(String[] args) throws Exception{
        Person p = new Person();
        p.setAge(-17);
        System.out.println(p.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if (age>0 && age<=150) {
            this.age = age;
        }else {
            throw new Exception("年龄非法");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
