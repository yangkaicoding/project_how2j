package cn.vpclub.javabasic.review.loop;

/**
 * <p>
 * Java基础实例——使用break终止循环体和continue循环体过滤器
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/16 17:29
 */
public class BreakOrFilterCyc {
    /**
     * 技巧： break和continue语句都是对循环体控制的语句，它们可以在任何循环语句中使用，灵活使用可以让循环实现更加复杂的运算和业务处理
     * 区别：
     * break用于完全结束一个循环，跳出循环体，不管是哪种循环，一旦在循环体中遇到break系统将完全结束循环，开始执行循环之后的代码
     * break不仅可以结束其所在的循环，还可以结束其外层循环，此时需要在break后紧跟一个标签，这个标签用于标识一个外层循环，Java中的标签就是一个紧跟英文冒号:的标识符，且它必须放到循环语句之前才有作用
     *
     * continue用于终止本次循环，接着开始下一次循环，充当的是一个循环体过滤器
     * return并不是专门用于跳出循环的，return的功能是结束一个方法，一旦在循环体内执行到一个return语句，return语句将会直接结束整个方法，不管这个return处于多少层循环之内
     *
     */
    public static void main(String[] args) {
        System.out.println("\n-------------------中断单层循环例子-------------------");
        //创建鸟类一维数组
        String[] birds = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "灰纹鸟", "老鹰", "百灵鸟"};
        System.out.println("在你发现第一只老鹰之前，告诉我都有什么鸟？");
        //遍历一维数组
        for (String bird : birds) {
            //若发现老鹰，则中单循环，否则输出数组全部元素
            if ("老鹰".equals(bird)) {
                continue;
            }
            System.out.println("在发现第一只老鹰之前,有" + bird);
        }

        System.out.println("\n-------------------中断双层循环例子-------------------");
        //创建成绩二维数组
        int[][] scores = new int[][]{{67, 78, 63, 22, 66}, {55, 68, 78, 95, 44}, {95, 97, 92, 93, 81}};
        System.out.println("小猪佩奇这次的考试成绩：\n 语文\t 数学\t 英语\t 物理\t 化学");
        //遍历二维数组
        No1:
        for (int[] score : scores) {
            No2:
            for (int s : score) {
                //输出成绩
                System.out.print(s +"\t"+"\t");
                //若成绩不及格，立刻中断所有输出
                if (s < 60) {
                    System.out.println("\n 等等" + s + "分的是什么科目？为什么不及格了");
                    break No1;
                }
            }
            System.out.println();
        }

        System.out.println("\n-------------------循环体的过滤器例子-------------------");
        //创建鸟类一维数组
        String[] array = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟", "老鹰", "灰纹鸟", "老鹰", "百灵鸟"};
        System.out.println("在我的花园中有很多种鸟类，但是最近来了几只老鹰,请帮我把它们抓住");
        int eagleCount=0;
        //遍历数组
        for (String str : array) {
            if ("老鹰".equals(str)){
                System.out.println("发现了一只老鹰，已经抓到笼子里了");
                eagleCount++;
                continue;
            }
            System.out.println("搜索鸟类，发现了："+str);
        }
        System.out.println("一共抓到了"+eagleCount+"只老鹰");
    }
}
