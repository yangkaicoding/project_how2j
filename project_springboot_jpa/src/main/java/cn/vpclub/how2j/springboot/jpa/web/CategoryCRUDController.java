package cn.vpclub.how2j.springboot.jpa.web;

import cn.vpclub.how2j.springboot.jpa.dao.CategoryDAO;
import cn.vpclub.how2j.springboot.jpa.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 * 分页信息表 前端控制器
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/10/8 11:08
 */
@Controller
public class CategoryCRUDController {

    /**
     * JPA新增和修改采用的都是save,它根据实体类的id是否为0来判断是进行增加还是修改
     */

    @Autowired
    private CategoryDAO categoryDAO;

    /**
     * 添加分类信息
     *
     * @param category
     * @return
     */
    @RequestMapping("/addCategory")
    public String addCategory(Category category) {
        categoryDAO.save(category);
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
        categoryDAO.delete(category);
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
        categoryDAO.save(category);
        return "redirect:listCategory";
    }

    /**
     * 获取分类信息详情
     *
     * @param id
     * @param m
     * @return
     */
    @RequestMapping("/editCategory")
    public String getCategory(int id, Model m) {
        Category category = categoryDAO.getOne(id);
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
        //设置分页参数
        start = start < 0 ? 0 : start;
        //设置倒序排列
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        //创建分页对象
        Pageable pageable = new PageRequest(start, size, sort);
        //分页查询分类信息
        Page<Category> page = categoryDAO.findAll(pageable);
        //打印分页参数信息
        System.out.println(page.getNumber());
        System.out.println(page.getNumberOfElements());
        System.out.println(page.getSize());
        System.out.println(page.getTotalElements());
        System.out.println(page.getTotalPages());
        m.addAttribute("page", page);
        return "listCategory";
    }
}
