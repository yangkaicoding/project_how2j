package cn.vpclub.javabasic.review.variable;

/**
 * <p>
 * Java基础实例——自动类型装换与强制类型装换
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/12 16:06
 */
public class TypeConversion {

    /**
     * 数据类型之间相互进行转换时，低类型向高类型自动进行装换，高类型向低类型需要强制转换，超过取值范围会导致精度丢失，如果任何运算单元的长度超过int，那么运算结果就按照最长的长度计算，反正就按照int进行计算
     */
    public static void main(String[] args) {
        //定义不同数据类型的变量
        byte b = 127;
        char c = 'w';
        short s = 2351;
        int i = 333333333;
        long l = 400000L;
        float f = 3.14159F;
        double d = 54.523;
        //低类型向高类型自动装换
        System.out.println("累加byte类型等于："+b);
        System.out.println("累加char类型等于："+(b+c));
        System.out.println("累加short类型等于："+(b+c+s));
        System.out.println("累加int类型等于："+(b+c+s+i));
        System.out.println("累加long类型等于："+(b+c+s+i+l));
        System.out.println("累加float类型等于："+(b+c+s+i+l+f));
        System.out.println("累加double类型等于："+(b+c+s+i+l+f+d));
        //高类型向低类型强制转换
        System.out.println("将long类型强制装换为int类型:"+(int)l);
        //将int类型强制装换为short类型会导致数据丢失
        System.out.println("将int类型强制装换为short类型:"+(short)i);
        //将double类型强制转换为int类型会导致舍弃小数
        System.out.println("将double类型强制转换为int类型:"+(int)d);
        //将short类型强制装换为char类型会获取对应编码的字符
        System.out.println("将short类型强制装换为char类型:"+(char)s);
    }
}
