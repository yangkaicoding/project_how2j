package cn.vpclub.javabasic.review.scanner;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——从控制台结束输入字符
 * </p>
 *
 * @author: 杨凯
 * @since:  2018/10/12 14:48
*/
public class InputCode {

    /**
     * 实例中调用了System类的输入流，也就是类变量in,他是标准的输入流对象，可以用于接收用户输入的信息
     * 实例中使用了Scanner类封装了输入流对象，并使用nextLine()方法从输入流中获取用户输入的整行文本字符串，其方法声明为public string newLine();
     * InputStream输入流以字节为单位来获取数据，而且需要复杂的判断并创建字节数组作为缓冲，且容易出现中文乱码的情况，因此对字符数据的读取，应使用Scanner扫描器
     *
     */

    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入您的身份证号");
        //获得用户输入文本
        String s = scanner.nextLine();
        //打印用户输入信息
        System.out.println("您的身份证号为:"+s);
    }
}
