package com.example.demo.models.dto.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class boardDto {
    private int seq;
    private String subject;
    private String author;
    private String date;
    private int view;
}
