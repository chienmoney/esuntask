package com.example.etask.repository;

import com.example.etask.model.SeatingChart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatingChartRepository extends JpaRepository<SeatingChart, Integer> {
    // 這裡可以添加自定義查詢方法
}
