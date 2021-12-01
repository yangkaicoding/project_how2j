package cn.vpclub.springmvc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller {

    private static Log logger = LogFactory.getLog(HelloController.class);

    /**
     * 使用配置的方式进行跳转设置
     * handleRequest是controller接口必须实现的方法，该方法的参数是对应的HttpServletRequest和HttpServletResponse，该方法必须返回一个包含视图和模型的ModelAndView对象
     *
     * @param httpServletRequest
     * @param httpServletResponse
     * @return
     * @throws Exception
     */
    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("handleRequest被调用");
        //创建准备返回的ModelAndView对象，该对象通常包含了返回视图名、模型的名称已经模型对象
        ModelAndView modelAndView = new ModelAndView();
        //设置逻辑视图名称，视图解析器会根据该名字解析到具体的视图页面
        modelAndView.setViewName("/index.jsp");
        //添加模型数据，可以是任意的pojo对象
        modelAndView.addObject("message", "Hello spring mvc");
        logger.info("返回modelAndView对象");
        return modelAndView;
    }

    /**
     * 使用注解的方式进行跳转设置
     *
     */
    /*@Controller
    public class IndexController {
        @RequestMapping("/index")
        public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
            ModelAndView mav = new ModelAndView("index");
            mav.addObject("message", "Hello spring mvc");
            return mav;
        }
    }
    */
}
