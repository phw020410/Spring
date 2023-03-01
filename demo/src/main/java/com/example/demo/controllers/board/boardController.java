package com.example.demo.controllers.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.models.dto.board.boardDto;
import com.example.demo.models.services.board.boardService;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(value = "board")
@RequiredArgsConstructor
public class boardController {
    private boardService boardService;

    @GetMapping("home")
    public String home(Model model) {
        return "boardView";
    }

    @GetMapping("list")
    public List<boardDto> list(Model model) {
        return boardService.getAllDataList();
    }
}