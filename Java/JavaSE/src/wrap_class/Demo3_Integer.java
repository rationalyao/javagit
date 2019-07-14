package wrap_class;

/**
 * @author yaoyu  2019/1/11 - 18:38
 */


public class Demo3_Integer {
    public static void main(String[] args) {
       Demo1();
       System.out.println("-------------");
       Demo2();
       System.out.println("-------------");
       Demo3();
    }

    public static void Demo1() {
        //int ---> String
        int i = 100;
        //1.（推荐）整数类型转化为字符串
        String s1 = i + "";
        System.out.println(s1);
        //2.（推荐）使用valueOf方法将整数类型转化成字符串
        String s2 = String.valueOf(i);
        System.out.println(s2);

        //3.利用Integer和toString方法
        Integer i2 = new Integer(i);
        String s3 = i2.toString();
        System.out.println(s3);

        //4.直接利用
        String s4 = Integer.toString(i);
        System.out.println(s4);
    }

    public static void Demo2() {
        //String ---> int
        String s = "200";

        //1.(推荐)利用Integer.parseInt(String s)
        /*基本数据类型有八种，其中七种都有parseXxx方法，可以将其中的字符串表现形式转换成基本数据类型
          char的包装类没有,字符串到字符的转换可以通过toCharArray()就可以吧字符串转化为字符数组
        */

        int n = Integer.parseInt(s);
        System.out.println(n);

        //2.利用intValue
        Integer i1 = new Integer(s);
        int n1 = i1.intValue();
        System.out.println(n1);

    }

    public static void Demo3() {
        String s = "yaoyu";
        //通过toCharArray()将字符串转化为字符数组
        char[] arr = s.toCharArray();
        System.out.println(arr);
    }



}
