package dev.mglee.bulletin_board_system.dto.member;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import dev.mglee.bulletin_board_system.Entity.Member;

@Mapper
public interface MemberMapper {
    MemberMapper INSTANCE = Mappers.getMapper(MemberMapper.class);

    Member toEntity(MemberRequest memberRequest);
}
