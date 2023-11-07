package cn.vpclub.javabasic.review.variable;

import java.math.BigDecimal;

/**
 * <p>
 * Java基础实例——更精确地使用浮点数
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/15 10:05
 */
public class AccuratelyFloat {

    /**
     * 实例中通过BigDecimal类实现精确的小数计算，从而减少误差，浮点运算的典型实例就是货币计算，在计算中所有数字都是二进制进行存储，而二进制无法精确地表示所有小数
     *
     * 方法：
     * 加法 public BigDecimal add (BigDecimal augend)           参数说明：augend:     与当前对象执行加法的操作数
     * 减法 public BigDecimal subtract(BigDecimal subtrahend)   参数说明：subtrahend: 与当前对象执行减法的操作数
     * 乘法 public BigDecimal multiply(BigDecimal multiplicand) 参数说明：multiplicand: 乘法运行中的乘数
     * 除法 public BigDecimal divide(BigDecimal divisor)        参数说明：divisor:      除法运行中的除数
     *
     * 技巧：这里创建BigDecimal类的实例时，在构造方法中一定要使用数字字符串作为参数；如果直接使用浮点数或该类型的变量作为参数，那么构造方法接收的是经过二进制存储的浮点数，那样就会是不精确的浮点数
     */
    public static void main(String[] args) {
        //定义现有金额
        double money1 = 2;
        //定义商品价格
        double price1 = 1.1;
        //非精确计算结果
        double result = money1 - price1;
        System.out.println("非精确计算的结果为:" + result);

        //精确浮点数的解决办法
        //定义现有金额
        BigDecimal money2 = new BigDecimal("2");
        //定义商品价格
        BigDecimal price2 = new BigDecimal("1.1");
        //精确计算结果
        BigDecimal result2 = money2.subtract(price2);
        System.out.println("精确计算的结果为:" + result2);
    }
}
