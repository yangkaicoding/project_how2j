package cn.vpclub.javabasic.review.array;

import java.util.Arrays;

/**
 * <p>
 * Java基础回顾——数组扩容
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 16:34
 */
public class extend {
    public static void main(String[] args) {
        //初始化一个数组
        String[] names = {"a", "b", "c"};
        //定义一个长度为5的数组
        String[] extended = new String[5];
        //填充数组元素
        extended[3] = "e";
        extended[4] = "d";
        //数组扩容
        System.arraycopy(names, 0, extended, 0, names.length);
        //打印数组
        System.out.println(Arrays.toString(extended));
    }
}
