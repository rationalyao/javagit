package src.templates;

import java.util.ArrayList;

/**
 * @author yaoyu  2019/1/9 - 19:13
 */


public class Templates2 {

    public static void main(String[] args) {
        //模板三：fori
        String[] arr = new String[] {"tom", "hanmeimei", "Mike", "Jordan"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
        }
        //模板四：List.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(23);
        list.add(13);

        for (Object o : list) {
            System.out.println(o);
        }
        //变形:List.forr 倒叙遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }
    }
}
