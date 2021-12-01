package cn.vpclub.javabasic.review.IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * <p>
 * Java基础实例——重定向输出流实现程序日志
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/12 15:15
 */
public class RedirectOutputStream {
    /**
     * 实例中调用了System类中的out err in 成员变量，它们都是final类型的，不能直接赋值，只能通过相应的方法重定向流
     * 方法：1.public static void setOut(printStream out) 用于重新分配System类的标准输出流
     * 方法：2.public static void setErr(printStream err) 用于重新分配System类的错误输出流
     * 方法：3.public static void setIn(printStream in) 用于重新设置System类的标准输入流
     */
    public static void main(String[] args) {
        //保存原有输出流
        PrintStream out = System.out;
        //创建文件输出流
        try {
            PrintStream ps = new PrintStream("./log.txt");
            //设置重定向输出流
            System.setOut(ps);
            //定义整型变量
            int age = 18;
            System.out.println("年龄变量定义成功，初始值为" + age);
            //定义字符串变量
            String sex = "女";
            System.out.println("性别变量定义成功，初始值为" + sex);
            //整合两个变量
            System.out.println("这是个" + sex + "孩子" + "年龄为" + age + "岁");
            //恢复原有的输出流
            System.setOut(out);
            System.out.println("程序运行完毕，请查看日志文件");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        //保存原有输出流
        PrintStream err = System.err;
        //创建文件输出流
        try {
            PrintStream ps = new PrintStream("./log.txt");
            //设置输出流重定向
            System.setErr(ps);
            //定义整型变量
            int age = -1;
            System.err.println("定义年龄变量错误,年龄不能为" + age);
            //定义字符串变量
            String sex = "男女";
            System.err.println("定义性别变量错误,性别不能为" + sex);
            //整合两个变量
            System.err.println("世界上不存在年龄为\" + age + \"性别为\" + sex + \"的人");
            //恢复原有的输出流
            System.setErr(err);
            System.out.println("程序运行完毕，请查看程序日志");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
