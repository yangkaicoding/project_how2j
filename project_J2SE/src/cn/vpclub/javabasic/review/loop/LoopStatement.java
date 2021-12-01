package cn.vpclub.javabasic.review.loop;

/**
 * <p>
 * Java基础回顾——循环控制语句
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/11 18:38
 */
public class LoopStatement {
    public static void main(String[] args) {

        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + i * j + "\t");// \t 跳到下一个tab位置
            }
            System.out.println();
        }
        System.out.println("\t");

        //打印三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; i <= j; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\t");


        for (int i = 1; i <= 10; i++) {
            System.out.println("洪乞丐第"+i+"天的收入为"+1 * Math.pow(2, i - 1));
        }
    }

}
