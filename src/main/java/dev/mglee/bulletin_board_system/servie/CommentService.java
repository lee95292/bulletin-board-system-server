package dev.mglee.bulletin_board_system.servie;

import java.util.UUID;

import org.springframework.stereotype.Service;

import dev.mglee.bulletin_board_system.Entity.Member;
import dev.mglee.bulletin_board_system.Entity.Post;
import dev.mglee.bulletin_board_system.Repository.CommentRepositroy;
import dev.mglee.bulletin_board_system.Repository.MemberRepository;
import dev.mglee.bulletin_board_system.Repository.PostRepository;
import dev.mglee.bulletin_board_system.dto.comment.CommentMapper;
import dev.mglee.bulletin_board_system.dto.comment.CommentRequest;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CommentService {

    CommentMapper commentMapper;
    CommentRepositroy commentRepositroy;
    PostRepository postRepository;
    MemberRepository memberRepository;

    public void addComment(CommentRequest commentRequest) {
        Post post = postRepository.findById(UUID.fromString(commentRequest.getPostId())).orElseThrow();
        Member author = memberRepository.findById(UUID.fromString(commentRequest.getAuthorId())).orElseThrow();

        commentRepositroy.save(commentMapper.toEntity(commentRequest, post, author));
    }

}