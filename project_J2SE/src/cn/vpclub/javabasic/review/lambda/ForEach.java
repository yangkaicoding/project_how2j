package cn.vpclub.javabasic.review.lambda;

import java.util.Arrays;

/**
 * <p>
 * Java基础回顾——lambda：forEach表达式
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/17 11:17
 */
public class ForEach {

    /**
     * 概述：forEach可以采用同样的处理对集合中的每个元素进行循环遍历，一遍采用两种处理方式：1：采用函数式处理；2：采用函数对象式处理
     */
    public static void main(String[] args) {
        //实例化一个字符串数组
        String[] names = new String[]{"Mary", "Tom", "Bod", "Bill", "Jerry", "Steve", "Lucas"};
        //过滤出数组中长度大于等于4的元素,并采用函数式处理方式进行遍历
        Arrays.stream(names).filter(entity -> entity.length() >= 4).forEach(entity -> {
            System.out.println(entity);
        });

        System.out.println("----------------------------------------------------------------");
        //过滤出数组中长度大于等于4的元素，并采用函数对象式处理方式进行遍历
        Arrays.stream(names).filter(entity -> entity.length() >= 4).forEach(System.out::println);


    }
}
