package cn.vpclub.javabasic.review.file;

import java.io.File;

/**
 * <p>
 * Java基础回顾——判断目录是否为空
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/20 16:29
 */
public class CheckFileDirectory {

    /**
     * 技巧：实例中 使用了File类的isDirectory()方法来检查一个对象是否是文件夹
     * 再调用.list()方法返回某个目录下的所有文件和目录的文件名，返回的是String数组
     *
     * @param args
     */
    public static void main(String[] args) {
        //当前文件目录下的test目录
        File file = new File("D:\\test");
        if (file.isDirectory()) {
            if (0 < file.list().length) {
                System.out.println("该目录不为空");
            } else {
                System.out.println("该目录为空的");
            }
        } else {
            System.out.println("这不是一个文件目录");
        }
    }
}
