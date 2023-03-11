package com.example.demo.models.vo.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class boardVo {
    private String subject;
    private String content;
    private String author;
    private String date;
}
