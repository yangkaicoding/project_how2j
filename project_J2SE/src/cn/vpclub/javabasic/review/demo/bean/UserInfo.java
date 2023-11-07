package cn.vpclub.javabasic.review.demo.bean;

import java.io.Serializable;

/**
 * 用户信息 实体对象
 *
 * @author YK
 * @date 2023/11/3 14:33
 */
public class UserInfo implements Serializable {

    /**
     * 用户编号
     */
    private String usercode;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 年龄
     */
    private int age;

    /**
     * 身份证号
     */
    private String codeId;

    /**
     * 出生日期
     */
    private String userdate;

    /**
     * 构造方法
     *
     * @param usercode
     * @param username
     * @param age
     * @param codeId
     * @param userdate
     */
    public UserInfo(String usercode, String username, int age, String codeId, String userdate) {
        this.usercode = usercode;
        this.username = username;
        this.age = age;
        this.codeId = codeId;
        this.userdate = userdate;
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String getUserdate() {
        return userdate;
    }

    public void setUserdate(String userdate) {
        this.userdate = userdate;
    }
}
