package cn.vpclub.how2j.springboot.mybatis.xml.web;

import cn.vpclub.how2j.springboot.mybatis.xml.entity.Category;
import cn.vpclub.how2j.springboot.mybatis.xml.mapper.CategoryMapper;
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
 * @since: 2019/9/30 10:46
 */
@Controller
public class CategoryController {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 获得分类信息列表
     *
     * @param model
     * @return
     */
    @RequestMapping("/getCategoryList")
    public String getCategoryList(Model model) {
        //获得分类信息列表
        List<Category> categories = categoryMapper.findAll();
        model.addAttribute("categories", categories);
        return "categories";
    }


}
