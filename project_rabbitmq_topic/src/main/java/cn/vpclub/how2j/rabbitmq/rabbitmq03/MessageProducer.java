package cn.vpclub.how2j.rabbitmq.rabbitmq03;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * <p>
 * 主题模式——消息生产者
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/6/4 10:30
 */
public class MessageProducer {

    //设置交换机名称
    public final static String EXCHANGE_NAME = "topics_exchange";

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
        //设置交换机声明 (参数为：交换机名称；交换机类型)
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");

        String[] routing_keys = new String[]{"usa.news", "usa.weather", "europe.news", "europe.weather"};
        String[] messages = new String[]{"美国新闻", "美国天气", "欧洲新闻", "欧洲天气"};

        for (int i = 0; i < routing_keys.length; i++) {
            String routingKey = routing_keys[i];
            String message = messages[i];

            channel.basicPublish(EXCHANGE_NAME, routingKey, null, message.getBytes());
            System.out.printf("发送消息到路由：%s，内容是：%s%n", routingKey, message);
        }
        //关闭信道和连接
        channel.close();
        connection.close();
    }
}
