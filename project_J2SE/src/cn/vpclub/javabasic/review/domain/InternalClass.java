package cn.vpclub.javabasic.review.domain;
/**
 * <p>
 * Java基础回顾——内部类
 * </p>
 *
 * @author: 杨凯
 * @since:  2018/10/30 19:26
*/
public class InternalClass {

    /**
     * 技巧：非静态内部类可以直接在一个类里定义，其实例化过程必须建立在外部类的基础之上，同时其可以直接访问外部类私有化的属性
     * 例子：英雄的战斗成绩，必须建立在一个存在的英雄基础之上
     * 语法：new 外部类().new 内部类()
     */
    //姓名
    private String name;

    //血量
    float hp;

    //护甲
    float armor;

    //移速
    int moveSpeed;

    //非静态内部类，只有当一个外部类对象存在的时候，才有意义
    //战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore{
        //击杀数
        int kill;

        //死亡数
        int die;

        //补兵数
        int assit;

        //声明一个超神的方法
        public void legendary(){
            if (kill>=8){
                System.out.println("当前英雄"+name+"正在超神");
            }else {
                System.out.println("当前英雄"+name+"尚未超神");
            }
        }
    }


    public static void main(String[] args) {
        //实例化外部类
        InternalClass hero = new InternalClass();
        //设置外部类对象的名称属性
        hero.name="盖伦";
        //实例化内部类,其实例化必须建立在外部类的基础之上
        BattleScore battleScore =hero.new BattleScore();
        //设置内部类对象的击杀数属性
        battleScore.kill=9;
        //调用方法
        battleScore.legendary();

    }
}
