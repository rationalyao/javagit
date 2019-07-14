package wrap_class;

/**
 * @author yaoyu  2019/1/11 - 19:59
 */


public class Demo5_Integer {
    public static void main(String[] args) {
        Demo1();
        Demo2();
    }

    public static void Demo1() {
        Integer i1 = new Integer(97);
        Integer i2 = new Integer(97);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("-----------------");

        Integer i3 = 97;
        Integer i4 = 97;
        System.out.println(i3==i4);
        //重写了equals方法，只需别叫int值
        System.out.println(i3.equals(i4));
        System.out.println("-----------------");
    }

    public static void Demo2() {
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        System.out.println("-----------------");

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        /* -128-127是byte的取值范围，如果在这个取值范围内，自动装箱就不会信创建对象，而是从常量池中获取
           如果超过了byte的取值范围就会再创建对象
        */
    }


}
