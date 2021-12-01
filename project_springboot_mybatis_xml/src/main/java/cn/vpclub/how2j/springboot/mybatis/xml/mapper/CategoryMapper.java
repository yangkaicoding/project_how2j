package cn.vpclub.how2j.springboot.mybatis.xml.mapper;

import cn.vpclub.how2j.springboot.mybatis.xml.entity.Category;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 分类信息表 Mapper接口
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/30 10:09
 */
@Mapper
public interface CategoryMapper {

    /**
     * 获得分类信息列表
     *
     * @return
     */
    List<Category> findAll();


}
