package cn.vpclub.javabasic.review.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class test5 {

    public static List<String> getTimes(String selectTime) {

        List<String> timeList = new ArrayList<>();
        List<String> weeksList = new ArrayList<>();

        //若所选时间为空，则默认查询当前时间及前三周的数据
        if (null == selectTime) {
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
                // 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一
                cal.setFirstDayOfWeek(Calendar.MONDAY);
                // 获得当前日期是一个星期的第几天
                int day = cal.get(Calendar.DAY_OF_WEEK);
                // 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值
                cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);
                String imptimeBegin = sdf.format(cal.getTime());
                cal.add(Calendar.DATE, 6);
                String imptimeEnd = sdf.format(cal.getTime());

                String weekBegin = imptimeBegin;
                String weekEnd = imptimeEnd;
                String weekTime = weekBegin + "/" + weekEnd;

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
                date = yesCal.getTime();
                //计数
                j++;
            }
        } else {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            //求前端传参月份的1号
            Calendar calendar = Calendar.getInstance();
            // 这是已知的日期
            String startTime = "2019-05";
            startTime = startTime + "-01";
            Date firstdayDate = null;
            try {
                Date parseTime = format.parse(startTime);
                calendar.setTime(parseTime);
                firstdayDate = parseTime;
            } catch (ParseException e) {
            }
            // 上个月最后一天
            calendar.add(Calendar.MONTH, 1); // 加一个月
            calendar.set(Calendar.DATE, 1); // 设置为该月第一天
            calendar.add(Calendar.DATE, -1); // 再减一天即为上个月最后一天
            String dayLast = format.format(calendar.getTime());
            //最后一天
            Date lastdayDate = calendar.getTime();

            Date date01 = firstdayDate;
            Date date02 = null;
            if (null == date02) {
                date02 = date01;
            }
            //计数
            while (date02.before(lastdayDate) || date02.equals(lastdayDate)) {
                Calendar ca = Calendar.getInstance();
                ca.setTime(date02);
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

                //最后一天
                if (date02.equals(lastdayDate)) {
                    timeList.add(format.format(date02));
                    break;
                }
                //判断该月1号星期几
                Calendar cal = Calendar.getInstance();
                cal.setTime(date02);
                int dayForWeek = 0;
                if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
                    dayForWeek = 7;
                } else {
                    dayForWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;
                }

                String weekEndTime = null;
                String weekStartTime = null;

                if (dayForWeek < 7) {
                    cal.add(Calendar.DAY_OF_WEEK, 7 - dayForWeek);
                    //加
                    Date weekTime = cal.getTime();
                    weekEndTime = format.format(weekTime);
                    weekStartTime = format.format(date02);
                    if (weekTime.after(lastdayDate)) {
                        weekEndTime = dayLast;
                    }

                    //时间是正的
                    timeList.add(weekStartTime + "/" + weekEndTime);

                    //算下周一
                    cal.add(Calendar.DAY_OF_WEEK, 1);
                    date02 = cal.getTime();
                } else {
                    weekStartTime = format.format(date02);
                    timeList.add(weekStartTime);
                    //下周一
                    cal.add(Calendar.DAY_OF_WEEK, 1);
                    date02 = cal.getTime();
                }
            }
        }
        return timeList;
    }

    public static void main(String[] args) {
        List<String> times = getTimes("2019-05");
        System.out.println(times);
    }

}
