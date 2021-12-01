package cn.vpclub.javabasic.review.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * Java基础回顾——删除数组中的元素
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 16:59
 */
public class Remove {
    public static void main(String[] args) {
        //实例化一个List集合容器
        List<String> list = new ArrayList<>();
        //添加元素到List集合容器
        list.add(0, "第一个元素");
        list.add(1, "第二个元素");
        list.add(2, "第三个元素");
        //打印结果
        System.out.println("删除集合元素前的结果为：" + Arrays.toString(list.toArray()));
        //删除数组中的元素
        list.remove(1);
        //打印结果
        System.out.println("删除集合元素后的结果为：" + Arrays.toString(list.toArray()));


    }
}
