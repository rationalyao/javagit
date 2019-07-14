package file;

import java.io.File;
import java.io.IOException;

/**
 * @author yaoyu  2019/3/4 - 14:51
 * * A:创建功能
 * 	* public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
 * 	* public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
 * 	* public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
 * * B:案例演示
 * 	* File类的创建功能
 */


public class Demo2_FileMethod {
    public static void main(String[] args) throws Exception{
        //demo1();
        File file1 = new File("aaa");
        System.out.println(file1.mkdir());

        File file2 = new File("bbb.txt");
        System.out.println(file2.mkdir());

        File dir3 = new File("ccc\\ddd");
        System.out.println(dir3.mkdirs());
    }

    private static void demo1() throws IOException {
        File file = new File("yyy.txt");
        System.out.println(file.createNewFile());
        File file2 = new File("zzz");
        System.out.println(file2.createNewFile());
    }
}
