package cn.vpclub.javabasic.review.collection;


import java.util.ArrayList;
import java.util.Iterator;

/**
 * <p>
 * Java基础回顾——遍历List集合
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/12 9:27
 */
public class List {

    /**
     * 概述：定义一个数组：int[] array=new int[] 因为数组有固定的长度，而针对数据长度可变的情况，产生了集合，以用来应对动态增长的数据
     */

    /**
     * 区别：集合和数组都是容器，数组有固定的长度，集合的长度是可变的
     *      数组存放的数据类型都是基本数据类型(四类八种) 集合存放的数据类型还可以是引用数据类型(String, Integer, 自定义数据类型)
     *      集合中对于基本数据类型会转换为引用数据类型再进行存储
     */

    /**
     * 集合包含的内容、集合的框架：接口类：Collection,Map,Set,List等(其中Set和List继承了Collection)
     *                           抽象类：AbstractCollection,AbstractList(实现了部分方法)
     *                          实现类：ArrayList,LinkedListClass,HashMap等
     *                         迭代器：Iterator(集合的访问迭代，返回集合中的元素的迭代器)
     */

    /**
     * List：List集合是一个有序的、可重复的集合，集合中每一个元素都有对应的顺序索引
     *      List集合中允许添加重复的元素，是应为可以通过索引来访问指定位置的元素
     *     List集合中默认按照元素的添加顺序来增加元素的索引
     */

    /**
     * ArrayList：ArrayList是基于数组实现的List类，实现所有可选列表操作，允许所有的元素包括null
     *           ArrayList arrayList = new ArrayList()      初始化容量为10的列表集合
     *          ArrayList<E> arrayList = new ArrayList<E>()数据类型为E,初始容量为10
     *
     * 主要方法：boolean add(E e) 将指定的元素追加到次列表的末尾
     *          void add(int index, E element) 在此列表中的指定位置插入指定的元素
     *         boolean addAll(Collection<? extends E> c) 将指定集合的Iterator返回的顺序，将指定集合中的所有元素追加到此列表的末尾
     *        boolean addAll(int index, Collection<? extends E> c) 将指定集合中的所有元素插入到此列表中，从指定的位置开始
     *       boolean contains(Object o) 如果此列表包含指定的元素，则返回true
     *      E get(int index)    返回此列表中指定位置的元素
     *     E remove(int index) 删除此列表中指定位置的元素
     *    E set(int index, E element) 用指定的元素替换此列表中指定位置的元素
     *   Object[] toArray() 以正确的顺序(从第一个到最后一个元素) 返回一个包含此列表中所有元素的数组
     */

    /**
     * LinkedListClass：LinkedList指的是链表类的数据结构
     *            链表中的元素可以任意的增加和删除，但是查询效率不如列表
     *           链表将对象存放在独立的空间中，而且每个空间都保存了下一个链接的索引
     *
     * 主要方法：void addFirst(E e) 在该列表开头插入指定的元素
     *          void addLast(E e)  将指定的元素追加到此列表的末尾
     *         E peekFirst() 检索但不删除此列表的第一个元素，如果此列表为空，则返回null
     *        E peekLast()  检索但不删除此列表的最后一个元素，如果此列表为空，则返回null
     *       E pollFirst() 检索并删除此列表中的第一个元素，如果此列表为空，则返回null
     *      E pop() 从此列表表示的堆栈中弹出第一个元素，相当于removeFist()
     *     void push(E e) 将元素推送到由此列表表示的堆栈上，相当于addFirst()
     */


    /**
     * 技巧：JDK1.5为Java添加了增强型的for循环，它是原有for循环遍历数据的一种简写形式，使用的关键字依然是for,但是参数格式不同
     *      JDK1.5之前使用for循环对集合、数组、迭代器进行遍历，需要创建索引变量、条件表达式，会导致代码臃肿，增加出错几率
     *
     * 语法：for(Type e : collections){
     *          //对变量e的使用语句
     *  }
     * 参数：e其类型Type是集合或数组中元素值得类型，该参数是集合或数组collections中的一个元素
     *       collection 要遍历的集合或数组，也可以是迭代器
     *      在循环中使用参数e,该参数是foreach从集合或数组以及迭代器中取得的元素值，元素值是从头到尾遍历的
     *
     */
    public static void main(String[] args) {
        //创建一个List集合
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcd");//List集合底层实现是无序列表，集合里面的元素是无序可重复的
        System.out.println(list.size());
        System.out.println("第一种遍历方式，根据List集合的长度循环遍历");

        //第一种遍历方式，根据List集合的长度for循环遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }

        //第二种遍历方式，使用增强型for循环遍历
        System.out.println("第二种遍历方式,使用增强型的for循环遍历");
        for (String str : list) {
            System.out.println(str);

        }
        System.out.println("第三种遍历方式，使用iterator循环遍历");

        //第三种遍历方式，使用iterator循环遍历
        //获得迭代器对象
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }


    }
}
