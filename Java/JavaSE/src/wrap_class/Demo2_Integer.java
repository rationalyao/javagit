package wrap_class;

/**
 * @author yaoyu  2019/1/11 - 18:20
 */


public class Demo2_Integer {
    public static void main(String[] args) {
        //int数据类型的取值范围
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        Integer i1 = new Integer(100);
        System.out.println(i1);

        //字符串转整数,参数只能为数字字符串
        Integer i2 = new Integer("100");
        System.out.println(i2);
    }
}
