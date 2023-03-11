package com.example.demo.models.services.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.board.boardMapper;
import com.example.demo.models.dto.board.boardDto;

@Service
public class boardServiceImpl implements boardService{
    @Autowired
    private boardMapper boardMapper;

    @Override
    public List<boardDto> getAllBoard() {
        return boardMapper.getAllBoard();
    }
    
    @Override
    public int getSeq() {
        return boardMapper.getSeq();
    }

    @Override
    public void addData(boardDto boardDto) {
        boardMapper.addData(boardDto);
    }

    @Override
    public boardDto getBoard(int seq) {
        return boardMapper.getBoard(seq);
    }

    @Override
    public void addView(int seq) {
        boardMapper.addView(seq);
    }

}
