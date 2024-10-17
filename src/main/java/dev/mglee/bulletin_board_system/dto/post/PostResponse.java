package dev.mglee.bulletin_board_system.dto.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PostResponse {
    private String id;
    private String title;
    private String content;
}
