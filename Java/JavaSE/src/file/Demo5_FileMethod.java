package file;

import java.io.File;

/**
 * @author yaoyu  2019/3/4 - 16:20
 * * A:获取功能
 * 	* public String getAbsolutePath()：获取绝对路径
 * 	* public String getPath():获取路径
 * 	* public String getName():获取名称
 * 	* public long length():获取长度。字节数
 * 	* public long lastModified():获取最后一次的修改时间，毫秒值
 * 	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
 * 	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组
 * * B:案例演示
 * 	* File类的获取功能
 */


public class Demo5_FileMethod {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        File dir = new File("D:\\java\\Java");
        String[] arr = dir.list();
        for (String s : arr) {
            System.out.println(s);
        }

        File[] subFiles = dir.listFiles();
        for (File subFile : subFiles) {
            System.out.println(subFile);
        }
    }

    private static void demo3() {
        File file1 = new File("ccc.txt");
        File file2 = new File("D:\\xxx.txt");
        /*System.out.println(file1.getName());
        System.out.println(file2.getName());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());*/

        /*Date d = new Date(file1.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        System.out.println(sdf.format(d));*/
    }

    private static void demo2() {
        File file1 = new File("ccc.txt");
        File file2 = new File("D:\\xxx.txt");
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());
    }

    private static void demo1() {
        File file1 = new File("ccc.txt");
        File file2 = new File("D:\\xxx.txt");
        System.out.println(file1.getAbsolutePath());      //获取绝对路径
        System.out.println(file2.getAbsolutePath());
    }
}
