package cn.vpclub.javabasic.review.loop;

/**
 * <p>
 * Java基础实例——循环的极限
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/16 20:04
 */
public class CysUtmost {
    /**
     * 技巧：实例中程序运行结果会导致死循环，因为循环控制条件是索引小于等于整数类型的最大值，当整数类型达到其最大值再累加1时会导致回到整数类型的最小值，所以循环控制条件永远成立，这样就导致了程序的死循环，即在进行条件判断涉及取值边界时，应当注意这个问题
     */
    public static void main(String[] args) {
        //定义循环终止数
        int end = Integer.MAX_VALUE;
        //定义循环起始数
        int start = end - 50;
        //定义循环计算器
        int count = 0;
        for (int i = start; i <= end; i++) {
            //累加循环技术器
            count++;
            System.out.println("我是肥宅，我正在跑圈减肥");
        }
        //输入循环计数器
        System.out.println("本次循环次数为：" + count);
    }
}
