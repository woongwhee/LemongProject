package site.lemongproject.web.challenge.model.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.type.Alias;
import site.lemongproject.web.member.model.vo.Profile;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Alias("ChallengeListVo")
public class ChallengeListVo {
    String title;
    String categoryName;
    LocalDate startDate;
    LocalDate endDate;
    Profile createUser;
    int userCount;
}