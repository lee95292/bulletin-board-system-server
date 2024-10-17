package dev.mglee.bulletin_board_system.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.mglee.bulletin_board_system.Entity.Comment;

public interface CommentRepositroy extends JpaRepository<Comment, UUID> {

}
