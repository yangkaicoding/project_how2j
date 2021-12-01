package cn.vpclub.javabasic.review.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * <p>
 * Java基础实例——数组排序及元素查找及数组元素的添加
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 10:04
 */
public class Sort {

    /**
     * 技巧：通过sort()方法对数组进行排序，并通过binarySearch()方法来查找数组中的元素,使用binarySearch()方法查找数组中的元素前，比较对数组进行排序，才能定位位置，因为binarySearch采用二分搜索法
     *      通过comparator工具类并重写compare方法实现对数组的正序倒序排列
     *     通过collections工具类实现对数组的倒序排列，但数组数据类型必须为包装类
     *
     */
    public static void main(String[] args) {
        //初始化一个数组
        Integer[] arrays = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        //将数组进行排序
        Arrays.sort(arrays);
        //查找数组元素位置
        int index = Arrays.binarySearch(arrays, -2);
        //添加数组元素


        //打印数组排序结果方式一：
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("数组排序结果为：" + arrays[i]);
        }

        System.out.println("-------------------------------");

        //打印数组排序结果方式二：
        System.out.println(Arrays.toString(arrays));

        System.out.println("-------------------------------");

        //打印数组中元素的位置
        System.out.println("数组中元素-2出现的位置为" + index);

        System.out.println("-------------------------------");


        /**
         * 使用Comparator工具类将数组进行倒序排列
         */
        Arrays.sort(arrays, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(01);
            }
        });
        System.out.println(Arrays.toString(arrays));

        System.out.println("-------------------------------");

        /**
         * 使用Comparator工具类将数组进行正序排列
         */
        Arrays.sort(arrays, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(arrays));

        System.out.println("-------------------------------");

        /**
         * 使用collections工具类将数组进行倒序排列
         */
        Arrays.sort(arrays, Collections.reverseOrder());
        //打印数组排序结果
        System.out.println(Arrays.toString(arrays));

        System.out.println("-------------------------------");



    }
}
