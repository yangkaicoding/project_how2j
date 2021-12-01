package cn.vpclub.javabasic.review.collection;

import cn.vpclub.javabasic.review.domain.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <p>
 * Java基础回顾——List集合排序
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/9 14:35
 */
public class Sort {
    public static void main(String[] args) {
        //创建一个List集合用来存放数据
        List<Integer> nums = Arrays.asList(3, 1, 5, 2, 9, 8, 4, 10, 6, 7);

        /**
         * 对数字进行倒序排列
         */
        //reverseOrder()倒序排列
        nums.sort(Comparator.reverseOrder());
        //打印排序结果
        System.out.println("倒序排列后的结果：" + nums);

        /**
         * 对数字进行正序排列
         */
        //naturalOrder()正序排列
        nums.sort(Comparator.naturalOrder());
        //打印排序结果
        System.out.println("正序排列后的结果：" + nums);


        /**
         * user1,user2表示需要比较的对象
         * 正序：user1.getAge().compareTo(user2.getAge())
         * 倒序：user2.getAge().compareTo(user1.getAge())
         */
        //按照对象某个属性进行排序
        List<User> users = new ArrayList<>();
        users.add(new User(1, "汤姆", 15));
        users.add(new User(2, "杰克", 18));
        users.add(new User(3, "佩奇", 7));

        //按照对象年龄属性进行正序排列
        users.sort((user1, user2) -> user1.getAge().compareTo(user2.getAge()));
        //打印排序结果
        for (User user : users) {
            System.out.println("按照对象年龄属性进行正序排列的结果为：" + user.getName());

        }

        System.out.println("----------------------------------------------------------");

        //按照对象年龄属性进行倒序排列
        users.sort((user1, user2) -> user2.getAge().compareTo(user1.getAge()));
        //打印排序结果
        for (User user : users) {
            System.out.println("按照对象年龄属性进行倒序排列的结果为：" + user.getName());
        }

    }
}
