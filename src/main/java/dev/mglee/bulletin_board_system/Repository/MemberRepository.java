package dev.mglee.bulletin_board_system.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mglee.bulletin_board_system.Entity.Member;
import java.util.UUID;

public interface MemberRepository extends JpaRepository<Member, UUID> {

}
