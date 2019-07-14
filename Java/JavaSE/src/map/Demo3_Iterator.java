package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yaoyu  2019/3/3 - 13:24
 * A:键值对对象找键和值思路：
 * 	* 获取所有键值对对象的集合
 * 	* 遍历键值对对象的集合，获取到每一个键值对对象
 * 	* 根据键值对对象找键和值
 * * B:案例演示
 * 	* Map集合的遍历之键值对对象找键和值
 */


public class Demo3_Iterator {
    public static void main(String[] args) {
        //demo1();
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            System.out.println(en.getKey()+ "-" + en.getValue());
        }
    }

    private static void demo1() {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        //Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        //获取每一个对象
        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
        while (it.hasNext()) {
            //获取每一个Entry对象
            Map.Entry<String,Integer> en = it.next();
            String key = en.getKey();
            Integer value = en.getValue();
            System.out.println(key + "-" + value);
        }
    }
}
