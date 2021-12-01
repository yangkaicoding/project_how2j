package cn.vpclub.javabasic.review.IO;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Java基础回顾——读取绝对路径下所有的文件夹与文件路径
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/28 9:48
 */
public class ReadAllFilePath {

    //实例化一个Map集合，其中key为文件名，value为文件所在路径
    public static Map<String, String> map = new HashMap<>();

    //实例化一个全局动态数组，以用于存放文件路径，主要用于递归遍历文件夹，文件夹包含所有子文件夹、文件等情况
    public static ArrayList<String> filePaths = new ArrayList();


    /**
     * 仅查询当前路径下的所有文件夹、文件并且存放其路径到文件路径数组中，适用于文件夹中不包含其他子文件夹、文件等情况
     *
     * @param dirFile
     * @return
     */
    public static ArrayList<String> dir(File dirFile) {
        //创建一个字符串数组，以用于存放文件路径
        ArrayList<String> filePathList = new ArrayList<>();

        //校验文件是否存在
        if (dirFile.exists()) {
            //利用listFiles()方法，在指定目录中查找所有的文件列表
            File[] files = dirFile.listFiles();
            //遍历集合
            for (File file : files) {
                //若传递过来的参数dirFile是以文件分割符，也就是/或\结尾，则如此构造
                if (dirFile.getPath().endsWith(File.separator)) {
                    filePathList.add(file.getPath() + file.getName());
                } else {
                    //若传递过来的参数dirFile没有文件分割符，则补上一个文件分割符，再加上文件名称，才是文件路径
                    filePathList.add(dirFile.getPath() + File.separator + file.getName());
                }
            }
        } else {
            System.out.println("该文件不存在");
            return null;
        }
        return filePathList;
    }

    /**
     * 仅查询当前路径下的所有文件夹、文件并且存放其路径到文件路径数组中,适用于文件夹中包含其他子文件夹、文件等情况,需递归调用
     *
     * @param dirFile
     */
    public static void dirAll(File dirFile) {

        //校验文件是否存在
        if (dirFile.exists()) {
            //利用listFiles()方法，在指定目录中查找所有的文件列表
            File[] files = dirFile.listFiles();
            //遍历集合
            for (File file : files) {
                //若文件中包含其他子文件夹、文件则递归调用
                if (file.isDirectory()) {
                    //递归调用
                    dirAll(file);
                } else {
                    //若传递过来的参数dirFile是以文件分割符，也就是/或\结尾，则如此构造
                    if (dirFile.getPath().endsWith(File.separator)) {
                        filePaths.add(dirFile.getPath() + file.getName());
                        map.put(file.getName().substring(0,file.getName().lastIndexOf(".")), dirFile.getPath() + file.getName());
                    } else {
                        //若传递过来的参数dirFile没有文件分割符，则补上一个文件分割符，再加上文件名称，才是文件路径
                        filePaths.add(dirFile.getPath() + File.separator + file.getName());
                        map.put(file.getName().substring(0,file.getName().lastIndexOf(".")), dirFile.getPath() + File.separator + file.getName());
                    }
                }
            }
        } else {
            System.out.println("该文件不存在");
            return;
        }
    }


    public static void main(String[] args) {
        File file1 = new File("D:/test1/");
        File file2 = new File("D:/test2");

        System.out.println(dir(file1));

        System.out.println("--------");

        dirAll(file2);
        System.out.println(filePaths);

        System.out.println("--------");

        dirAll(file2);
        System.out.println(map);
    }
}
