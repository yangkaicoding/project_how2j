package cn.vpclub.how2j.rabbitmq.rabbitmq01;

import cn.hutool.core.util.RandomUtil;
import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * <p>
 * 广播模式——消息消费者
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/19 15:48
 */
public class MessageCustomer {

    //设置交换机名称
    public final static String EXCHANGE_NAME = "fanout_exchange";

    public static void main(String[] args) throws IOException, TimeoutException {

        //校验RabbitMQ服务器是否启动
        RabbitmqUtil.checkServer();

        //为当前消费者取随机名称
        String name = "consumer-" + RandomUtil.randomNumbers(5);
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
        //获取一个临时队列
        String queue = channel.queueDeclare().getQueue();
        //将队列与交换机进行绑定 (参数为：队列名称；交换机名称；routingKey忽略)
        channel.queueBind(queue, EXCHANGE_NAME, "");

        System.out.println("name" + "等待接收消息");

        //DefaultConsumer类实现了Consumer接口，通过传入一个频道，告诉服务器我们需要那个频道的消息，如果频道中有消息，就会执行回调函数handleDelivery
        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                //设置接收到的消息的编码格式
                String message = new String(body, "UTF-8");
                //打印结果
                System.out.println("消息消费者" + name + "接收到的消息" + message + "");
            }
        };
        //自动回复队列应答——rabbitmq中的消息确认机制
        channel.basicConsume(queue, true, consumer);
    }
}
