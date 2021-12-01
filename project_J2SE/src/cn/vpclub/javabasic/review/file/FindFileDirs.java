package cn.vpclub.javabasic.review.file;

import java.io.File;

/**
 * <p>
 * Java基础回顾——在指定目录中查找文件
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/20 16:50
 */
public class FindFileDirs {

    /**
     * 技巧：实例中使用了File类的.list()方法在指定目录中查找所有文件列表
     *
     * @param args
     */
    public static void main(String[] args) {
        //当前文件目录下的codeGen目录
        File file = new File("D:\\static\\image\\20190107");
        String[] children = file.list();
        //非空判断
        if (null == children) {
            System.out.println("该目录不存在");
        } else {
            for (String child : children) {
                System.out.println(child);
            }
        }
    }
}
