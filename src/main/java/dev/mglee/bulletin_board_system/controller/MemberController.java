package dev.mglee.bulletin_board_system.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import dev.mglee.bulletin_board_system.dto.member.MemberRequest;
import dev.mglee.bulletin_board_system.servie.MemberService;
import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/member")
@AllArgsConstructor
public class MemberController {
    private MemberService memberService;

    @PostMapping("/add")
    ResponseEntity<?> addMember(@RequestBody MemberRequest memberRequest) {
        memberService.addMember(memberRequest);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/init")
    ResponseEntity<?> test_addMember() {
        MemberRequest mockMember = new MemberRequest("", "marco lee(admin)");
        memberService.addMember(mockMember);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
