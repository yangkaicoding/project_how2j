package cn.vpclub.javabasic.review.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * <p>
 * Java基础回顾——以字节流的形式读取文件内容
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/24 16:48
 */
public class FileInputStreamClass {
    public static void main(String[] args) throws IOException {
        //实例化文件类
        File file = new File("D:/logstash.conf");
        //创建基于文件的输入流
        FileInputStream fileInputStream = new FileInputStream(file);
        //创建字节数组，其长度就是文件的长度
        byte[] content = new byte[(int) file.length()];
        //以字节流的形式读取文件所有的内容
        fileInputStream.read(content);
        //打印结果
        for (byte b : content) {
            System.out.println(b);
        }
        //关闭流，释放资源
        fileInputStream.close();
    }
}
