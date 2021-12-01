package cn.vpclub.javabasic.review.string;

/**
 * <p>
 * Java基础实例——replace和replaceAll的区别
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/23 10:57
 */
public class ReplaceString {
    /**
     * 技巧： replace(CharSequence target, CharSequence replacement),即可以支持字符替换，也可以支持字符串替换
     * replaceAll(String regex, String replacement) regex表示是正则表达式
     * <p>
     * 常用转义符：
     * \b 退格(BS),将当前位置移动到前一行
     * \f 换页(FF),将当前位置移到下页开头
     * \n 换行(LF),将当前位置移到下一行开头
     * \r 回车(CR),将当前位置移到本行开头
     * \t 水平制表(HT),跳到下一个TAB位置
     */
    public static void main(String[] args) {
        //创建字符串对象
        String str = "we%l2、comme3、Souhe";
        //将"e"替换为"E"
        String str1 = str.replace("e", "E");
        System.out.println("\n replace后的字符串为：" + str1);
        //将数字替换为"a"
        String str2 = str.replaceAll("\\d", "a");
        System.out.println("\n replace后的字符串为：" + str2);
        String str3 = str.replaceAll("[^\\w\\d\\s]", ",");
        System.out.println("\n replace后的字符串为：" + str3);
    }
}
