package com.example.PersonalInfo.post.dto;

import com.example.PersonalInfo.post.domain.Board;
import lombok.Builder;
import java.time.LocalDateTime;

public class BoardDto {
    private Long id;
    private String name;
    private String depart;
    private String age;
    private String introduction;
    private LocalDateTime createTime;
    private LocalDateTime modifiedTime;

    public Board toEntity(){
        Board build = Board.builder()
                .id(id)
                .name(name)
                .depart(depart)
                .age(age)
                .introduction(introduction)
                .build();
        return  build;
    }

    @Builder
    public BoardDto(Long id,String name,String depart,String age,String introduction,LocalDateTime createTime,LocalDateTime modifiedTime){
        this.id = id;
        this.name = name;
        this.depart = depart;
        this.age = age;
        this.introduction = introduction;
        this.createTime = createTime;
        this.modifiedTime = modifiedTime;
    }
}
