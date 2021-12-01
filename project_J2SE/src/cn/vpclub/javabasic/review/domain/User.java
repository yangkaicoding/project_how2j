package cn.vpclub.javabasic.review.domain;

/**
 * <p>
 * Java基础回顾——用户实体
 * </p>
 *
 * @author: 杨凯
 * @since: 2018/11/9 15:12
 */
public class User {

    /**
     * 编号
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //添加一个构造器
    public User(Integer id, String name,Integer age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }


}
