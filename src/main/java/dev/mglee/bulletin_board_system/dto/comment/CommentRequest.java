package dev.mglee.bulletin_board_system.dto.comment;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommentRequest {
    String id;
    String content;
    String authorId;
    String postId;

}
