package cn.vpclub.javabasic.review.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test3 {

    public static List<String> getTimes() {

        List<String> timeList = new ArrayList<>();
        List<String> weeksList = new ArrayList<>();

        Date date = new Date();
        //求四周时间段
        int j = 0;
        while (j < 4) {
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);


            //计算周
            int year = ca.get(Calendar.YEAR);
            int week = ca.get(Calendar.WEEK_OF_YEAR);
            String weeks = null;
            if (week / 10 < 1) {
                weeks = String.valueOf(year) + String.valueOf(0) + String.valueOf(week);
            } else {
                weeks = String.valueOf(year) + String.valueOf(week);
            }
            weeksList.add(weeks);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            // 判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了
            int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天
            if (1 == dayWeek) {
                cal.add(Calendar.DAY_OF_MONTH, -1);
            }
            // System.out.println("要计算日期为:" + sdf.format(cal.getTime())); // 输出要计算日期
            // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
            cal.setFirstDayOfWeek(Calendar.MONDAY);
            // 获得当前日期是一个星期的第几天
            int day = cal.get(Calendar.DAY_OF_WEEK);
            // 根据日历的规则，即当前日期减去星期几与一个星期第一天的差值
            cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
            String imptimeBegin = sdf.format(cal.getTime());
            // System.out.println("所在周星期一的日期：" + imptimeBegin);
            cal.add(Calendar.DATE, 6);
            String imptimeEnd = sdf.format(cal.getTime());
            // System.out.println("所在周星期日的日期：" + imptimeEnd);

            String weekBegin = imptimeBegin;
            String weekEnd = imptimeEnd;
            String weekTime = weekBegin.substring(5) + "/" + weekEnd.substring(5);

            //todo 时间是反的
            //加上包括当前时间的前三周时间段
            timeList.add(weekTime);


            //计算上周时间
            Calendar yesCal = Calendar.getInstance();
            try {
                Date yesDay = sdf.parse(weekBegin);
                yesCal.setTime(yesDay);
                //减一周，求上周时间
                //todo 存在跨月的情况



                yesCal.add(Calendar.DAY_OF_WEEK, -7);

            } catch (ParseException e) {
            }
            date = yesCal.getTime();

            //计数
            j++;
        }
        return timeList;
    }


    public static void main(String[] args) {
        List<String> times = getTimes();

        System.out.println(times);

    }
}
