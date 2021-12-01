package cn.vpclub.javabasic.review.collection;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Java基础回顾——数组转集合
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/19 11:13
 */
public class ArrayToCollection {
    public static void main(String[] args) {
        //定义一个长度为5的字符串数组
        String[] array = new String[5];
        //循环赋值
        for (int i = 0; i < 5; i++) {
            array[i] = String.valueOf(i);
        }
        //将字符串数组转换为集合
        List<String> list = Arrays.asList(array);
        //打印结果
        for (String s : list) {
            System.out.println("转换后的集合中元素为：" + s);
        }
    }
}
