package cn.vpclub.javabasic.review.loop;

import java.util.Scanner;

/**
 * <p>
 * Java基础实例——为新员工分配部门
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/15 16:53
 */
public class DepartmentAssign {
    /**
     * 语法：switch(n)
     * {
     *   case 1:
     *   执行代码块 1
     *   break;
     * case 2:
     *   执行代码块 2
     *   break;
     * default:
     *   n 与 case 1 和 case 2 不同时执行的代码
     * }
     *
     * 实例中使用switch语句对员工应聘的语言进行判断，但该语句只支持常量的判断，且常量只能是基本数据类型，JDK1.7后支持String类的字符串对象的判断
     *
     * 技巧：1.在switch语法中每个case关键字都可以作为一个条件分支，但是对于多个条件采取相同业务处理的情况，可以把多个case语句分支
     *       关联在一起，省略它们之间的break语句，而在最后一个相同的case分支中实现业务处理并执行break语句
     *       2.JDK版本低于1.7时，使用switch语句判断String类的字符串对象，可以通过String类的hashCode()方法获得字符串对象的哈希码，然后通过哈希码进行判断
     *
     */
    public static void main(String[] args) {
        //创建输入流扫描器
        Scanner scanner = new Scanner(System.in);
        //提示用户输入信息
        System.out.println("请输入新员工的姓名");
        //接收员工输入姓名
        String name = scanner.nextLine();
        System.out.println("请输入新员工应聘的编程语言");
        //接收员工应聘的编程语言
        String language = scanner.nextLine();
        //根据编程语言确定员工分配的部门
        switch (language.hashCode()) {
            case 3254818: //java的哈希码
            case 2301506: //java的哈希码
            case 2269730: //java的哈希码
                System.out.println("员工" + name + "被分配到java程序开发部门");
                break;
            case 3104: //c#的哈希码
            case 2112: //c的哈希码
                System.out.println("员工" + name + "被分配到C#项目维护组");
                break;
            case -709190099: //asp.net的哈希码
            case 955463181: //Asp.net的哈希码
            case 9745901:  //ASP.NET的哈希码
                System.out.println("员工" + name + "被分配到ASP.NET程序测试部门");
                break;
            default:
                System.out.println("本公司不需要" + language + "语言的程序开发人员");
        }
        switch (language) {
            case "html5":
            case "javaScript":
            case "JQuery":
                System.out.println("员工" + name + "被分配到前端页面设计部门");
                break;
            default:
        }
    }
}
