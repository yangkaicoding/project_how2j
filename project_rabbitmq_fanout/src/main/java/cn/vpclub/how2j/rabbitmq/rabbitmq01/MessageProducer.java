package cn.vpclub.how2j.rabbitmq.rabbitmq01;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * <p>
 * 广播模式——消息生产者
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/19 15:04
 */
public class MessageProducer {

    //设置交换机名称
    public final static String EXCHANGE_NAME = "fanout_exchange";

    public static void main(String[] args) throws IOException, TimeoutException {

        //校验RabbitMQ服务器是否启动
        RabbitmqUtil.checkServer();

        //创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置Rabbitmq相关信息
        connectionFactory.setHost("localhost");
        //创建一个新的连接
        Connection connection = connectionFactory.newConnection();
        //创建一个信道
        Channel channel = connection.createChannel();
        //设置交换机声明 (参数为：交换机名称；交换机类型)
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");
        for (int i = 1; i < 100; i++) {
            //设置消息
            String message = "fanout消息" + i + ":" + "您配吗？";
            //发送消息到队列中
            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes("UTF-8"));
            //打印结果
            System.out.println("发送消息" + message);
        }
        //关闭信道和连接
        channel.close();
        connection.close();
    }
}
