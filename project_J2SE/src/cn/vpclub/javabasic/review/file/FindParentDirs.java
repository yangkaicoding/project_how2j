package cn.vpclub.javabasic.review.file;

import java.io.File;

/**
 * <p>
 * Java基础回顾——获取文件的上级目录
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/20 17:05
 */
public class FindParentDirs {

    /**
     * 技巧：实例中使用了File类的.getParent()方法来获取文件的上级目录
     *
     * @param args
     */
    public static void main(String[] args) {
        //当前文件目录下的cn目录
        File file = new File("D:\\codeGen\\cn");
        //获得当前文件目录的上级目录
        String parentDir = file.getParent();
        System.out.println("该文件的上级目录为：" + parentDir);
    }
}
