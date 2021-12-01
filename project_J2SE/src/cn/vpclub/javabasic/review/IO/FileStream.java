package cn.vpclub.javabasic.review.IO;

import java.io.*;

/**
 * <p>
 * Java基础回顾——文件写入
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/22 11:12
 */
public class FileStream {
    public static void main(String[] args) throws IOException {

        File file = new File("test.text");

        //构建FileOutputStream对象，文件不存在会自动创建
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        //构建OutputStreamWriter对象，参数可以指定编码，默认为操作系统默认编码，windows上是GBK
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");

        //写入缓冲区
        outputStreamWriter.append("我爱你");

        //换行
        outputStreamWriter.append("\r\n");

        outputStreamWriter.append("I Love You");

        //关闭写入流，同时会把缓冲区内容写入文件
        outputStreamWriter.close();

        //关闭输出流，释放系统资源
        fileOutputStream.close();

        //-----------------------------------------------------------------------------------------------

        //构建FileInputStream对象
        FileInputStream fileInputStream = new FileInputStream(file);

        //构建InputStreamReader对象，编码与写入相同
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");

        StringBuffer stringBuffer = new StringBuffer();
        while (inputStreamReader.ready()) {
            //转成char添加到StringBuffer对象中
            stringBuffer.append((char) inputStreamReader.read());
        }
        //打印结果
        System.out.println(stringBuffer.toString());

        //关闭读取流
        inputStreamReader.close();

        //关闭输入流，释放系统资源
        fileInputStream.close();

    }
}
