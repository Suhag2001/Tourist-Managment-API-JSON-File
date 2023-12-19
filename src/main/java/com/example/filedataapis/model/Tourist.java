package com.example.filedataapis.model;

import lombok.Data;

import java.util.Date;

@Data
public class Tourist {
    private  int id ;
    private  String touristName ;
    private  String destination;
    private Date startDate;
    private int duration ;
    private int price;
}
