package wrap_class;

/**
 * @author yaoyu  2019/1/11 - 18:12
 */

/*为什么会有基本类型包装类：
    将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
 */

public class Demo1_Integer {
    public static void main(String[] args) {
        //转化为二进制
        System.out.println(Integer.toBinaryString(60));
        //转化为八进制
        System.out.println(Integer.toOctalString(60));
        //转化为16进制
        System.out.println(Integer.toHexString(60));
    }
}
