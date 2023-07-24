package com.domain;


import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
public class Tofu {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id; // 두부를 식별해줄 두부 식별 아이디

        private String mbti; // 두부 메뉴, 즉 유형

//        @OneToMany(mappedBy = "tofu", cascade = CascadeType.ALL)
//        private List<Tofu> questions; // 해당 두부에 포함된 문항의 목록과 수

        private String GoodType; // 한 유형의 두부 와 잘 맞는 유형

        private String BadType; // 한 유형의 두부와 안맞는 유형
    // 유저 엔티티는 여러개의 두부를 가질 수 있다.
    }


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long I'd;
//    private String TofuCategory;
//    private String GoodTypeTofu;
//    private String BadTypeTofu;
//
