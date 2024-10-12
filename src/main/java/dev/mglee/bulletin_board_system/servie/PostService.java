package dev.mglee.bulletin_board_system.servie;

import org.springframework.stereotype.Service;

import dev.mglee.bulletin_board_system.dto.PostResponse;

@Service
public class PostService {

    public PostResponse getPostById(Long id) {
        return PostResponse.builder()
                .id("1")
                .content("flutter & spring project.")
                .title("first content")
                .build();
    }
}
