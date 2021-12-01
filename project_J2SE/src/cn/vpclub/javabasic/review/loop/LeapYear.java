package cn.vpclub.javabasic.review.loop;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——条件语句：判断某一年是否为闰年
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/15 15:49
 */
public class LeapYear {
    /**
     * 语法：if (条件)
     *   {
     *     只有当条件为 true 时执行的代码
     *   }else{
     *    只有当条件为 false 时执行的代码
     *   }
     *
     * 技巧：计算闰年的公式：1.能被4整除但不能被100整除 2.能被400整除
     *       三元运算符(?:) 是if else 语法的一个简洁写法，可以根据需求来决定使用哪种，前者多用于赋值判断，后者常用于业务流程
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入一个需要判断的年份");
        //接收用户输入信息
        long year = scanner.nextLong();
        //判断是否为闰年
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "是平年");
        }
    }
}
