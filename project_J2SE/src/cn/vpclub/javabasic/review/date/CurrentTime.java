package cn.vpclub.javabasic.review.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * Java基础回顾——获取当前时间
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/15 17:44
 */
public class CurrentTime {
    public static void main(String[] args) {
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat();
        //a为am/pm的标记
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");
        //获取当前时间
        Date date = new Date();
        //输出当前时间
        System.out.println("当前时间为" + sdf.format(date));
    }
}
