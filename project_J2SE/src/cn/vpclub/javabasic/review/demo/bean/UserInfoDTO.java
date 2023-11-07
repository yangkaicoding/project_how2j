package cn.vpclub.javabasic.review.demo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author YK
 * @date 2023/11/3 14:38
 */
public class UserInfoDTO implements Serializable {

    /**
     * 用户信息
     */
    private UserInfo user;

    /**
     * 出生日期
     */
    private List<String> userdates;


    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public List<String> getUserdates() {
        return userdates;
    }

    public void setUserdates(List<String> userdates) {
        this.userdates = userdates;
    }
}
