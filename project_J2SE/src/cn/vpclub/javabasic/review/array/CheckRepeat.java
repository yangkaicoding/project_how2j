package cn.vpclub.javabasic.review.array;

/**
 * <p>
 * Java基础回顾——查找数组中重复的元素
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 16:41
 */
public class CheckRepeat {
    public static void main(String[] args) {
        //初始化一个数组
        int[] arrays = {1, 2, 5, 5, 6, 6, 7, 2};
        //通过双重循环查找数组中的重复元素
        for (int i = 0; i < arrays.length; i++) {
            for (int j = i+1; j < arrays.length; j++) {
                //判断数组中的元素是否相等,若元素相等，则将重复元素输出
                if (arrays[i] == arrays[j] ) {
                    System.out.println("数组中重复的元素为"+arrays[i]);
                }
            }
        }
    }
}
