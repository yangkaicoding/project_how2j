package cn.vpclub.javabasic.review.file;

import java.io.File;

/**
 * <p>
 * Java基础回顾——递归创建文件目录
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/15 11:03
 */
public class RecursiveCreateDirs {

    /**
     * 技巧：实例中使用了java中的File类，通过调用mkdirs()方法从而实现递归创建文件目录
     *
     * @param args
     */
    public static void main(String[] args) {
        //定义文件路径
        String directories = "D://a//b//c//d//e//f//g//h//i";
        //实例化File类
        File file = new File(directories);
        //调用File类的mkdirs()方法，实现递归创建文件目录
        boolean back = file.mkdirs();
        //判断是否成功递归创建文件目录
        if (back) {
            System.out.println("递归创建文件目录成功");
        } else {
            System.out.println("递归创建文件目录失败");
        }
    }
}
