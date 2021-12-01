package cn.vpclub.javabasic.review.array;

import java.util.Arrays;

/**
 * <p>
 * Java基础回顾——数组填充
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 16:18
 */
public class Fill {
    /**
     * 技巧：通过Arrays工具类的Arrays.fill(arrayName,value)方法和Arrays.fill(arrayNamr,startingIndex,endingIndex,value)方法向数组中填充元素
     */
    public static void main(String[] args) {
        //初始化一个长度为6的数组
        int[] array = new int[6];
        //将元素100填充到数组中
        Arrays.fill(array, 100);
        //打印填充元素后的数组
        System.out.println(Arrays.toString(array));

        System.out.println("---------------------");

        //将元素100填充到数组中的指定位置
        Arrays.fill(array, 3, 6, 50);
        //打印填充元素后的数组
        System.out.println(Arrays.toString(array));


    }
}
