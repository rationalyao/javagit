package file;

import java.io.File;

/**
 * @author yaoyu  2019/3/4 - 14:33
 * * File(String pathname)：根据一个路径得到File对象
 * * File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
 * * File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
 */


public class Demo1_File {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        File parent = new File("D:");
        String child = "xxx.txt";
        File file = new File(parent,child);
        System.out.println(file.exists());
        System.out.println(parent.exists());
    }

    private static void demo2() {
        String parent = "D:";
        String child = "xxx.txt";
        File file = new File(parent,child);
        boolean b = file.exists();
        System.out.println(b);
    }

    private static void demo1() {
        File file = new File("D:\\xxx.txt");
        boolean b = file.exists();
        System.out.println(b);
    }
}
