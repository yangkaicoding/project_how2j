package cn.vpclub.javabasic.review.loop;

import java.math.BigDecimal;

/**
 * <p>
 * Java基础实例——使用for循环输出杨辉三角，二维数组的应用
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/16 14:11
 */
public class YangHuiTriangle {
    /**
     * 技巧：Java中的二维数组其实是一维数组的每个元素都是另一个一维数组,所以第二个数组的长度可以任意，多维数组亦是如此，更具灵活性
     */
    public static void main(String[] args) {
        //创建二维数组,并指定二维数组的第一维长度，用于存放杨辉三角的数值表
        int triangle[][] = new int[8][];
        //遍历二维数组的第一层
        for (int i = 0; i < triangle.length; i++) {
            //初始化第二层数组的大小
            triangle[i] = new int[i + 1];
            //遍历二维数组的第二层
            for (int j = 0; j <= triangle[i].length - 1; j++) {
                //将两侧的数组元素赋值为1,两侧数值均为1
                if (i == 0 || j == 0 || j == triangle[i].length - 1) {
                    triangle[i][j] = 1;
                } else {
                    //其他数据通过公式计算得到，其他位置的数值是其正上方数字与左上角数值之和
                    triangle[i][j] = triangle[i - 1][j] + triangle[i - 1][j - 1];
                }
                System.out.print(triangle[i][j] + "\t");
            }
            System.out.println();
        }


        /**
         * 技巧：循环语句可以完成复杂的运算，也可以用于控制程序的递归流程，而多层循环可以实现更加复杂的业务逻辑，处理有规则的大量数据，优化代码
         */
        //打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                //输出结果但不换行
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            //在外层循环中换行
            System.out.println();
        }


        /**
         * 用while循环计算1+1/2+1/3+!...+1/20的和
         */
        //定义接收和的变量
        BigDecimal sum = new BigDecimal(0.0);
        //阶乘项的计算结果
        BigDecimal factorial = new BigDecimal(1.0);
        //定义循环增量
        int i = 1;
        while (i <= 20) {
            sum = sum.add(factorial);
            ++i;
            factorial = factorial.multiply(new BigDecimal(1.0 / i));
        }
        System.out.println("1+1/2+1/3+!...+1/20的计算结果等于：" + sum);


    }


}
