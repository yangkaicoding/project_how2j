package cn.vpclub.javabasic.review.IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java基础回顾——以缓冲流的形式读取文件内容
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/24 17:06
 */
public class BufferedReaderClass {
    public static void main(String[] args) {
        //实例化文件类
        File file = new File("D:/logstash.conf");
        //校验文件是否存在
        if (!file.exists()) {
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
//                //打印结果
                System.out.println(content);
                //逐行匹配每一行的内容
                int i = content.indexOf("jdbc_connection_string");

                int m = content.indexOf("jdbc_user");

                int n = content.indexOf("jdbc_password");

                int j = content.indexOf("source_id");

                if (i != -1) {
                    //截取字符串
                    String substring = content.substring(0, content.lastIndexOf("=>"));
                    //拼接字符串
                    substring = substring + "=> " + "\"" + "jdbc:sqlserver://10.0.1.187;databaseName=wisave_admin" + "\"";
                    //存放被修改后的文件内容
                    list.add(substring);
                } else if (m != -1) {
                    //截取字符串
                    String substring = content.substring(0, content.lastIndexOf("=>"));
                    //拼接字符串
                    substring = substring + "=> " + "\"" + "root" + "\"";
                    //存放被修改后的文件内容
                    list.add(substring);
                } else if (n != -1) {
                    //截取字符串
                    String substring = content.substring(0, content.lastIndexOf("=>"));
                    //拼接字符串
                    substring = substring + "=> " + "\"" + "admin123456" + "\"";
                    //存放被修改后的文件内容
                    list.add(substring);
                } else if (j != -1) {
                    //截取字符串
                    String substring = content.substring(0, content.lastIndexOf("=>"));
                    //拼接字符串
                    substring = substring + "=> " + "\"" + "21" + "\"";
                    //存放被修改后的文件内容
                    list.add(substring);
                } else {
                    list.add(content);
                }
            }
            //关闭流，释放资源
            bufferedReader.close();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        try {
//            //写入文件
//            //创建文件字符流
//            FileWriter fileWriter = new FileWriter(file);
//            //创建缓冲字符输出流，缓冲流必须建立在一个存在的流的基础上
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            //遍历集合
//            for (int i = 0; i < list.size(); i++) {
//                printWriter.print(list.get(i));
//            }
//            //强制刷新
//            printWriter.flush();
//            //关闭流，释放资源
//            printWriter.close();

            //逐行写入文件
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            //遍历集合
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i) + "\t\n");
            }
            //强制刷新
            bufferedWriter.flush();
            //关闭流，释放资源
            bufferedWriter.close();
            System.out.println("文件修改成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

