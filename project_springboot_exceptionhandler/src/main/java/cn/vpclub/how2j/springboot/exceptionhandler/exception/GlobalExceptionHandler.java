package cn.vpclub.how2j.springboot.exceptionhandler.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 * SpringBoot框架 全局异常处理器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/27 16:39
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Springboot中的全局异常处理是通过@ControllerAdvice和@ExceptionHandler来实现的。
     *
     * @ControllerAdvice：增强型控制器，对于控制器的全局配置放在同一个位置，全局异常的注解，放在类上。
     * @ControllerAdvice：默认只会处理controller层抛出的异常，若需要处理service层的异常，需要自定义异常并继承RuntimeException类，然后@ExceptionHandler(MyException)即可。
     * @ExceptionHandler：指明需要处理的异常类型以及子类，注解在方法上面。一个方法处理多个异常类的异常,@ExceptionHandler(value={RuntimeException.class,MyRuntimeException.class})
     * @ExceptionHandler注解的方法，会根据抛出异常类去寻找处理方法，如果没有，就往上找父类，直到找到为止。
     */
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", e);
        modelAndView.addObject("url", req.getRequestURI());
        modelAndView.setViewName("errorPage");
        return modelAndView;
    }
}
