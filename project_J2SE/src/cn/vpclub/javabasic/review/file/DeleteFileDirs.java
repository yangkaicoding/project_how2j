package cn.vpclub.javabasic.review.file;

import java.io.File;

/**
 * <p>
 * Java基础回顾——删除目录
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/15 11:15
 */
public class DeleteFileDirs {

    /**
     * 技巧：实例中 使用了File类的isDirectory()方法来检查一个对象是否是文件夹
     *             再调用.list()方法返回某个目录下的所有文件和目录的文件名，返回的是String数组
     *            再调用.delete()方法来删除文件目录
     *
     * @param args
     */
    public static void main(String[] args) {
        //删除当前目录下的test目录
        deleteDirs(new File("D:\\test"));
    }

    public static boolean deleteDirs(File file) {
        if (file.isDirectory()) {
            String[] children = file.list();
            for (int i = 0; i < children.length; i++) {
                //递归调用
                boolean success = deleteDirs(new File(file, children[i]));
                if (!success) {
                    return false;
                }
            }
        }
        if (file.delete()) {
            System.out.println("目录已被删除");
            return true;
        } else {
            System.out.println("目录删除失败");
            return false;
        }
    }
}
