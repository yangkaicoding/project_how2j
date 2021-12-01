package cn.vpclub.javabasic.review.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test2 {
    public static void main(String[] args) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");

        List<String> timeList = new ArrayList<>();
        List<String> weeksList = new ArrayList<>();

        Date date = new Date();
        String startTime = dateFormat.format(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        //得到本周的周一
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        calendar.add(Calendar.WEEK_OF_MONTH, -3);//前三个星期
//        calendar.set(Calendar.HOUR_OF_DAY, 0);//时
//        calendar.set(Calendar.MINUTE, 0);//分
//        calendar.set(Calendar.SECOND, 0);//秒
        String endTime = dateFormat.format(calendar.getTime());

        //求四周时间段
        Date dateTime = new Date();
        int j = 0;
        while (j < 4) {
            Calendar ca = Calendar.getInstance();
            ca.setTime(dateTime);
            //计算周
            int year = ca.get(Calendar.YEAR);
            int week = ca.get(Calendar.WEEK_OF_YEAR);
            String twoWeeks = null;
            if (week / 10 < 1) {
                twoWeeks = String.valueOf(year) + String.valueOf(0) + String.valueOf(week);
            } else {
                twoWeeks = String.valueOf(year) + String.valueOf(week);
            }
            weeksList.add(twoWeeks);

            //记录时间根据记录时间获取当周的时间段
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateTime);
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
            // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
            cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
            String imptimeBegin = sdf.format(cal.getTime());
            // System.out.println("所在周星期一的日期：" + imptimeBegin);
            cal.add(Calendar.DATE, 6);
            String imptimeEnd = sdf.format(cal.getTime());
            // System.out.println("所在周星期日的日期：" + imptimeEnd);
            String weekBegin = imptimeBegin;
            String weekEnd = imptimeEnd;
            String weekTime = weekBegin + "/" + weekEnd;

            //todo 时间是反的
            //加上包括当前时间的前三周时间段
            timeList.add(weekTime);
            //计算上周时间
            Calendar yesCal = Calendar.getInstance();
            try {
                Date yesDay = sdf.parse(weekBegin);
                yesCal.setTime(yesDay);
                //减一周，求上周时间
                yesCal.add(Calendar.DAY_OF_WEEK, -7);
            } catch (ParseException e) {
            }
            dateTime = yesCal.getTime();
            //计数
            j++;
        }
        System.out.println(timeList);

        for (int i = 0; i < timeList.size(); i++) {
            //初始化赋值
            String beginTime = null;
            String finshTime = null;

            String string1 = timeList.get(i).substring(0, timeList.get(i).lastIndexOf("/"));
            beginTime = string1;
            System.out.println(beginTime);

            String string2 = timeList.get(i).substring(timeList.get(i).lastIndexOf("/") + 1);
            endTime = string2;
            System.out.println(endTime);


        }
    }
}
