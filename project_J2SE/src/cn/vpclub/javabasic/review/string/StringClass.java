package cn.vpclub.javabasic.review.string;

import java.util.Locale;
import java.util.StringTokenizer;

/**
 * <p>
 * Java基础回顾——字符串类的系列操作
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/13 14:40
 */
public class StringClass {

    //定义一个删除字符串中的一个字符的方法
    public static String removeChar(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }

    public static void main(String[] args) {

        /**
         * 字符串转换大小写
         */
        //定义一个字符串对象
        String str1 = "Abc";
        //将字符串转换为大写
        System.out.println(str1.toUpperCase());
        //将字符串转换为小写
        System.out.println(str1.toLowerCase());

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串之间相互比较
         *
         * 技巧：通过字符串函数compare To(String),compareToIgnore(String)来比较两个字符串，并返回字符串中第一个字母ASCII的差值
         * 思路：两个字符数组依次从前开始比较，如果对象位置出现字符不同则返回两个字符的编码之差，后面的字符不再比较;如果两个字符
         *      数组的长度不一样，并且较短的数组和较长的数组所有对应位置的字符都相同，则返回两个数组的长度之差
         */
        //定义两个字符串对象
        String str2 = "Hello World";
        String str3 = "hello world";
        System.out.println(str2.compareTo(str3));
        //忽略大小写进行比较
        System.out.println(str2.compareToIgnoreCase(str3));

        System.out.println("-------------------------------------------------------------");

        /**
         * 查找字符串最后一次出现的位置
         *
         * 技巧：通过字符串函数String.lastIndexOf(StringName)来查找子字符串StringName在String中出现的位置
         */
        //创建一个字符串对象
        String str4 = "Hello World ,Hello Runoob";
        int indexOf = str4.lastIndexOf("Runoob");
        if (indexOf == -1) {
            System.out.println("没有找到字符串 Runnob");
        } else {
            System.out.println("Runnob 字符串最后出现的位置为：" + indexOf);
        }

        System.out.println("-------------------------------------------------------------");

        /**
         * 删除字符串的第一个字符
         *
         * 技巧：通过字符串函数substring(int beginIndex)函数来删除字符串中的一个字符，返回一个新的字符串，它是此字符串的一个子字符串
         *      通过字符串函数substring(int beginIndex,int endIndex)函数来删除字符串中的一个字符，返回一个新的字符串，它是此字符串的一个子字符串,包含开始，不包含结束
         *
         */
        //创建一个字符串对象
        String str5 = "this is java";
        System.out.println(removeChar(str5, 3));
        System.out.println(str5.substring(1, 3));

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串替换
         *
         * 技巧：通过字符串函数replace(char oldChar, char newChar)进行字符串替换，返回一个新的字符串，它是通过newChar替换此字符串中出现的所有oldChar得到的
         *      通过字符串函数replaceFirst(String regex, String replacement)使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串
         *     通过字符串函数replaceAll(String regex, String replacement)使用给定的 replacement 替换此字符串所有匹配匹配给定的正则表达式的子字符串
         */
        //创建一个字符串对象
        String str6 = "Hello World";
        System.out.println(str6.replace('H', 'h'));
        System.out.println(str6.replaceFirst("He", "Wa"));
        System.out.println(str6.replaceAll("He", "Ha"));

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串反转
         *
         * 技巧：通过字符串函数StringBuffer(String).reverse()将此字符序列用其反转形式取代
         *
         */
        //创建一个字符串对象
        String str7 = "runoob";
        String reverse = new StringBuffer(str7).reverse().toString();
        System.out.println("字符串反转前：" + str7);
        System.out.println("字符串反转后：" + reverse);

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串搜索
         *
         * 技巧：通过字符串函数indexOf()在字符串中查找子字符串出现的位置，如果存在返回字符串出现的位置(第一位为0)，如果不存在返回-1
         */
        //创建一个字符串对象
        String str8 = "Google Runoob TaoBao";
        int index = str8.indexOf("Runoob");
        if (index == -1) {
            System.out.println("没有找到字符串 Runoob");
        } else {
            System.out.println("Runoob 字符串位置为" + index);
        }

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串分割
         *
         * 技巧：通过字符串函数split(String)通过指定分割符将字符串分割为数组
         *
         * 方法1：
         */
        //方法1：
        //创建一个字符串对象
        String str9 = "www-runoob-com";
        //创建一个字符串数组
        String[] temp;
        //指定分割字符
        String delimeter = "-";
        //分割字符串
        temp = str9.split(delimeter);
        //打印分割后的字符串数组
        for (String s : temp) {
            System.out.print(s);
            //换行
            System.out.println("");
        }

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串分割
         *
         * 技巧：通过StringTokenizer(String str)工具类，构造一个用来解析str的StringTokenizer对象,java默认的分割符为空格("")、制表符(\t)、换行符(\n)、回车符(\r)
         *
         * 构造方法：StringTokenizer(String str，String delim) 构造一个用来解析str的StringTokenizer对象，并提供一个指定的分割符
         *          StringTokenizer(String str, String delim, boolean returnDelims) 构造一个用来解析str的StringTokenizer对象，并提供一个指定的分割符，同时，指定是否返回分割符
         *
         * 常用方法：int countTokens():返回nextToken方法被调用的次数
         *          boolean hasMoreTokens()  :返回是否还有分割符
         *         boolean hasMoreElements():返回是否还有分割符
         *        string nextToken()  :返回从当前位置到下一个分隔符的字符串
         *       object nextElement():返回从当前位置到下一个分隔符的字符串
         *      string nextToken(String delim): 以指定的分割符返回结果
         *
         * 方法2：
         */
        //创建一个字符串对象
        String str10 = "www-runoob-com";
        //实例化对象，并以"-"对字符串进行分割
        StringTokenizer stringTokenizer = new StringTokenizer(str10, "-");
        //对字符串遍历并进行打印
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串格式化
         */
        double e = Math.E;
        System.out.format("%f%n", e);
        //指定本地为中国
        System.out.format(Locale.CHINA, "%-10.4f%n%n", e);

        System.out.println("-------------------------------------------------------------");

        /**
         * 字符串拼接性能测试
         *
         * 分析："+"操作符为每个字符串变量赋值，公用一个内值，占用一份内存空间;stringBuffer每次都会新建一个对象，内存分配新的空间
         */
        //开始时间
        Long startTime1 = System.currentTimeMillis();
        //拼接字符
        for (int i = 0; i < 5000; i++) {
            String result = "This is" + "testing the" + "difference" + "between" + "String" + "and" + "StringBuffer";

        }
        //结束时间
        Long endTime1 = System.currentTimeMillis();
        //打印耗时
        System.out.println("使用+操作符拼接字符串的耗时为：" + (endTime1 - startTime1) + "ms");

        //开始时间
        Long startTime2 = System.currentTimeMillis();
        //拼接字符
        for (int i = 1; i < 5000; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("This is");
            stringBuffer.append("testing the");
            stringBuffer.append("difference");
            stringBuffer.append("between");
            stringBuffer.append("String");
            stringBuffer.append("and");
            stringBuffer.append("StringBuffer");
        }
        //结束时间
        Long endTime2 = System.currentTimeMillis();
        //打印耗时
        System.out.println("使用stringBuffer拼接字符串耗时为" + (endTime2 - startTime2) + "ms");


    }


}
