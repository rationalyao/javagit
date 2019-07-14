package map;

import java.util.LinkedHashMap;

/**
 * @author yaoyu  2019/3/3 - 14:32
 */


public class Demo6_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("zs",23);
        lhm.put("zs",23);
        lhm.put("kzs",23);
        System.out.println(lhm);
    }
}
