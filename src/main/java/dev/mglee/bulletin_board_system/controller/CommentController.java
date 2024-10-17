package dev.mglee.bulletin_board_system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.mglee.bulletin_board_system.dto.comment.CommentRequest;
import dev.mglee.bulletin_board_system.servie.CommentService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/comment")
public class CommentController {
    private CommentService commentService;

    ResponseEntity<?> addComment(@RequestBody CommentRequest commentRequest) {
        commentService.addComment(commentRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
