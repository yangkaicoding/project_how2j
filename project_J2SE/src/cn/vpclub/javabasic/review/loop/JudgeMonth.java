package cn.vpclub.javabasic.review.loop;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——判断用户输入月份的季节
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/16 11:09
 */
public class JudgeMonth {
    /**
     * 技巧：1.switch语句的每个case关键字都用于判断一个常量并作出相应的业务处理，熟练掌握switch语句之后可以组合
     *        多个case来完成多条件的处理，就是多个常量结果执行相同的业务处理，反向利用了case穿透现象
     *      2.switch语句中的case穿透现象，在语法上break是可以省略的，当没有break时，会出现穿透现象，也就是case不与表达式进行匹配，而直接执行下一个case中的语句
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入月份
        System.out.println("请输入一个月份，我能告诉你它属于哪个季节");
        //接收用户输入月份
        int month = scanner.nextInt();
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("你输入的月份属于冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("你输入的月份属于春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("你输入的月份属于夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("你输入的月份输入秋季");
                break;
            default:
                System.out.println("你确定你输入的" + month + "月是月份吗？");
        }
    }
}
