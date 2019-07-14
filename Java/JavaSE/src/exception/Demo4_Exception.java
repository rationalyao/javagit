package exception;

import java.io.FileInputStream;

/**
 * @author yaoyu  2019/3/3 - 15:52
 */


public class Demo4_Exception {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("xxx.txt");
        }catch (Exception e) {
            System.out.println("llll");
        }
    }
}
