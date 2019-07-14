package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author yaoyu  2019/3/3 - 13:02
 * 通过查看map集合的API发现没有interator方法，那么双列结合如何迭代呢？
 */


public class Demo2_Iterator {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        Integer i = map.get("张三");        //根据键获取值
        System.out.println(i);

        //获取所有的键
        Set<String> keySet = map.keySet();   //获取所有键的集合
        Iterator<String> it = keySet.iterator();   //获取迭代器
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "-" + value);
        }
    }
}
