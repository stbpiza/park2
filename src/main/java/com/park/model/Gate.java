package com.park.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int gate_id;

    @Column(nullable = false, length = 10)
    private String car_num;

    @Enumerated(EnumType.STRING)
    private InOutType in_out;

    @CreationTimestamp
    private Timestamp time;
}
