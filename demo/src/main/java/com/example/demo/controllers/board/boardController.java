package com.example.demo.controllers.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.models.services.board.boardService;

@Controller
@RequestMapping(value = "board")
public class boardController {
    @Autowired
    private boardService boardService;

    @GetMapping("home")
    public String home(Model model) {
        return "boardView";
    }

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("board", boardService.getAllDataList());
        return "boardView";
    }
}