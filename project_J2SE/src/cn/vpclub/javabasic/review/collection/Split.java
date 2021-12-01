package cn.vpclub.javabasic.review.collection;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * <p>
 * Java基础回顾——拆分List集合
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/17 10:22
 */
public class Split {

    public static void main(String[] args) {
        //实例化一个集合
        List<String> resList = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100");
        //拆分集合
        List<List<String>> list = split(resList, 10);
        //打印结果
        System.out.println(list);
    }


    /**
     * 拆分集合
     *
     * @param <T>
     * @param resList 要拆分的集合
     * @param count   每个集合的元素个数
     * @return 返回拆分后的各个集合
     */
    private static <T> List<List<T>> split(List<T> resList, int count) {

        //非空判断
        if (resList == null || count < 1) {
            return null;
        }

        int size = resList.size();
        List ret = new ArrayList<List>();
        //数据量不足count指定的大小
        if (size <= count) {
            ret.add(resList);
        } else {
            int pre = size / count;
            int last = size % count;
            //前面pre个集合，每个大小都是count个元素
            for (int i = 0; i < pre; i++) {
                List<T> itemList = new ArrayList<T>();
                for (int j = 0; j < count; j++) {
                    itemList.add(resList.get(i * count + j));
                }
                ret.add(itemList);
            }
            //last的进行处理
            if (last > 0) {
                List<T> itemList = new ArrayList<T>();
                for (int i = 0; i < last; i++) {
                    itemList.add(resList.get(pre * count + i));
                }
                ret.add(itemList);
            }
        }
        return ret;
    }
}
