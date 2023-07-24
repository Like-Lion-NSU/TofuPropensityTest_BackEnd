package com.domain;


import javax.persistence.*;

@Entity
public class AllTofu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // 수치화된 결과를 담을 필드
    private double TofuValue;
}
