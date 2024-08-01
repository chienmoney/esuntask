package com.example.etask.service;

import com.example.etask.model.SeatingChart;
import com.example.etask.repository.SeatingChartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SeatingChartService {

    @Autowired
    private SeatingChartRepository seatingChartRepository;

    public List<SeatingChart> findAll() {
        return seatingChartRepository.findAll();
    }

    public Optional<SeatingChart> findById(Integer floorSeatSeq) {
        return seatingChartRepository.findById(floorSeatSeq);
    }

    public SeatingChart save(SeatingChart seatingChart) {
        return seatingChartRepository.save(seatingChart);
    }

    public void deleteById(Integer floorSeatSeq) {
        seatingChartRepository.deleteById(floorSeatSeq);
    }
}
