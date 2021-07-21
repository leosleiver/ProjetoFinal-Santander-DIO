package com.digital.crud.saladereuniao.saladereuniao.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="meetingroom")
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String date;
    @Column(nullable = false)
    private String startHour;
    @Column(nullable = false)
    private String endHour;

}
