package cn.vpclub.javabasic.review.lambda;

import java.util.Arrays;

/**
 * <p>
 * Java基础回顾——lambda：distinct表达式
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/17 15:23
 */
public class Distinct {

    /**
     * 概述：distinct可以从列表中获取唯一值的集合，相当于SQL语句中的DISTINCT,可以列表中的数据进行去重
     */
    public static void main(String[] args) {
        //实例化一个字符串数组
        String[] emails = new String[]{"a@b", "c@d", "a@a", "a@b", "c@a", "c@d"};
        //从列表中获取唯一值得集合
        Arrays.stream(emails).distinct().forEach(System.out::println);
    }
}
