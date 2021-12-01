package cn.vpclub.javabasic.review.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * <p>
 * Java基础回顾——数组获取最大最小值
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 15:55
 */
public class MaximumValue {
    public static void main(String[] args) {
        //初始化一个数组
        Integer[] numbers = {8, 2, 7, 1, 4, 9, 5};
        //获取数组中的最大值
        int max = Collections.max(Arrays.asList(numbers));
        //获取数组中的最小值
        int min = Collections.min(Arrays.asList(numbers));
        //打印数组最大最小值
        System.out.println("数组中的最大值为" + max);
        System.out.println("数组中的最小值为" + min);
    }
}
