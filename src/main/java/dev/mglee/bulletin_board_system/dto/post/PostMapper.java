package dev.mglee.bulletin_board_system.dto.post;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import dev.mglee.bulletin_board_system.Entity.Member;
import dev.mglee.bulletin_board_system.Entity.Post;

@Mapper // (componentModel = "spring")
public interface PostMapper {
    PostMapper INSTANCE = Mappers.getMapper(PostMapper.class);

    @Mapping(target = "author", source = "author")
    Post toEntity(PostRequest postRequest, Member author);
}
