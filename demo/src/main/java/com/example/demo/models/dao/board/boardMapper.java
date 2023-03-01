package com.example.demo.models.dao.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.models.dto.board.boardDto;

@Repository
@Mapper
public interface boardMapper {
    List<boardDto> getAllDataList();
}
