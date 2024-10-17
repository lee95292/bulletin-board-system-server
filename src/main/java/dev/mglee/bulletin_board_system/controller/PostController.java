package dev.mglee.bulletin_board_system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.mglee.bulletin_board_system.dto.post.PostRequest;
import dev.mglee.bulletin_board_system.dto.post.PostResponse;
import dev.mglee.bulletin_board_system.servie.PostService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/post")
@AllArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/{id}")
    ResponseEntity<?> getPost(@PathVariable Long id) {
        PostResponse post = postService.getPostById(id);
        return ResponseEntity.ok(post);
    }

    @PostMapping("/add")
    ResponseEntity<?> addPost(@RequestBody PostRequest postRequest) {
        postService.addPost(postRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

}
