package com.example.prjpro2.controller;

import com.example.prjpro2.dto.Board;
import com.example.prjpro2.dto.Member;
import com.example.prjpro2.service.ServiceBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("board")
public class BoardController {

    private final ServiceBoard serviceBoard;

    @GetMapping("list")
    public String list(Model model) {
        List<Board> list = serviceBoard.list();
        model.addAttribute("list", list);
        return "board/list";
    }

    @GetMapping("new")
    public void newBoard(
            @SessionAttribute(value = "loggedInMember", required = false) Member member,
            Model model) {
        if (member == null) {
            //로그인 안 한 상태
            System.out.println("로그인 안함");
        } else {
            model.addAttribute("member", member);
            System.out.println("로그인 중");
        }

    }
}
