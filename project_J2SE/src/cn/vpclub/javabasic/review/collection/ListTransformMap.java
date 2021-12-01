package cn.vpclub.javabasic.review.collection;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <p>
 * Java基础回顾——List转为Map、分组、过滤、求和等
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/9 10:48
 */
public class ListTransformMap {

    //设置对象的属性
    private Integer id;
    private String name;
    private BigDecimal money;
    private Integer num;

    //添加Get/Set方法
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }


    //添加一个构造器
    public ListTransformMap(Integer id, String name, BigDecimal money, Integer num) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.num = num;
    }


    public static void main(String[] args) {
        //添加对象的测试数据
        List<ListTransformMap> list = new ArrayList<>();
        ListTransformMap fruit1 = new ListTransformMap(1, "苹果", new BigDecimal("3.25"), 10);
        ListTransformMap fruit2 = new ListTransformMap(2, "梨子", new BigDecimal("1.35"), 20);
        ListTransformMap fruit3 = new ListTransformMap(3, "香蕉", new BigDecimal("2.89"), 30);
        ListTransformMap fruit4 = new ListTransformMap(4, "西瓜", new BigDecimal("9.99"), 40);
        list.add(fruit1);
        list.add(fruit2);
        list.add(fruit3);
        list.add(fruit4);

        /**
         * 转换
         */
        //1.常规方法
        HashMap<Integer, List<ListTransformMap>> map1 = new HashMap<>();
        //遍历集合
        for (ListTransformMap listTransformMap : list) {
                //若map中存在此id,则将数据存放当前key的map中
            if (map1.containsKey(listTransformMap.getId())) {
                map1.get(listTransformMap.getId()).add(listTransformMap);
                //若map中不存在此id,新建value,用来存放数据
            } else {
                ArrayList<ListTransformMap> tempList = new ArrayList<>();
                tempList.add(listTransformMap);
                map1.put(listTransformMap.getId(), tempList);
            }
        }
        //打印Map集合
        map1.forEach((key, value) -> {
            System.out.println("key" + key + "\t" + "value" + value);
        });

        System.out.println("--------------------------------------------------------------------");

        /**
         * 注意：List转为Map如果集合对象中有重复的key,会报错Duplicate key......
         *      可以用(k1,k2)->k1来设置，若集合对象中有重复的key,则会保留k1,舍弃k2
         */
        //2.利用JDK1.8新特性
        Map<Integer, ListTransformMap> map2 = list.stream().collect(Collectors.toMap(ListTransformMap::getId, listTransformMap -> listTransformMap));
        //打印Map集合
        map2.forEach((key, value) -> {
            System.out.println("key" + key + "\t" + "value" + value);
        });

        System.out.println("--------------------------------------------------------------------");

        /**
         * 分组
         */
        //List以id进行分组
        Map<Integer, List<ListTransformMap>> map3 = list.stream().collect(Collectors.groupingBy(ListTransformMap::getId));
        //打印Map集合
        map3.forEach((key, value) -> {
            System.out.println("key" + key + "\t" + "value" + value);
        });

        System.out.println("--------------------------------------------------------------------");

        /**
         * 过滤
         */
        //过滤出符合条件的数据
        List<ListTransformMap> list1 = list.stream().filter(ListTransformMap -> "香蕉".equals(ListTransformMap.getName())).collect(Collectors.toList());
        //打印List集合
        System.out.println(list1.toString());

        System.out.println("--------------------------------------------------------------------");

        /**
         * 求和
         */
        //将集合中的数据按照价格属性求和
        BigDecimal totalMoney = list.stream().map(ListTransformMap::getMoney).reduce(BigDecimal.ZERO, BigDecimal::add);
        //打印求和结果
        System.out.println("totalMoney"+totalMoney);
        //将集合中的数据按照数量属性求和
        int sum = list.stream().mapToInt(ListTransformMap::getNum).sum();
        //打印求和结果
        System.out.println("sum"+sum);


    }
}
