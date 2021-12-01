package cn.vpclub.how2j.springboot.jsp.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.util.Date;

/**
 * <p>
 * SpringBoot框架 测试SpringBoot对JSP支持前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/27 11:52
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
}
