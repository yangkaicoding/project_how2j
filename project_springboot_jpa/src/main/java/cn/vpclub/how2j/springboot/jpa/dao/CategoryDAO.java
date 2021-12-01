package cn.vpclub.how2j.springboot.jpa.dao;

import cn.vpclub.how2j.springboot.jpa.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * <p>
 * 分类信息表 DAO层
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/29 15:10
 */
public interface CategoryDAO extends JpaRepository<Category, Integer> {

    List<Category> findByName(String name);

    List<Category> findByNameLikeAndIdGreaterThanOrderByNameAsc(String name, int id);

}
