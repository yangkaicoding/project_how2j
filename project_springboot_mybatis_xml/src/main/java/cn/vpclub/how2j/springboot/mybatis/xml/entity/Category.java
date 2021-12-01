package cn.vpclub.how2j.springboot.mybatis.xml.entity;


/**
 * <p>
 * 分类信息表 实体
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/29 14:47
 */
public class Category {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
