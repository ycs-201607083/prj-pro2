package com.example.prjpro2.controller;

import com.example.prjpro2.dto.Member;
import com.example.prjpro2.service.ServiceMember;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("member")
@Controller
@RequiredArgsConstructor
public class MemberController {

    private final ServiceMember serviceMember;

    @GetMapping("signup")
    public void signup() {

    }

    @PostMapping("signup")
    public String signup(Member member) {
        serviceMember.addMember(member);
        System.out.println("회원가입 성공");
        return "redirect:/board/list";
    }

    @GetMapping("login")
    public void login() {
    }

    @PostMapping("login")
    public String login(
            HttpSession session,
            String id,
            String password,
            Model model) {
        Member member = serviceMember.get(id, password);
        if (member == null) {
            System.out.println("로그인 실패" + member.getId());
        } else {
            System.out.println("로그인 성공" + member.getId());
            session.setAttribute("loggedInMember", member);
        }
        return "redirect:/board/list";
    }
}
