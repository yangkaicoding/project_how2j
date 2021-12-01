package cn.vpclub.javabasic.review.loop;

/**
 * <p>
 * Java基础实例——应用switch语句计算累计消费金额，根据消费金额计算折扣
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/16 10:09
 */
public class ProductPrice {
    /**
     * 技巧: 在程序开发中经常使用的都是正数，负数因为使用得少，经常被忽略，例如，N%2==1 本来是用来计算数字N是否为奇数，但是若N为负数，则会导致这个算法失败
     *      取模就是求余数的运算，对于整数a b来说，计算商：c=a/b 计算模：r=a-c*b
     */
    public static void main(String[] args) {
        //定义消费总额变量
        float consumption = 1206;
        //定义消费折扣变量
        float rebate = 0f;
        if (consumption > 200) {
            //根据消费金额计算等级
            int grade = (int) (consumption / 200);
            switch (grade) {
                case 1:
                    rebate = 0.95f;
                    break;
                case 2:
                    rebate = 0.90f;
                    break;
                case 3:
                    rebate = 0.85f;
                    break;
                case 4:
                    rebate = 0.83f;
                    break;
                case 5:
                    rebate = 0.80f;
                    break;
                case 6:
                    rebate = 0.78f;
                    break;
                case 7:
                    rebate = 0.75f;
                    break;
                case 8:
                    rebate = 0.73f;
                    break;
                case 9:
                    rebate = 0.70f;
                    break;
                case 10:
                    rebate = 0.65f;
                    break;
                default:
                    rebate = 0.60f;
            }
        }
        //输出消费总额
        System.out.println("您的累计消费金额" + consumption);
        //输出折扣比例
        System.out.println("您将享受" + rebate + "折优惠");
        //验证负数取模
        System.out.println(-6%7);
    }
}
