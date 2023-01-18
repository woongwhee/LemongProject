package site.lemongproject.web.feed.domain.dao;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import site.lemongproject.web.feed.domain.vo.Feed;

import java.util.List;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class FeedDao {

    final private SqlSession sqlSession;

    public List<Feed> selectFeed(){
        return  sqlSession.selectList("feedMapper.selectFeed");
    }

    public int insertFeed(Map<String,Object> paramMap){
        return sqlSession.insert("feedMapper.insertFeed", paramMap);


    }
}