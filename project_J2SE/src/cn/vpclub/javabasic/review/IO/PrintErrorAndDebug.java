package cn.vpclub.javabasic.review.IO;
/**
 * <p>
 * Java基础实例——输出错误信息与调试信息
 * </p>
 * 
 * @author: 杨凯
 * @since:  2018/10/12 14:25
*/
public class PrintErrorAndDebug {
    /**
     * 实例中调用了System类的输出流通用的println()方法来输出一行数据，该方法的声明为public void println(string x)
     * System类的out与err是两个类成员变量，不用创建system类的实例就可以直接使用
     * out主要是输出调试信息的输出流，控制台以黑色字体标识
     * err主要是输出错误信息的输出流，控制台以红色字体标识,且err显示的优先级更高
     */
    public static void main(String[] args) {
        System.out.println("main()方法开始运行");
        System.out.println("程序正在运行过程中");
        System.err.println("程序运行过程中错误");
        System.out.println("main()方法结束运行");
    }
}
