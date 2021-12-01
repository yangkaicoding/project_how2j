package cn.vpclub.javabasic.review.variable;

/**
 * <p>
 * Java基础回顾——基本变量类型
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/11 16:19
 */
public class Variable {

    /**
     * java基本数据类
     * 整数型: byte short int long 用于存放整数，个类型之间区别在于max,min不同
     * 字符型: varchar
     * 浮点型: float double
     * 布尔型: boolean
     */

    public static void main(String[] args) {
        //输出基本数据类型的取值范围
        byte bMin = Byte.MIN_VALUE;
        byte bMax = Byte.MAX_VALUE;
        System.out.println("byte类型的取值范围为" + "[" + bMin + "-" + bMax + "]");

        short sMin = Short.MIN_VALUE;
        short sMax = Short.MAX_VALUE;
        System.out.println("short类型的取值范围为" + "[" + sMin + "-" + sMax + "]");

        int iMin = Integer.MIN_VALUE;
        int iMax = Integer.MAX_VALUE;
        System.out.println("int类型的取值范围为" + "[" + iMin + "-" + iMax + "]");

        long lMin = Long.MIN_VALUE;
        long lMax = Long.MAX_VALUE;
        System.out.println("long类型的取值范围为" + "[" + lMin + "-" + lMax + "]");


    }
}
