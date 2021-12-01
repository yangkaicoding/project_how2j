package cn.vpclub.how2j.springboot.jpa.entity;


import javax.persistence.*;

/**
 * <p>
 * 分类信息表 实体
 * </p>
 *
 * @author: 杨凯
 * @since: 2019/9/29 14:47
 */
@Entity
@Table(name = "category_")
public class Category {

    /**
     * @Id：表明实体唯一标识对应的属性
     * @Column(name="id)：表明对应的数据库字段名
     * @GeneratedValue(strategy = GenerationType.IDENTITY)：表明自增长方式
     *
     * @Entity：必选注解表明实体类
     * @Table(name = "category_")：可选注解表明这个类对应的数据库实体信息
     */

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
