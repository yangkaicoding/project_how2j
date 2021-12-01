package cn.vpclub.how2j.springboot.mybatis.annotation.web;

import cn.vpclub.how2j.springboot.mybatis.annotation.Mapper.CategoryMapper;
import cn.vpclub.how2j.springboot.mybatis.annotation.entity.Category;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 * 分类信息表 前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/10/9 15:02
 */
@Controller
public class CategoryCRUDController {

    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 添加分类信息
     *
     * @param category
     * @return
     */
    @RequestMapping("/addCategory")
    public String addCategory(Category category) {
        categoryMapper.save(category);
        return "redirect:listCategory";
    }

    /**
     * 删除分类信息
     *
     * @param category
     * @return
     */
    @RequestMapping("/deleteCategory")
    public String deleteCategory(Category category) {
        categoryMapper.delete(category.getId());
        return "redirect:listCategory";
    }

    /**
     * 修改分类信息
     *
     * @param category
     * @return
     */
    @RequestMapping("/updateCategory")
    public String updateCategory(Category category) {
        categoryMapper.update(category);
        return "redirect:listCategory";
    }

    /**
     * 查询分类信息详情
     *
     * @param id
     * @param m
     * @return
     */
    @RequestMapping("/editCategory")
    public String editCategory(int id, Model m) {
        Category category = categoryMapper.get(id);
        m.addAttribute("category", category);
        return "editCategory";
    }

    /**
     * 分页查询分类信息
     *
     * @param m
     * @param start
     * @param size
     * @return
     */
    @RequestMapping("/listCategory")
    public String listCategory(Model m, @RequestParam(value = "start", defaultValue = "0") int start, @RequestParam(value = "size", defaultValue = "5") int size) {
        //设置分页参数，并且设置根据id倒序排列
        PageHelper.startPage(start, size, "id desc");
        //查询所有分类信息
        List<Category> categories = categoryMapper.findAll();
        //创建分页对象
        PageInfo<Category> page = new PageInfo<>(categories);
        m.addAttribute("page", page);
        return "listCategory";
    }
}
