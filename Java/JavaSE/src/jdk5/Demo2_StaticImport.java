package jdk5;

import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * * A:静态导入概述
 *     静态导入时导入类中的静态方法
 * * B:格式：
 * 	* import static 包名….类名.方法名;
 * 	* 可以直接导入到方法的级别
 * * C:注意事项
 * 	* 方法必须是静态的,如果有多个同名的静态方法，容易不知道使用谁?
 * 	这个时候要使用，必须加前缀。由此可见，意义不大，所以一般不用，但是要能看懂。
 */


public class Demo2_StaticImport {
    public static void main(String[] args) {
        int[] arr = {33,22,11,55,44};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
