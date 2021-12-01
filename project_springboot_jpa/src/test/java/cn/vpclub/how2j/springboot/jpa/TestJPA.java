package cn.vpclub.how2j.springboot.jpa;


import cn.vpclub.how2j.springboot.jpa.dao.CategoryDAO;
import cn.vpclub.how2j.springboot.jpa.entity.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <p>
 * JPA 单元测试类
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/10/11 10:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class TestJPA {

    @Autowired
    private CategoryDAO categoryDAO;

    @Test
    public void test() {
        List<Category> categories = categoryDAO.findAll();
        for (Category category : categories) {
            System.out.println("category.getName：" + category.getName());
        }
    }

    @Before
    public void before() {
        List<Category> categories = categoryDAO.findAll();
        for (Category category : categories) {
            categoryDAO.delete(category);
        }
        for (int i = 0; i < 10; i++) {
            Category category = new Category();
            category.setName("category" + i);
            categoryDAO.save(category);
        }
    }

    @Test
    public void test1() {
        List<Category> categories = categoryDAO.findAll();
        System.out.println("所有的分类信息");
        for (Category category : categories) {
            System.out.println(category.getName());
        }
        System.out.println();
    }

    @Test
    public void test2() {
        System.out.println("查询名称是category 1的分类");
        List<Category> categories = categoryDAO.findByName("category 1");
        for (Category category : categories) {
            System.out.println("category.getName：getName:" + category.getName());
        }
        System.out.println();
    }

    @Test
    public void test3() {
        System.out.println("根据名称模糊查询，id大于5，并且名称正排序查询");
        List<Category> categories = categoryDAO.findByNameLikeAndIdGreaterThanOrderByNameAsc("%3%", 5);
        for (Category category : categories) {
            System.out.println(category);
        }
        System.out.println();
    }


}
