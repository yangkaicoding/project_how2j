package cn.vpclub.javabasic.review.loop;

/**
 * <p>
 * Java基础实例——使用while循环语句与自增运算符循环遍历数组
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/16 11:35
 */
public class ErgodicArray {
    /**
     * 技巧：
     * 1.自增自减运算符分为前置自增与后置自增两种，其中前置自增 ++index 会将index的值递增，然后再使用递增后的增，而后置自增 index++ 则会先使用该变量的值，然后再把变量值递增
     * 2.数组获取长度的手段是.length属性 String类获取长度的手段是length()方法 集合获取长度的手段是size()方法 文件获取长度的手段是length()方法
     */
    public static void main(String[] args) {
        //创建鸟类数组
        String[] birds = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "布谷鸟", "灰纹鸟", "百灵鸟"};
        //创建索引变量
        int index = 0;
        System.out.println("我的花园里有很多鸟，种类大约包括：");
        while (index < birds.length) {
            System.out.println(birds[index++]);
        }
    }
}
