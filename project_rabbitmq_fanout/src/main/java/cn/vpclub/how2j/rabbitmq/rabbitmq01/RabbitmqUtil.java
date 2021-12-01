package cn.vpclub.how2j.rabbitmq.rabbitmq01;

import cn.hutool.core.util.NetUtil;

import javax.swing.*;

/**
 * <p>
 * rabbitmq 工具类
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/19 15:14
 */
public class RabbitmqUtil {

    public static void main(String[] args) {
        checkServer();
    }

    /**
     * 校验RabbitMQ服务器是否启动
     */
    public static void checkServer() {
        if (NetUtil.isUsableLocalPort(15672)) {
            JOptionPane.showMessageDialog(null, "RabbitMQ 服务器未启动");
            System.exit(1);
        }
    }
}
