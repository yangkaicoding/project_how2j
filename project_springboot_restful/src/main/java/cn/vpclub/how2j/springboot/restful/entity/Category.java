package cn.vpclub.how2j.springboot.restful.entity;

import javax.persistence.*;

/**
 * <p>
 * 分类信息表 实体类
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/10/15 16:25
 */
@Entity
@Table(name = "category_")
public class Category {

    /**
     * 主键id
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    @Column(name = "name")
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
