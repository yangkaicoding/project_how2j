package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——多态
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/10/30 15:46
 */
public class MagicPotion extends Item {

    @Override
    public void effect() {
        System.out.println("蓝瓶使用后，可以回复蓝量");
    }
}
