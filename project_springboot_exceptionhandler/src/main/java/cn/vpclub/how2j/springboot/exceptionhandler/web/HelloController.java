package cn.vpclub.how2j.springboot.exceptionhandler.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

/**
 * <p>
 * SpringBoot框架 测试SpringBoot结合JSP全局异常处理前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/27 16:25
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m) throws Exception {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        if (true) {
            throw new Exception("some exception");
        }
        return "hello";
    }
}
