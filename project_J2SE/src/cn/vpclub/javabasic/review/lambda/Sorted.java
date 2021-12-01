package cn.vpclub.javabasic.review.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java基础回顾——lambda：sorted表达式
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/17 14:26
 */
public class Sorted {

    /**
     * 概述：sorted 标识排序 排序的方法和条件可以自己指定，如果打算逆序排列，把 a.type - b.type 改为 b.type - a.type即可
     */

    /**
     * 类型：1：强制性
     */
    private static final int MANDATORY = 1;

    /**
     * 类型：2：可选的
     */
    private static final int OPTIONAL = 2;

    /**
     * 名称
     */
    public String name;

    /**
     * 类型
     */
    public Integer type;

    //定义一个构造方法
    public Sorted(String n, Integer t) {
        name = n;
        type = t;
    }

    public static void main(String[] args) {
        //创建一个集合，以用于存放对应的集合元素
        List<Sorted> sortedList = new ArrayList<>();
        //存放对应的集合元素
        sortedList.add(new Sorted("Physics", Sorted.MANDATORY));
        sortedList.add(new Sorted("English", Sorted.OPTIONAL));
        sortedList.add(new Sorted("Japanese", Sorted.MANDATORY));
        sortedList.add(new Sorted("Chemistry", Sorted.OPTIONAL));
        sortedList.add(new Sorted("French", Sorted.MANDATORY));
        //将集合中的元素进行排序
        sortedList.stream().sorted((a, b) -> a.type - b.type).forEach(e -> {
            System.out.println(e.name);
        });

        System.out.println("----------------------------------------------");

        sortedList.stream().sorted((a, b) -> b.type - a.type).forEach(e -> {
            System.out.println(e.name);
        });
    }
}
