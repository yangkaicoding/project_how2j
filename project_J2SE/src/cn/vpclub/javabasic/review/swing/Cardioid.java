package cn.vpclub.javabasic.review.swing;

import javax.swing.*;
import java.awt.*;

public class Cardioid extends JFrame {

    //获取屏幕大小
    private static final int WIDTH = 600;
    private static final int HEIGHT = 600;

    private static int WINDOW_WIDTH = Toolkit.getDefaultToolkit().getScreenSize().width;
    private static int WINDOW_HEIGHT = Toolkit.getDefaultToolkit().getScreenSize().height;

    public Cardioid() {
        //设置窗口标题
        super("I love you");
        //设置背景颜色
        this.setBackground(Color.BLACK);
        //设置窗口位置
        this.setLocation((WINDOW_WIDTH - WIDTH) / 2, (WINDOW_HEIGHT - HEIGHT) / 2);
        //设置窗口大小
        this.setSize(WIDTH, HEIGHT);
        //设置窗口布局
        this.setLayout(getLayout());
        //设置窗口可见
        this.setVisible(true);
        //设置窗口默认关闭方式
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        //横纵坐标以及半径
        double x, y, r;
        Image image = this.createImage(WIDTH, HEIGHT);
        Graphics pic = image.getGraphics();
        for (int i = -2; i < 90; i++) {
            for (int j = -2; j < 90; j++) {
                r = Math.PI / 45 + Math.PI / 45 * i * (1 - Math.sin(Math.PI / 45 * j)) * 18;
                x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i) + WIDTH / 2;
                y = -r * Math.sin(Math.PI / 45 * j) + HEIGHT / 3;
                pic.setColor(Color.MAGENTA);
                pic.fillOval((int) x, (int) y, 2, 2);
            }
            //生成图片
            g.drawImage(image, 0, 0, this);
        }
    }

    public static void main(String[] args) {
        new Cardioid();
    }
}


