package otherclass;

import java.util.Arrays;

/**
 * @author yaoyu  2019/1/18 - 9:32
 * A:System类的概述
 * 	* System 类包含一些有用的类字段和方法。它不能被实例化。
 * B:成员方法
 * 	* public static void gc()
 * 	* public static void exit(int status)
 * 	* public static long currentTimeMillis()
 * 	* pubiic static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
 * C:案例演示
 * 	* System类的成员方法使用
 */


public class Demo3_System {
    public static void main(String[] args) {
        //Demo1();
        //非零状态是异常终止,退出jvm
        //Demo2();
        //Demo3();
        int[] src = {11,22,33,44,55};
        int[] dest = new int[8];
        //讲数组内容拷贝
        System.arraycopy(src,0,dest,0, src.length);
        System.out.println(Arrays.toString(dest));
    }

    private static void Demo3() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            System.out.println("*");
        }
        long end = System.currentTimeMillis();    //单位毫秒
        System.out.println(start);
        System.out.println(end);
        System.out.println(end - start);
    }

    private static void Demo2() {
        System.exit(0);
        System.out.println("哈哈哈哈哈哈哈哈");
    }

    private static void Demo1() {
        for (int i = 0; i < 100; i++) {
            new Demo();
            //运行垃圾回收器
            System.gc();
        }
    }

    //在一个原文件中，不允许定义两个用public定义的类
    static class Demo {
        @Override
        public void finalize() {
            System.out.println("垃圾被清扫了");
        }
    }
}
