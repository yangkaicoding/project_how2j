package cn.vpclub.javabasic.review.scanner;

import java.util.Scanner;

/**
 * <p>
 * Java实例——使用位移运算符替代乘法运算
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/15 14:43
 */
public class DisplacementOperation {
    /**
     * 实例中使用位移运算符来实现乘法运算，实现的运算效率要高于通过"*"运算符或BigDecimal类的multiply()来实现乘法运算
     *
     * 技巧: 一个整数每次执行位移运算中的左移运算n次，相当于这个整数乘以2的n次方
     *      一个整数每次执行位移运算中的右移运算n次，相当于这个整数除以2的n次方
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入一个整数");
        //获得用户输入信息
        long num = scanner.nextLong();
        System.out.println("您输入的数字为:" + num);
        //进行位移运算
        System.out.println("该数乘以2的运算结果为:" + (num << 1));
        System.out.println("该数乘以4的运算结果为:" + (num << 2));
        System.out.println("该数乘以8的运算结果为:" + (num << 3));
        System.out.println("该数乘以16的运算结果为:" + (num << 4));
        System.out.println("该数除以16的运算结果为:" + (num >> 1));
    }

}
