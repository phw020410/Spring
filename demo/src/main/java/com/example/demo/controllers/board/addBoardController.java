package com.example.demo.controllers.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.models.dao.board.boardMapper;
import com.example.demo.models.dto.board.boardDto;


@Controller
public class addBoardController {
    @Autowired
    private boardMapper boardMapper;

    @PostMapping("board/addPostBE")
    public String goList(boardDto boardDto ,Model model) {
        
        boardDto.setSeq(boardMapper.getSeq());
        System.out.println(boardDto);
        boardMapper.addData(boardDto);
        return "redirect:https://phw020410-urban-xylophone-rxgq79g96p9cwqrp-8080.preview.app.github.dev/board/list";
    }
}