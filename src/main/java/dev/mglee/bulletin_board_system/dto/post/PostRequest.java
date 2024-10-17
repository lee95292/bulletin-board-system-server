package dev.mglee.bulletin_board_system.dto.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PostRequest {
    private String id;
    private String title;
    private String content;
    private String memberId;

    public String toString() {
        return String.format(" id: %s \n title: %s, \n content: %s", id, title, content);
    }
}