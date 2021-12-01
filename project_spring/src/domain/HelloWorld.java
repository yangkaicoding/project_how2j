package domain;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>
 * Java类作用描述
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/6/12 19:58
 */
public class HelloWorld {
    private String name;

    public HelloWorld() {
        System.out.println("初始化构造器");
    }

    public void setName(String name) {
        System.out.println("调用了设置名称属性的方法");
        this.name = name;
    }

    public void hello() {
        System.out.println("hello:" + name);
    }

    public static void main(String[] args) {
        //创建spring的Ioc容器的对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //从Ioc的容器中获取bean的实例
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        //调用hello的方法
        helloWorld.hello();
    }
}
