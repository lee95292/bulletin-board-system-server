package dev.mglee.bulletin_board_system.Repository;

import java.util.UUID;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.mglee.bulletin_board_system.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {

}
