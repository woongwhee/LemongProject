package site.lemongproject.web.feed.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.sql.Date;

@Data
public class HeartAlarm {
        private int userNo; // 보낸사람
        private int feedNo;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        private int recNo; // 받은사람
}

// ㅇ
