package cn.vpclub.javabasic.review.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Java基础回顾——日期工具类
 */
public class DateUtil {

    /**
     * 取得当前时间戳（精确到秒）
     *
     * @return
     */
    public static String timeStamp() {
        long time = System.currentTimeMillis();
        String t = String.valueOf(time / 1000);
        return t;
    }

    /**
     * 时间戳转换成日期格式字符串
     *
     * @param seconds 精确到秒的字符串
     * @param format
     * @return
     */
    public static String timeStamp2Date(String seconds, String format) {
        if (seconds == null || seconds.isEmpty() || "null".equals(seconds)) {
            return "";
        }
        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds + "000")));
    }

    /**
     * 日期格式字符串转换成时间戳
     *
     * @param date   字符串日期
     * @param format 如：yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String date2TimeStamp(String date, String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return String.valueOf(sdf.parse(date).getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获得系统当前后30秒的时间
     *
     * @return
     */
    private static String getAfterDate() {
        //实例化时间处理日期类
        Calendar calendar = new GregorianCalendar();
        //格式化当前时间
        java.text.SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置参数时间
        calendar.setTime(new Date(System.currentTimeMillis()));
        //把日期往后推后一个月.整数往后推,负数往前移动
        calendar.add(Calendar.MONTH, 1);
        //获得系统当前时间后30s时间
        String finalTime = sdf.format(calendar.getTime());
        return finalTime;
    }

    private static Long getAfterTime()  {
        Date date = new Date();
        //实例化时间处理日期类
        Calendar calendar = new GregorianCalendar();
        //格式化当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //设置参数时间
        calendar.setTime(date);
        //把日期往后推后一个月.整数往后推,负数往前移动
        calendar.add(Calendar.MONTH, 1);
        //获得系统当前时间后30s时间
        String finalTime = sdf.format(calendar.getTime());
        long currentTime = 0;
        try {
            currentTime = sdf.parse(finalTime).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return currentTime;
    }


    public static void main(String[] args) {
        String afterTime = getAfterDate();
        System.out.println("当前系统时间推后一个月的时间为：" + afterTime);

        String date2TimeStamp = date2TimeStamp(afterTime, "yyyy-MM-dd HH:mm:ss");
        System.out.println("当前系统时间推后一个月的时间为：" + date2TimeStamp);

        Long afterTime1 = getAfterTime();
        System.out.println("当前系统时间推后一个月的时间为：" + afterTime1);

        String timeStamp = timeStamp();
        System.out.println("timeStamp=" + timeStamp);
        //该方法的作用是返回当前的计算机时间，时间的表达格式为当前计算机时间和GMT时间(格林威治时间)1970年1月1号0时0分0秒所差的毫秒数
        System.out.println(System.currentTimeMillis());

        String date = timeStamp2Date(timeStamp, "yyyy-MM-dd HH:mm:ss");
        System.out.println("date=" + date);

        String timeStamp2 = date2TimeStamp(date, "yyyy-MM-dd HH:mm:ss");
        System.out.println(timeStamp2);

        System.out.println();
    }
}
