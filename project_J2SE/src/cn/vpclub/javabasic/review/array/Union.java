package cn.vpclub.javabasic.review.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <p>
 * Java基础回顾——求两个数组的并集
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/19 10:59
 */
public class Union {

    //求两个字符串数组的并集，利用set的元素的唯一性
    public static String[] union(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        //遍历集合，循环添加
        for (String str : arr1) {
            set.add(str);
        }
        //遍历集合，循环添加
        for (String str : arr2) {
            set.add(str);
        }
        String[] result = {};
        return set.toArray(result);
    }

    public static void main(String[] args) {
        //实例化两个数组对象
        String[] arr1 = {"1", "2", "3"};
        String[] arr2 = {"4", "5", "6"};
        //求两个数组的并集
        String[] resultUnion = union(arr1, arr2);
        //打印两个数组的并集结果
        System.out.println(Arrays.toString(resultUnion));

    }
}
