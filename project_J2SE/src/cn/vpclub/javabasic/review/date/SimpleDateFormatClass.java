package cn.vpclub.javabasic.review.date;


import java.util.Date;

/**
 * <p>
 * Java基础回顾——格式化时间
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/15 17:34
 */
public class SimpleDateFormatClass {
    public static void main(String[] args) {
        //实例化日期工具类
        Date date = new Date();
        String strDateFormat = "yyyy/MM/dd HH:mm:ss";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(strDateFormat);
        //打印格式化的日期
        System.out.println(sdf.format(date));

        System.out.println("---------------------------------------------------------");

        /**
         * 时间戳转换为时间
         *
         * 日期和时间模式(注意大小写，代表的含义是不同的)
         */
        //yyyy : 年
        // MM  : 月
        // dd  : 日
        // hh  : 1-12小时制
        // HH  : 24小时制
        // mm  : 分
        // ss  : 秒
        // s   : 毫秒
        // E   : 星期几
        // D   : 一年中的第几天
        // F   : 一个月中的第几个星期(会把这个月总共过的天数除以7)
        // w   : 一年中的第几个星期
        // W   : 一个月中的第几个星期(会根据实际情况来算)
        // a   : 上下午标识
        // k   : 一天24小时制(1-24)
        // K   : 一天12小时制(1-12)
        // z   : 表示时区

        //获取当前时间戳
        Long timeStamp = System.currentTimeMillis();
        java.text.SimpleDateFormat simpleDateFormat1 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //时间戳转换为时间
        String sd1 = simpleDateFormat1.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        //打印转换后的时间
        System.out.println("格式化后的结果为：" + sd1);

        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒");
        //时间戳转换为时间
        String sd2 = simpleDateFormat2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        //打印转换后的时间
        System.out.println("格式化后的结果为：" + sd2);


    }
}
