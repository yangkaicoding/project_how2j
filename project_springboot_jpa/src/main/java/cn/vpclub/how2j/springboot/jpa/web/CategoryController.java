package cn.vpclub.how2j.springboot.jpa.web;

import cn.vpclub.how2j.springboot.jpa.dao.CategoryDAO;
import cn.vpclub.how2j.springboot.jpa.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 分类信息表 前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/29 15:14
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryDAO categoryDAO;

    @RequestMapping("getCategoryList")
    public String getCategoryList(Model model) {
        //获得分类信息列表
        List<Category> categories = categoryDAO.findAll();
        model.addAttribute("categories", categories);
        return "category";
    }
}
