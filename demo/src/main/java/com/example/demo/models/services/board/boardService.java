package com.example.demo.models.services.board;

import java.util.List;

import com.example.demo.models.dto.board.boardDto;

public interface boardService {
    List<boardDto> getAllBoard();

    boardDto getBoard(int seq);
    
    int getSeq();

    void addView(int seq);
    
    void addData(boardDto boardDto);
}
