package com.example.PersonalInfo.post.dto;

import com.example.PersonalInfo.post.domain.Board;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class BoardDto {
    private Long id;
    private String name;
    private String depart;
    private String age;
    private String introduction;

    private String title;

    private String contents;
    private LocalDateTime createdTime;
    private LocalDateTime modifiedTime;

    public Board toEntity(){
        Board build = Board.builder()
                .id(id)
                .name(name)
                .depart(depart)
                .age(age)
                .introduction(introduction)
                .title(title)
                .contents(contents)
                .build();
        return  build;
    }

    @Builder
    public BoardDto(Long id,String name,String depart,String age,String introduction,String contents, String title, LocalDateTime createdTime,LocalDateTime modifiedTime){
        this.id = id;
        this.name = name;
        this.depart = depart;
        this.age = age;
        this.introduction = introduction;
        this.title = title;
        this.contents = contents;
        this.createdTime = createdTime;
        this.modifiedTime = modifiedTime;
    }
}
