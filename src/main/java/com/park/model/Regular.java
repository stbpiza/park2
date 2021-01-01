package com.park.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Regular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reg_id;

    @Column(nullable = false, length = 10)
    private String car_num;

    @CreationTimestamp
    private Timestamp start_time;

    @ManyToOne
    @JoinColumn(name="gate_id")
    private Gate gate_id;
}
