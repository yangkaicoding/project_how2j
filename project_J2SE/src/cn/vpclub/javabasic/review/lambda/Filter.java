package cn.vpclub.javabasic.review.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * Java基础回顾——lambda：filter表达式
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/17 10:42
 */
public class Filter {

    /**
     * 概述：filter是从一个列表中找到符合条件的数据，适用于数组也适用于集合
     */
    public static void main(String[] args) {
        //实例化一个字符串数组
        String[] names = new String[]{"Mary", "Tom", "Bod", "Bill", "Jerry", "Steve", "Lucas"};
        //过滤出数组中长度大于等于4的元素
        Stream<String> filteredNames = Arrays.stream(names).filter(entity -> entity.length() >= 4);
        //将Stream流转换为List集合
        List<String> strings = filteredNames.collect(Collectors.toList());
        //打印结果
        System.out.println(strings.toString());

        System.out.println("--------------------------------------------------------------------");

        //实例化一个字符串集合
        List<String> nameList = Arrays.asList("Carry", "Christina", "Calcium", "Micheal", "Charlie", "Kevin");
        //过滤出集合中以字母C开头的元素
        Stream<String> filteredNameList = nameList.stream().filter(entity -> entity.startsWith("C"));
        //将Stream流转换为List集合
        List<String> stringList = filteredNameList.collect(Collectors.toList());
        //打印结果
        System.out.println(stringList.toString());
    }
}
