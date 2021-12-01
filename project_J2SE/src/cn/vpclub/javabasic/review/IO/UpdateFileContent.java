package cn.vpclub.javabasic.review.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java基础回顾——以缓冲流的形式读取文件内容，然后先删除文件内容，在对文件内容进行修改
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/25 11:23
 */
public class UpdateFileContent {
    public static void main(String[] args) {
        //实例化文件类
        File file = new File("D:/BILLET TEMP TRACKING.txt");
        //校验是否为文件且文件不为空
        if (!file.isFile() && file.exists()) {
            return;
        }
        //创建集合，以用于存放被修改后的文件
        List<String> list = new ArrayList<>();
        try {
            //创建文件字符流
            FileReader fileReader = new FileReader(file);
            //创建缓存字符输入流，缓冲流必须建立在一个存在的流的基础上
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while (true) {
                //一次读取一行内容
                String content = bufferedReader.readLine();
                //非空判断
                if (null == content) {
                    break;
                }
                //打印结果
                System.out.println(content);
                //将读取到的文件内容存放到集合中
                list.add(content);
            }
            //关闭流，释放资源
            bufferedReader.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {
            //创建文件字符流
            FileWriter fileWriter = new FileWriter(file);
            //创建缓冲字符输出流，缓冲流必须建立在一个存在的流的基础上
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //删除读取到的源文件中的内容
            list.clear();
            //重新写入
            printWriter.print("--- 1");
            //强制刷新
            printWriter.flush();
            //关闭流，释放资源
            printWriter.close();
            System.out.println("文件修改成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
