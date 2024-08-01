package com.example.etask.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "seatingchart")
public class SeatingChart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "floor_seat_seq", nullable = false)
    private Integer floorSeatSeq;

    @Column(name = "floor_no", nullable = false)
    private Integer floorNo;

    @Column(name = "seat_no", nullable = false)
    private Integer seatNo;

    // Getters and Setters
    public Integer getFloorSeatSeq() {
        return floorSeatSeq;
    }

    public void setFloorSeatSeq(Integer floorSeatSeq) {
        this.floorSeatSeq = floorSeatSeq;
    }

    public Integer getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(Integer floorNo) {
        this.floorNo = floorNo;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }
}
