package cn.vpclub.how2j.rabbitmq.rabbitmq02;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * <p>
 * 指定模式——消息生产者
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/21 16:16
 */
public class MessageProducer {

    //设置交换机名称
    public static final String QUEU_NAME = "direct_queue";

    public static void main(String[] args) throws IOException, TimeoutException {

        //校验RabbitMQ服务器是否启动
        RabbitmqUtil.checkServer();

        //创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置RabbitMQ相关信息
        connectionFactory.setHost("localhost");
        //创建一个新的连接
        Connection connection = connectionFactory.newConnection();
        //创建一个信道
        Channel channel = connection.createChannel();

        for (int i = 0; i < 100; i++) {
            //设置消息
            String message = "direct消息" + ":" + i + "您配吗？";
            //发送消息到队列中
            channel.basicPublish("", QUEU_NAME, null, message.getBytes("UTF-8"));
            //打印结果
            System.out.println("发送消息" + message);
        }
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
