package cn.vpclub.javabasic.review.loop;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——利用三元运算符判断奇数偶数
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/12 16:39
 */
public class ParityCheck {

    /**
     * Java三元表达式:条件表达式？表达式1：表达式2
     * %运算符用途非常广泛，1.实现数据分页，最简单的方法是可以通过计算奇偶数将数组交叉分为两个数组
     * %运算符用途非常广泛，2.限制取值范围，如(i%5 == 0)就可以限制变量i取值范围为[0,4]
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入一个整数");
        //获得用户输入信息
        //调用public long newLong();方法直接返回整型数据，避免数据类型的强制转换减少代码
        long num = scanner.nextLong();
        //判断用户输入数据
        System.out.println((num % 2 == 0) ? "这个数是一个偶数" : "这是一个奇数");
    }
}
