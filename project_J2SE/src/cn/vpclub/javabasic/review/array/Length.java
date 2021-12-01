package cn.vpclub.javabasic.review.array;


/**
 * <p>
 * Java基础回顾——获取数组长度
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/16 15:46
 */
public class Length {
    public static void main(String[] args) {
        //定义一个二维数组
        String[][] strings = new String[2][5];
        //获取二维数组长度
        System.out.println("第一维数组长度为" + strings.length);
        System.out.println("第二维数组长度为" + strings[0].length);
    }
}
