package shop.mtcoding.blog.board;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

public class BoardResponse {
    // bt.id, bt.title, bt.content, bt.created_at, ut.user_id uid, ut.username
   @AllArgsConstructor
    @Data
    public static class DetailDTO {

            private Integer id;
            private String title;
            private String content;
            private Timestamp createdAt;
            private Integer userId;
            private String username;

       }
    }
