package cn.vpclub.javabasic.review.array;

import java.util.ArrayList;

/**
 * <p>
 * Java基础回顾——在数组中查找指定元素
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/19 10:39
 */
public class Contains {
    public static void main(String[] args) {
        //实例化两个集合对象，用来存放元素
        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();
        //将元素添加到集合对象中
        list1.add(0, "common1");
        list1.add(1, "common2");
        list1.add(2, "common3");
        list1.add(3, "notCommon");

        list2.add(0, "common1");
        list2.add(1, "common2");
        list2.add(2, "common3");
        //打印集合对象中的元素
        System.out.println("集合对象一中的元素为：" + list1);
        System.out.println("集合对象二种的元素为：" + list2);
        //在数组中查找指定的元素
        boolean back = list1.contains("common2");
        //打印在数组中查找的结果
        System.out.println("数组中是否包含元素common2:" + "\t" + back);
    }
}
