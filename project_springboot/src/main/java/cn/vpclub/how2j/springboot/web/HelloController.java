package cn.vpclub.how2j.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * SpringBoot框架 测试SpringBoot前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/4/19 10:20
 */
@RestController
public class HelloController {

    /**
     * 概述：该类就是Spring MVC里的一个普通的控制器，@RestController 是spring4里的新注解，是@ResponseBody和@Controller的缩写。
     */
    @RequestMapping("hello")
    public String hello() { return "Hello 五夭夭,我是Spring Boot"; }
}
