package com.jiejie.match.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jiejie.match.model.domain.Team;
import com.jiejie.match.model.domain.User;
import com.jiejie.match.model.dto.TeamQuery;
import com.jiejie.match.model.request.TeamJoinRequest;
import com.jiejie.match.model.request.TeamQuitRequest;
import com.jiejie.match.model.request.TeamUpdateRequest;
import com.jiejie.match.model.vo.TeamUserVO;

import java.util.List;

/**
* @author DELL
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2023-10-06 00:41:52
*/
public interface TeamService extends IService<Team> {

    long addTeam(Team team, User loginUser);

    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    boolean deleteTeam(long id, User loginUser);
}
