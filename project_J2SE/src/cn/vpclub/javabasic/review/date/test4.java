package cn.vpclub.javabasic.review.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test4 {
    public static void main(String[] args) {

        List<String> timeList = new ArrayList<>();
        List<String> weeksList = new ArrayList<>();

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

        System.out.println(timeList);
    }
}
