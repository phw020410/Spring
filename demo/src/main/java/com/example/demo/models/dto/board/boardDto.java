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
    int seq;
    String subject;
    String author;
    String date;
    int view;
}
