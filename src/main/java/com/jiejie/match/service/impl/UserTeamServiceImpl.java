package com.jiejie.match.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.jiejie.match.mapper.UserTeamMapper;
import com.jiejie.match.model.domain.UserTeam;
import com.jiejie.match.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author DELL
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2023-10-06 00:41:52
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

}




