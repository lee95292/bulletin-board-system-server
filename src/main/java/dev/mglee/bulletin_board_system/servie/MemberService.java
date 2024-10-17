package dev.mglee.bulletin_board_system.servie;

import org.springframework.stereotype.Service;

import dev.mglee.bulletin_board_system.Repository.MemberRepository;
import dev.mglee.bulletin_board_system.dto.member.MemberMapper;
import dev.mglee.bulletin_board_system.dto.member.MemberRequest;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MemberService {
    private MemberRepository memberRepository;
    private MemberMapper memberMapper;

    public void addMember(MemberRequest memberRequest) {
        memberRepository.save(memberMapper.toEntity(memberRequest));
    }

}
