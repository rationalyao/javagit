package list;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author yaoyu  2019/2/28 - 10:16
 */


public class Demo5_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("a");
        v.add("b");
        v.add("c");
        v.add("d");

        Enumeration en = v.elements();    //获取枚举
        while (en.hasMoreElements()) {             //判断集合中是否有元素
            System.out.println(en.nextElement());        //获取集合中的元素
        }
    }
}
