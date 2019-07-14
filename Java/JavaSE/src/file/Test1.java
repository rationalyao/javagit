package file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author yaoyu  2019/3/4 - 17:24
 */


public class Test1 {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        File dir = new File("D:\\");
        String[] arr = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                /*System.out.println(dir);
                System.out.println(name);*/
                File file = new File(dir,name);
                return file.isFile()&&file.getName().endsWith(".txt");
            }
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }

    private static void demo2() {
        File dir = new File("D:\\");
        File[] subFiles = dir.listFiles();
        for (File subFile : subFiles) {
            if (subFile.isFile() && subFile.getName().endsWith(".txt")) {
                System.out.println(subFile);
            }
        }
    }

    private static void demo1() {
        File dir = new File("D:\\");
        String[] arr = dir.list();           //获取D盘下所有的文件或文件夹
        for (String s : arr) {
            if (s.endsWith(".txt")) {
                System.out.println(s);
            }
        }
    }
}
