package cn.vpclub.javabasic.review.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test2 {


    /**
     * 给定两个起始日期，按照周进行分组
     *
     * @param a
     * @param b
     * @return
     * @throws ParseException
     */
    public static List<String> groupByWeek(String a, String b) throws ParseException {

        List<String> time = new ArrayList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date ad = sdf.parse(a);
        Date bd = sdf.parse(b);

        Calendar cl1 = Calendar.getInstance();
        cl1.setTime(ad);
        Calendar cl2 = Calendar.getInstance();
        cl2.setTime(bd);
        Calendar cl3 = Calendar.getInstance();

        //判断起始日期为周几
        if (cl1.get(Calendar.DAY_OF_WEEK) == 1) {
            time.add(a);
        } else {
            cl1.add(Calendar.DAY_OF_MONTH, 8 - cl1.get(Calendar.DAY_OF_WEEK));
            time.add(a + "/" + sdf.format(cl1.getTime()));
        }
        do {
            cl1.add(Calendar.DAY_OF_MONTH, 1);
            String s = sdf.format(cl1.getTime());
            cl1.add(Calendar.DAY_OF_MONTH, 6);
            time.add(s + "/" + sdf.format(cl1.getTime()));
            cl3.setTime(cl1.getTime());
            cl3.add(Calendar.DAY_OF_MONTH, 7);
        } while (cl3.getTime().getTime() < cl2.getTime().getTime());
        cl1.add(Calendar.DAY_OF_MONTH, 1);
        String s = sdf.format(cl1.getTime());
        if (s.equals(b)) {
            time.add(s);
        } else {
            time.add(s + "/" + b);
        }
        return time;
    }

    public static void main(String[] args) {
        try {
            List<String> list = groupByWeek("2019-04-29", "2019-05-26");
            System.out.println(list);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
