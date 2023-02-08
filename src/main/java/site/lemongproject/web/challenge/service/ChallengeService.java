package site.lemongproject.web.challenge.service;


import site.lemongproject.web.challenge.model.dto.Challenge;
import site.lemongproject.web.challenge.model.dto.ChallengeChat;
import site.lemongproject.web.challenge.model.dto.ChallengeTodo;
import site.lemongproject.web.challenge.model.vo.MultiCreateVo;
import site.lemongproject.web.challenge.model.vo.ChallengeUserVo;
import site.lemongproject.web.challenge.model.vo.SingleStartVo;

import java.util.List;

public interface ChallengeService {


    int startSingle(SingleStartVo ssv);

    int joinMulti(ChallengeUserVo msv);

    int leaveMulti(ChallengeUserVo userVo);

    int createMulti(MultiCreateVo msv);

    Challenge selectChallenge(Challenge cNo);

    int insertChatData(ChallengeChat chatData);

    int clearChallengeTodo(ChallengeTodo cTd);

    List<ChallengeTodo> calChTodo(ChallengeTodo ct);
}
