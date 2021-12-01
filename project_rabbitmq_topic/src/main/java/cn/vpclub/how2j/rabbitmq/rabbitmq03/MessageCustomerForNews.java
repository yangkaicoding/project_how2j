package cn.vpclub.how2j.rabbitmq.rabbitmq03;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * <p>
 * 主题模式——新闻消息消息消费者
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/6/4 10:52
 */
public class MessageCustomerForNews {

    //设置交换机名称
    public final static String EXCHANGE_NAME = "topics_exchange";

    public static void main(String[] args) throws IOException, TimeoutException {
        //为当前消息消费者取名
        String name = "consumer-news";

        //校验RabbitMQ服务器是否启动
        RabbitmqUtil.checkServer();
        //创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        //设置RabbitMQ地址
        connectionFactory.setHost("localhost");
        //创建一个新的连接
        Connection connection = connectionFactory.newConnection();
        //创建一个信道
        Channel channel = connection.createChannel();
        //设置交换机声明（参数为：交换机名称；交换机类型）
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        //获取一个临时队列
        String queueName = channel.queueDeclare().getQueue();
        //接收usa消息
        channel.queueBind(queueName, EXCHANGE_NAME, "*.news");
        System.out.println(name + "等待接收消息");

        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(name + "接收到的消息为：" + message);
            }
        };
        //自动回复队列应答——RabbitMQ中的消息确认机制
        channel.basicConsume(queueName, true, defaultConsumer);
    }
}
