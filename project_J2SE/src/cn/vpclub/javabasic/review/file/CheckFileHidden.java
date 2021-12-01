package cn.vpclub.javabasic.review.file;

import java.io.File;

/**
 * <p>
 * Java基础回顾——判断文件是否隐藏
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/20 16:37
 */
public class CheckFileHidden {

    /**
     * 技巧：该实例中调用.isHidden()方法来检查命名此抽象路径名的文件是否是一个隐藏文件
     *
     * @param args
     */
    public static void main(String[] args) {
        //当前文件目录下的test目录
        File file = new File("D:\\test");
        System.out.println(file.isHidden());
    }
}
