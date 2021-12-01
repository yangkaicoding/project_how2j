package cn.vpclub.javabasic.review.lambda;

import java.util.Arrays;
import java.util.Optional;

/**
 * <p>
 * Java基础回顾——lambda：findAny与findFirst表达式
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/17 11:25
 */
public class Find {

    /**
     * 概述：findAny是从列表中任意找一个符合条件的数据，而findFirst是从列表中找到第一个符合条件的数据，有时findAny和findFirst会得到相同的结果
     */
    public static void main(String[] args) {
        //实例化一个字符串数组
        String[] names = new String[]{"Mary", "Tom", "Bod", "Bill", "Jerry", "Steve", "Lucas"};
        //从列表中找到第一个符合条件的数据
        Optional<String> first = Arrays.stream(names).filter(entity -> entity.length() >= 4).findFirst();
        //打印结果
        System.out.println(first);

        System.out.println("--------------------------------------------------------------------------");

        //从列表中任意找一个符合条件的数据
        Optional<String> any = Arrays.stream(names).filter(entity -> entity.length() >= 4).findAny();
        //打印结果
        System.out.println(any);
    }
}
