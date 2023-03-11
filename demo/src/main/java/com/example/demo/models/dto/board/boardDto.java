package com.example.demo.models.dto.board;

import org.springframework.data.annotation.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class boardDto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int seq;
    private String subject;
    private String author;
    private String content;
    private String date;
    private int view;

    @Override
    public String toString() {
        return String.format("seq : %d, \nsubject : %s, \nauthor : %s, \ncontent : %s, \ndate : %s, \nview : %d",this.seq, this.subject, this.author, this.content, this.date, this.view);
    }
}