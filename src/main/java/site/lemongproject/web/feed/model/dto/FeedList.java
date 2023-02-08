package site.lemongproject.web.feed.model.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class FeedList {
    private int feedNo;
    private int userNo;
    private String nickName;
    private String feedContent;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private Date feedAt;
    private String filePath;
    private String photoNo;
}
