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
    public List<boardDto> getAllDataList() {
        return boardMapper.getAllDataList();
    }
    
}
