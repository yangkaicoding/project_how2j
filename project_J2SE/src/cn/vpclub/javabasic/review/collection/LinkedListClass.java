package cn.vpclub.javabasic.review.collection;

import java.util.LinkedList;

/**
 * <p>
 * Java基础回顾——链式列表集合
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/19 16:29
 */
public class LinkedListClass {
    public static void main(String[] args) {

        //实例化一个LinkedList集合
        LinkedList<String> linkedList = new LinkedList<>();
        //添加元素到LinkedList集合
        linkedList.add("is");
        linkedList.add("wyh");
        linkedList.add("cool");
        linkedList.push("wyh is");
        //打印结果
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
    }
}
