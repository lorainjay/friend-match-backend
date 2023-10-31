package com.jiejie.match.service;

import com.jiejie.match.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.jiejie.match.model.request.UpdateTagRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 用户服务
 *
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);


    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    User getLoginUser(HttpServletRequest request);

    List<User> searchUserByTags(List<String> TagNameList);

    /**
     * 用户更新
     * @param user  修改的用户信息,
     * @param longinUser 执行修改的用户
     * @return
     */
    int updateUser(User user, User longinUser);

    List<User> matchUsers(long num, User loginUser);

    /**
     * 判断是否为管理员
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    /**
     * 判断是否为管理员
     * @param loginUser
     * @return
     */
    boolean isAdmin(User loginUser);

    int updateTags(UpdateTagRequest tagRequest, User loginUser);

    //  List<User> searchUserBySQL(List<String> TagNameList);
}
