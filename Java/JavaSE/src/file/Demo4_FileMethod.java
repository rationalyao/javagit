package file;

import java.io.File;

/**
 * @author yaoyu  2019/3/4 - 15:28
 * * A:判断功能
 * 	* public boolean isDirectory():判断是否是目录
 * 	* public boolean isFile():判断是否是文件
 * 	* public boolean exists():判断是否存在
 * 	* public boolean canRead():判断是否可读
 * 	* public boolean canWrite():判断是否可写
 * 	* public boolean isHidden():判断是否隐藏
 * * B:案例演示
 * 	* File类的判断功能
 *
 */


public class Demo4_FileMethod {
    public static void main(String[] args) throws Exception{
        //demo1();
        File file = new File("aaa.txt");
        System.out.println(file.createNewFile());
        file.setReadable(false);
        System.out.println(file.canRead());       //Windows系统认为所有的文件都是可读的
        file.setWritable(false);
        System.out.println(file.canWrite());      //Windows系统可以设置为不可写
    }

    private static void demo1() {
        File dir1 = new File("ccc");
        System.out.println(dir1.isDirectory());

        File dir2 = new File("D:\\xxx.txt");
        System.out.println(dir2.isDirectory());
        System.out.println(dir1.isFile());
        System.out.println(dir2.isFile());
    }
}
