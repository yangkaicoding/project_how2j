package cn.vpclub.javabasic.review.date;

import java.util.Calendar;

/**
 * <p>
 * Java基础回顾——获取年份、月份等
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/15 17:55
 */
public class CalendarClass {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //获取日期
        int day = cal.get(Calendar.DATE);
        //获取月份
        int month = cal.get(Calendar.MONTH);
        //获取年份
        int year = cal.get(Calendar.YEAR);
        //获取一周的第几天
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        //获取一月的第几天
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        //获取一年的第几天
        int doy = cal.get(Calendar.DAY_OF_YEAR);

        System.out.println("当前时间为：" + cal.getTime());
        System.out.println("当前日期为：" + day);
        System.out.println("当前月份为：" + month);
        System.out.println("当前年份为：" + year);
        System.out.println("一周的第几天：" + dow);
        System.out.println("一月的第几天：" + dom);
        System.out.println("一年的第几天：" + doy);

    }
}
