package cn.vpclub.javabasic.review.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class test {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //实例化日期类
        Calendar cal = Calendar.getInstance();
        System.out.println("现在时间：" + sdf.format(cal.getTime()));

        //分别获取年、月、日
        //老外把一月份整成了0，翻译成中国月份要加1
        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日：" + cal.get(Calendar.DATE));

        //计算本周
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        String weekHand = sdf.format(cal.getTime());
        System.out.println("当前时间所在周周一日期：" + weekHand);
        //cal.set(cal.DAY_OF_WEEK, cal.SUNDAY);这个不符合中国人的时间观，老外把上周周日定为一周的开始
        cal.set(Calendar.DATE, cal.get(Calendar.DATE) + 6);
        String weekLast = sdf.format(cal.getTime());
        System.out.println("当前时间所在周周日日期：" + weekLast);


        //计算上周
        System.out.println("当前时间所在上周周一日期为" + sdf.format(getBeforeWeek(weekHand)));
        System.out.println("当前时间所在上周周日日期为" + sdf.format(getBeforeTime(weekHand)));



    }


    public static Date getBeforeTime(String date) {
        //实例化时间处理日期类
        Calendar calendar = new GregorianCalendar();
        //格式化当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置参数时间
        try {
            calendar.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //把日期往后增加30秒.整数往后推,负数往前移动
        calendar.add(Calendar.DATE, -1);
        //获得系统当前时间后30s时间
        String finalTime = sdf.format(calendar.getTime());
        Date parse = null;
        try {
            parse = sdf.parse(finalTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

    public static Date getBeforeWeek(String date) {
        //实例化时间处理日期类
        Calendar calendar = new GregorianCalendar();
        //格式化当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置参数时间
        try {
            calendar.setTime(sdf.parse(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        //把日期往后增加30秒.整数往后推,负数往前移动
        calendar.add(Calendar.DATE, -7);
        //获得系统当前时间后30s时间
        String finalTime = sdf.format(calendar.getTime());
        Date parse = null;
        try {
            parse = sdf.parse(finalTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return parse;
    }

}
