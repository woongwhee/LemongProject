package site.lemongproject.web.member.model.service;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import site.lemongproject.web.member.model.dao.MemberDao;
import site.lemongproject.web.member.model.vo.Member;

import java.sql.Connection;

@Service
@Transactional
//@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    final private MemberDao memberDao;
    public MemberServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
//      this.sqlSession = sqlSession;
    }

    public Member loginMember(Member m) {
        Member loginUser = memberDao.loginMember(m);
        System.out.println("서비스 : " + loginUser);
        return loginUser;
    }


    public int insertMember(Member m) {
        int result = memberDao.insertMember(m);
        System.out.println("dao 실행 : " + result);
        return result;
    }

}
