package com.park.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rec_id;

    @CreationTimestamp
    private Timestamp pay_time;

    @Column(nullable = false)
    private int pay_price;

    @Column(nullable = false)
    private int regular_non;

    @ManyToOne
    @JoinColumn(name="gate_id")
    private Gate gate_id;
}
