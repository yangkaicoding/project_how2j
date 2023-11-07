package cn.vpclub.javabasic.review.page;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Java基础实例12——实现手动分页
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/15 17:53
 */
public class ManualPage {
    /**
     * 1.使用原生java api进行手动分页
     */
    public static void getPageContentByApi(int pageNum, int pageSize) {

        //创建集合
        List<String> list = new ArrayList<>();
        //添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        //总记录数
        int total = list.size();
        for (int i = 0; i <= total; i++) {
            //开始索引
            int startIndex = (pageNum - 1) * pageSize;
            //结束索引
            int endIndex = startIndex + pageSize;
            //如果结束索引值大于集合的最大值，那么规定结束索引等于集合大小
            if (endIndex > total) {
                //重新赋值
                endIndex = total;
            }
            if (startIndex <= total) {
                List<String> subList = list.subList(startIndex, endIndex);
                if (endIndex >= startIndex) {
                    break;
                }
            }
        }
    }

    /**
     * 2.使用Apache 工具进行手动分页
     */
    public static void getPageContentByApache(int pageNum, int pageSize) {
        // 创建集合
        List<String> list = new ArrayList<>();
        // 添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        // 将List按照指定数量分成小List
        // List<List<String>> partition = ListUtils.partition(list, pageSize);
        if (list.size() < pageNum * pageSize) {
            System.out.println("越界");
        }
    }
}
