package cn.vpclub.javabasic.review.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * <p>
 * Java基础回顾——集合的长度
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/19 11:32
 */
public class Size {
    public static void main(String[] args) {
        //实例化一个set集合
        HashSet<Object> set = new HashSet<>();
        //添加元素到set集合
        set.add("Yellow");
        set.add("White");
        set.add("Green");
        set.add("Blue");
        //获得迭代器对象
        Iterator<Object> iterator = set.iterator();
        //通过迭代器遍历
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\t");
        }
        System.out.println();
        //获得集合的长度
        int size = set.size();
        //打印集合的长度
        if (set.isEmpty()) {
            System.out.println("该集合是空的");
        } else {
            System.out.println("该集合的长度为：" + size);
        }
    }
}
