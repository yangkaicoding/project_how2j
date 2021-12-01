package cn.vpclub.javabasic.review.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Java基础回顾——数组合并
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 16:03
 */
public class Merge {
    /**
     * 通过List类的list.add(array1.asList(array2))方法将两个数组合并为一个数组
     */
    public static void main(String[] args) {
        //初始化两个数组
        String[] a = {"I", "LOVE"};
        String[] b = {"YOU"};
        //将两个数组进行合并
        List<String> list = new ArrayList<>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        //打印两个数组合并结果
        System.out.println(Arrays.toString(list.toArray()));

    }
}
