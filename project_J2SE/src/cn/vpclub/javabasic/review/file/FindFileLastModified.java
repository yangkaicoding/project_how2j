package cn.vpclub.javabasic.review.file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * <p>
 * Java基础回顾——获取目录最后修改时间
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/3/20 17:13
 */
public class FindFileLastModified {

    public static void main(String[] args) {
        File file = new File("D:\\codeGen\\cn");
        //获取目录最后修改时间
        long lastModifiedTime = file.lastModified();
        //实例化时间格式化类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化最后修改时间
        String lastModifiedDate = sdf.format(lastModifiedTime);
        System.out.println("当前目录最后修改时间为：" + lastModifiedDate);
    }
}
