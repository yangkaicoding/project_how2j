package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——面向对象
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/11 15:09
 */
public class Hero {

    //1.设计英雄这个类

    //设置英雄的属性
    /**
     * 名称
     */
    String name;

    /**
     * 血量
     */
    float hp;

    /**
     * 护甲
     */
    float armor;

    /**
     * 移速
     */
    int moveSpeed;

    //无参的构造方法 ,如果不写就会默认提供一个无参的构造方法，即隐式构造方法
    public Hero() {
        System.out.println("\n 实例化一个对象时，必然会调用构造方法");
    }

    //有参的构造方法，如果存在有参的构造方法，那么默认的无参构造方法就失效了
    public Hero(String heroName) {
        name = heroName;
    }

    //构造方法的重载
    //带一个参数的构造方法
    public Hero(Float heroHP) {
        hp = heroHP;
    }

    //带两个参数的构造方法
    public Hero(Float heroHP, Float heroArmor) {
        hp = heroHP;
        armor = heroArmor;
    }

    //通过this关键字调用其他构造方法
    public Hero(String heroName, Float heroHP, Float heroArmor) {
        //通过this关键字调用其他构造方法
        this(heroName);
        //通过this关键字访问属性
        this.hp = heroHP;
        this.armor = heroArmor;
    }

    //设计英雄的方法
    //超神
    public String legendary() {
        return "正在超神";
    }

    //获取当前的血量
    public float getHp() {
        return hp;
    }

    //回血
    public float recovery(float boold) {
        //在原来的基础上回复血量
        hp = hp + boold;
        return hp;
    }

    //可变数量参数
    //如果要攻击多个英雄，就需要设计更多的方法，这样类会显得很累赘,例如
    public void attack(Hero h1) {
        System.out.println("\n " + name + "进行了一次攻击，但是不确定打中了谁");

    }

    //方法的重载,会根据传递参数的类型以及数量，自动调用对应的方法
    public void attack(Hero h1, Hero h2, Hero h3) {

    }

    //可变数量参数
    public void attack(Hero... heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("\n " + name + "攻击了" + heroes[i].name);
        }
    }


    //2.创建具体的英雄
    public static void main(String[] args) {
        //
        Hero hero1 = new Hero();
        hero1.name = "盖伦";
        hero1.hp = 5000.0f;
        hero1.armor = 300.0f;
        hero1.moveSpeed = 350;
        //输出的是对象存放在堆中的地址值
        System.out.println(hero1);


        Hero hero2 = new Hero();
        hero2.name = "提莫";
        hero2.hp = 2500.0f;
        hero2.armor = 1000.0f;
        hero2.moveSpeed = 350;
        //输出的是对象所具备的名称属性值
        System.out.println("\n " + hero2.name);

        //添加英雄的动作行为
        //显示英雄盖伦的血量
        System.out.println("\n 当前英雄" + hero1.name + "的血量为" + hero1.getHp());

        //为英雄提莫回复500点血量
        hero2.recovery(500.0f);
        System.out.println("\n 当前英雄" + hero2.name + "的血量为" + hero2.getHp());

        //显示英雄盖伦正在超神
        System.out.println("\n 当前英雄" + hero1.name + hero1.legendary());


        //对象的引用
        Hero h1 = new Hero();
        Hero h2 = new Hero();
        Hero h3;
        Hero h4;
        h3 = h1;
        h4 = h3;
        System.out.println("\n h1对英雄类引用的地址值为" + h1);
        System.out.println("\n h2对英雄类引用的地址值为" + h2);
        System.out.println("\n h3对英雄类引用的地址值为" + h3);
        System.out.println("\n h4对英雄类引用的地址值为" + h4);


        //可变数量参数
        Hero hero3 = new Hero();
        //设置属性
        hero3.name = "盲僧";
        //调用方法
        hero3.attack(hero1);
        hero3.attack(hero1, hero2);


        Hero hero4 = new Hero();
        Hero hero5 = new Hero("妖姬");
        System.out.println(hero4);
        System.out.println(hero5);


    }

}
