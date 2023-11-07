package cn.vpclub.javabasic.review.demo.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author YK
 * @date 2023/11/7 13:31
 */
public class UserInfoVO implements Serializable {

    /**
     * 日期列头
     */
    private List<String> headdates;

    /**
     * 用户信息
     */
    private List<UserInfoDTO> userInfoDTOS;

    public List<String> getHeaddates() {
        return headdates;
    }

    public void setHeaddates(List<String> headdates) {
        this.headdates = headdates;
    }

    public List<UserInfoDTO> getUserInfoDTOS() {
        return userInfoDTOS;
    }

    public void setUserInfoDTOS(List<UserInfoDTO> userInfoDTOS) {
        this.userInfoDTOS = userInfoDTOS;
    }
}
