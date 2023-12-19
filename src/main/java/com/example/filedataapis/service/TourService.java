package com.example.filedataapis.service;

import com.example.filedataapis.model.Tourist;

import java.util.List;

public interface TourService {
    String insertTourist(Tourist tour);

    List<Tourist> getAllTourist();

    String deleteTourist(int id);

    String updateTourist(int id ,Tourist tourist);

    Tourist getById(int id);
}
