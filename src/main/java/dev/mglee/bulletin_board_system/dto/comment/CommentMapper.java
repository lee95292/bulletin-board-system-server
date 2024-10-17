package dev.mglee.bulletin_board_system.dto.comment;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dev.mglee.bulletin_board_system.Entity.Comment;
import dev.mglee.bulletin_board_system.Entity.Member;
import dev.mglee.bulletin_board_system.Entity.Post;

@Mapper
public interface CommentMapper {
    CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

    @Mapping(target = "author", source = "author")
    @Mapping(target = "post", source = "post")
    Comment toEntity(CommentRequest CommentRequest, Post post, Member author);
}
