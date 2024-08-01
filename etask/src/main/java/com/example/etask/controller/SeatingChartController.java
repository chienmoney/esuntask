package com.example.etask.controller;

import com.example.etask.model.SeatingChart;
import com.example.etask.repository.SeatingChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/seating-charts")
@CrossOrigin(origins = "http://localhost:8080") // 前端的 URL
public class SeatingChartController {

    @Autowired
    private SeatingChartRepository seatingChartRepository;

    @GetMapping
    public List<SeatingChart> getAllSeatingCharts() {
        return seatingChartRepository.findAll();
    }

    @GetMapping("/{floorSeatSeq}")
    public Optional<SeatingChart> getSeatingChartById(@PathVariable Integer floorSeatSeq) {
        return seatingChartRepository.findById(floorSeatSeq);
    }

    @PostMapping
    public SeatingChart createSeatingChart(@RequestBody SeatingChart seatingChart) {
        return seatingChartRepository.save(seatingChart);
    }

    @PutMapping("/{floorSeatSeq}")
    public SeatingChart updateSeatingChart(@PathVariable Integer floorSeatSeq, @RequestBody SeatingChart seatingChart) {
        seatingChart.setFloorSeatSeq(floorSeatSeq);
        return seatingChartRepository.save(seatingChart);
    }

    @DeleteMapping("/{floorSeatSeq}")
    public void deleteSeatingChart(@PathVariable Integer floorSeatSeq) {
        seatingChartRepository.deleteById(floorSeatSeq);
    }
}
