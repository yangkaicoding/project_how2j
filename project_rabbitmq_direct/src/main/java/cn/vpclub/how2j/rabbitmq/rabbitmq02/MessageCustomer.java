package cn.vpclub.how2j.rabbitmq.rabbitmq02;

import cn.hutool.core.util.RandomUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * <p>
 * 指定模式——消息消费者
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/6/4 9:41
 */
public class MessageCustomer {

    //设置交换机名称
    public final static String QUEUE_NAME = "direct_queue";

    public static void main(String[] args) throws IOException, TimeoutException {
        //为当前消息消费者随机取名
        String name = RandomUtil.randomNumbers(5);

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
        //声明要关注的队列
        channel.queueDeclare(QUEUE_NAME, false, false, true, null);

        System.out.println(name + "正在等待接收消息");

        //DefaultConsumer类实现了Consumer接口，通过传入一个频道，告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行会掉函数handleDelivery
        DefaultConsumer defaultConsumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(name + "接收到的消息:" + message + "");
            }
        };
        //自动回复队列应答——RabbitMQ中的消息确认机制
        channel.basicConsume(QUEUE_NAME, true, defaultConsumer);
    }
}
