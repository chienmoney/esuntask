package com.example.etask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.etask.model.SeatingChart;
import org.springframework.web.bind.annotation.*;
import com.example.etask.service.SeatingChartService;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SeatingChartService seatingChartService;

    @GetMapping("/seating-charts")
    public List<SeatingChart> getAllSeatingCharts() {
        return seatingChartService.findAll();
    }
}
