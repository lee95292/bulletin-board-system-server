package dev.mglee.bulletin_board_system.servie;

import org.springframework.stereotype.Service;

import dev.mglee.bulletin_board_system.Entity.Member;
import dev.mglee.bulletin_board_system.Entity.Post;
import dev.mglee.bulletin_board_system.Repository.MemberRepository;
import dev.mglee.bulletin_board_system.Repository.PostRepository;
import dev.mglee.bulletin_board_system.dto.post.PostMapper;
import dev.mglee.bulletin_board_system.dto.post.PostRequest;
import dev.mglee.bulletin_board_system.dto.post.PostResponse;
import lombok.AllArgsConstructor;
import java.util.UUID;

@Service
@AllArgsConstructor
public class PostService {

    private PostRepository postRepository;
    private PostMapper postMapper;
    private MemberRepository memberRepository;

    public PostResponse getPostById(Long id) {
        return PostResponse.builder()
                .id("1")
                .content("flutter & spring project.")
                .title("first content")
                .build();
    }

    public void addPost(PostRequest postRequest) {
        Member author = memberRepository.findById(UUID.fromString(postRequest.getMemberId())).orElseThrow();
        Post post = postRepository.save(postMapper.toEntity(postRequest, author));
        System.out.println(post);
    }
}
