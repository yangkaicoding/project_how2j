package cn.vpclub.how2j.springboot.mybatis.annotation.Mapper;

import cn.vpclub.how2j.springboot.mybatis.annotation.entity.Category;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * <p>
 * 分类信息表 Mapper接口
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/29 17:40
 */
@Mapper
public interface CategoryMapper {

    /**
     * @Mapper注解：表示这是一个Mybatis Mapper接口
     * @Select注解：表示调用findAll方法会去执行对应的sql语句
     * @MapperScan：在工程主类Application.java上面添加注解@MapperScan("com.how2java.springboot.mapper")进行扫描Mapper，这样就可以不用在每个Mapper里面添加@Mapper注解了。
     */

    /**
     * 获得分类信息列表
     *
     * @return
     */
    @Select("select * from category_")
    List<Category> findAll();

    /**
     * 添加分类信息
     *
     * @param category
     * @return
     */
    @Insert("insert into category_ (name) values (#{name})")
    int save(Category category);

    /**
     * 删除分类信息
     *
     * @param id
     */
    @Delete("delete from category_ where id=#{id}")
    void delete(int id);

    /**
     * 获得分类信息详情
     *
     * @param id
     * @return
     */
    @Select("select * from category_ where id=#{id}")
    Category get(int id);

    /**
     * 修改分类信息
     *
     * @param category
     * @return
     */
    @Update("update category_ set name=#{name} where id=#{id}")
    int update(Category category);
}
