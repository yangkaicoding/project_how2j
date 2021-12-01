package cn.vpclub.javabasic.review.loop;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——条件语句：验证登录信息的合法性
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/15 16:08
 */
public class CheckLogin {
    /**
     * 技巧：字符串属于对象而非基本数据类型，不能够使用==来判断两个字符串是否相等，因为使用==判断的是两个字符串对象的地址值而非内容，所以需要通过equals()方法来判断两个字符串内容是否相等
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入登录用户名");
        String username = scanner.nextLine();
        System.out.println("请输入登录密码");
        String password = scanner.nextLine();
        //判断登录信息合法性
        if (!"root".equals(username)) {
            System.out.println("用户非法名");
        } else if (password != "123456") {
            System.out.println("登录密码非法");
        } else {
            System.out.println("登录成功");
        }
    }
}
