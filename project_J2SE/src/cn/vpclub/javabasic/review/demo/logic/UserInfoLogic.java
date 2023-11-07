package cn.vpclub.javabasic.review.demo.logic;


import cn.vpclub.javabasic.review.demo.bean.UserInfo;
import cn.vpclub.javabasic.review.demo.bean.UserInfoDTO;
import cn.vpclub.javabasic.review.demo.bean.UserInfoVO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author YK
 * @date 2023/11/3 14:41
 */
public class UserInfoLogic {

    public static void main(String[] args) {

        // 用户信息集合
        List<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("H001", "张三", 36, "42082119861212055", "1986-12-12"));
        userInfos.add(new UserInfo("H002", "李四", 36, "42082119861112055", "1986-11-12"));
        userInfos.add(new UserInfo("H003", "王五", 32, "42082119891011055", "1989-10-11"));
        userInfos.add(new UserInfo("H004", "赵六", 32, "42082119891011055", "1989-10-11"));
        userInfos.add(new UserInfo("H005", "孙一", 36, "42082119861011055", "1986-10-11"));

        // 根据用户编号进行排序
        userInfos.sort((user1, user2) -> user1.getUsercode().compareTo(user2.getUsercode()));

        // 出生日期Set集合
        Set<UserInfo> birthDateSet = new TreeSet<>(new Comparator<UserInfo>() {
            @Override
            public int compare(UserInfo o1, UserInfo o2) {
                return o1.getUserdate().compareTo(o2.getUserdate());
            }
        });
        birthDateSet.addAll(userInfos);

        // 出生日期集合
        List<String> birthDates = new ArrayList<>();
        // 遍历集合，归档整理
        for (UserInfo userInfo : birthDateSet) {
            birthDates.add(userInfo.getUserdate());
        }
        System.out.println(birthDates);

        List<UserInfoDTO> userInfoDTOS = new ArrayList<>();
        // 遍历集合，归档整理
        for (UserInfo userInfo : userInfos) {
            List<String> dates = new ArrayList<>();
            UserInfoDTO userInfoDTO = new UserInfoDTO();
            for (String birthDate : birthDates) {
                if (!userInfo.getUserdate().equals(birthDate)) {
                    dates.add("");
                } else {
                    dates.add(userInfo.getAge() + "/" + userInfo.getCodeId());
                }
            }
            userInfoDTO.setUser(userInfo);
            userInfoDTO.setUserdates(dates);

            userInfoDTOS.add(userInfoDTO);
        }

        // 创建对象，以用于接收返回的对象
        UserInfoVO userInfoVO = new UserInfoVO();
        // 设置日期列头
        userInfoVO.setHeaddates(birthDates);
        // 设置用户信息
        userInfoVO.setUserInfoDTOS(userInfoDTOS);
    }
}
