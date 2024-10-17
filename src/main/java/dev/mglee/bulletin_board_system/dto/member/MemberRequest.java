package dev.mglee.bulletin_board_system.dto.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MemberRequest {

    String id;
    String name;
}
