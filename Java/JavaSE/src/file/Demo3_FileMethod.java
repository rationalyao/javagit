package file;

import java.io.File;

/**
 * @author yaoyu  2019/3/4 - 15:07
 * * A:重命名和删除功能
 * 	* public boolean renameTo(File dest):把文件重命名为指定的文件路径
 * 	* public boolean delete():删除文件或者文件夹
 * * B:重命名注意事项
 * 	* 如果路径名相同，就是改名。
 * 	* 如果路径名不同，就是改名并剪切。
 * * C:删除注意事项：
 * 	* Java中的删除不走回收站。
 * 	* 要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
 */


public class Demo3_FileMethod {
    public static void main(String[] args) {
        //demo1();
        File file1 = new File("zzz");
        System.out.println(file1.delete());

        File file2 = new File("aaa");
        System.out.println(file2.delete());

        File file3 = new File("ccc");
        System.out.println(file3.delete());
    }

    private static void demo1() {
        File file1 = new File("ooo.txt");
        File file2 = new File("D:\\x.txt");
        file1.renameTo(file2);
        System.out.println(file2);
    }
}
