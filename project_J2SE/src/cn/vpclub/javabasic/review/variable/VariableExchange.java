package cn.vpclub.javabasic.review.variable;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——省略临时变量实现两个变量的互换
 * </p>
 *
 * @author: 杨凯
 * @since:  2018/10/15 15:25
*/
public class VariableExchange {
    /**
     * 实例中演示了省略临时变量实现两个变量的互换，变量的互换常见于数组排序算法中，当判断两个数组元素需要交互时，通常的做法是通过创建一个临时变量共同完成互换，但临时变量的创建增加了系统资源的消耗
     *
     * 技巧:异或^和其他位运算符并不会改变变量的值，即A^B本身没有任何意义，必须将其运算结果赋值给一个变量
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入变量A的值");
        //接收用户输入信息
        long num1 = scanner.nextLong();
        //提示用户输入信息
        System.out.println("请输入变量B的值");
        //接收用户输入信息
        long num2 = scanner.nextLong();
        //输出用户的变量值
        System.out.println("变量A的值为:"+num1+"\t"+"变量B的值为:"+num2);
        //执行两个变量互换
        System.out.println("执行两个变量互换");
        num1=num1^num2;
        num2=num2^num1;
        num1=num1^num2;
        System.out.println("变量A的值为:"+num1+"\t"+"变量B的值为:"+num2);

    }
}
