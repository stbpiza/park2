package com.park.dto;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gate_id;

    @Column(nullable = false, length = 10)
    private String car_num;

    @Column(nullable = false)
    private int in_out;

    @CreationTimestamp
    private Timestamp time;
}
