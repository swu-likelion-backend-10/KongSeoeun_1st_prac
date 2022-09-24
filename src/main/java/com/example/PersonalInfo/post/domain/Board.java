package com.example.PersonalInfo.post.domain;

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

    @Builder
    public Board(Long id, String name, String depart, String age,String introduction){
        this.id=id;
        this.name=name;
        this.depart=depart;
        this.age=age;
        this.introduction=introduction;
    }
}
