package cn.vpclub.javabasic.review.collection;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * <p>
 * Java基础回顾——遍历Map集合
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/11 17:56
 */
public class Map {
    public static void main(String[] args) {
        //创建一个Map集合
        java.util.Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "ab");
        map.put(4, "ab");
        map.put(4, "ab"); //Map存放相同的值，会自动过滤筛选
        System.out.println(map.size());
        System.out.println("第一种遍历方式，通过Map.keySet遍历key和value");


        //第一种遍历方式，通过Map.keySet获得key的集合然后再遍历value
        //获得所有key的集合
        Set<Integer> set = map.keySet();
        for (Integer i : set) {
            String str = map.get(i);
            System.out.println("key:" + i + "\t" + "value:" + str);
        }
        System.out.println("第二种遍历方式,通过Map.entrySet遍历key和value");


        //第二种遍历方式,通过Map.entrySet获得key的集合然后再遍历value
        Set<java.util.Map.Entry<Integer, String>> entity = map.entrySet();
        for (java.util.Map.Entry<Integer, String> e : entity) {
            System.out.println("key:" + e.getKey() + "\t" + "value:" + e.getValue());
        }
        System.out.println("第三种遍历方式,通过Map.entrySet使用iterator遍历key和value");


        //第三种遍历方式,通过Map.entrySet使用iterator遍历key和value
        //获得迭代器对象
        Iterator<java.util.Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            java.util.Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key:" + entry.getKey() + "\t" + "value:" + entry.getValue());
        }
        System.out.println("第四种方式,通过Map.entrySet遍历key和value");


        /**
         * 方法说明：1.Map.Entry<Integer, String> 映射项
         *          2..map.entrySet() 返回此映射关系中包含的映射关系的set视图
         */
        //第四种方式,通过Map.entrySet遍历key和value
        for (java.util.Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("key:" + entry.getKey() + "\t" + "value:" + entry.getValue());
        }
        System.out.println("第五种方式，通过Map.values()遍历所有的value,但不能遍历key");


        //第五种方式，通过Map.values()遍历所有的value,但不能遍历key
        for (String str : map.values()) {
            System.out.println("value:" + str);
        }
        System.out.println("第六种方式,通过Lambda遍历key和value");

        //第六种方式,通过Lambda遍历key和value
        map.forEach((key, value) -> {
            System.out.println("key:" + key + "\t" + "value:" + value);
        });

        /**
         * java集合框架Map与Set的有序与无序
         * HashSet是无序的；LinkedHashSet是按插入顺序的；TreeSet是按升序的
         * HashMap是无序的；LinkedHashMap是按插入顺序的；TreeMap是按升序的
         */
        Set<Integer> set1 = new HashSet<>();
        set1.add(100);
        set1.add(1);
        set1.add(10);
        set1.add(3);
        set1.add(78);
        System.out.println(set1);

        System.out.println("---------------------------");
        java.util.Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "a");
        map1.put(1, "b");
        map1.put(10, "c");
        map1.put(3, "d");
        map1.put(78, "e");
        System.out.println(map1);

    }
}
