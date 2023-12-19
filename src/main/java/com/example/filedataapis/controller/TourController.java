package com.example.filedataapis.controller;

import com.example.filedataapis.model.Tourist;
import com.example.filedataapis.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TourController {
    @Autowired
    private TourService service;

    @PostMapping("/tourist")
    public String insertTourist(@RequestBody Tourist tourist){
      return  service.insertTourist(tourist);
    }
    @GetMapping("/tourist")
    public List<Tourist> getAllTourist(){
        return service.getAllTourist();
    }

    @DeleteMapping("/tourist/{id}")
    public String deleteTourist(@PathVariable int id){
        return service.deleteTourist(id);
    }

    @PutMapping("tourist/{id}")
    public String updateTourist(@PathVariable int id,@RequestBody Tourist tourist ){
        return service.updateTourist(id,tourist);
    }

    @GetMapping("tourist/{id}")
    public Tourist getById(@PathVariable int id){
        return service.getById(id);
    }

}
