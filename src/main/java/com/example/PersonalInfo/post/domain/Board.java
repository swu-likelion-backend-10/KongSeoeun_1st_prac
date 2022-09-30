package com.example.PersonalInfo.post.domain;

import com.example.PersonalInfo.post.dto.BoardDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String depart;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String introduction;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String contents;

    @Builder
    public Board(Long id, String name, String depart, String age,String introduction,String title, String contents){
        this.id=id;
        this.name=name;
        this.depart=depart;
        this.age=age;
        this.introduction=introduction;
        this.title = title;
        this.contents = contents;
    }

    public void update(BoardDto boardDto){
        this.title = boardDto.getTitle();
        this.contents = boardDto.getContents();
    }
}
