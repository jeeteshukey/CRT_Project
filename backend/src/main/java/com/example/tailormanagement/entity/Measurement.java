package com.example.tailormanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "measurements")
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long measurementId;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Double chest;
    private Double waist;
    private Double shoulder;
    private Double sleeve;
    private Double neck;
    private Double shirtLength;
    private Double hip;
    private Double thigh;
    private Double inseam;
    private Double outseam;

    public Measurement() {
    }

    public Long getMeasurementId() {
        return measurementId;
    }

    public void setMeasurementId(Long measurementId) {
        this.measurementId = measurementId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Double getChest() {
        return chest;
    }

    public void setChest(Double chest) {
        this.chest = chest;
    }

    public Double getWaist() {
        return waist;
    }

    public void setWaist(Double waist) {
        this.waist = waist;
    }

    public Double getShoulder() {
        return shoulder;
    }

    public void setShoulder(Double shoulder) {
        this.shoulder = shoulder;
    }

    public Double getSleeve() {
        return sleeve;
    }

    public void setSleeve(Double sleeve) {
        this.sleeve = sleeve;
    }

    public Double getNeck() {
        return neck;
    }

    public void setNeck(Double neck) {
        this.neck = neck;
    }

    public Double getShirtLength() {
        return shirtLength;
    }

    public void setShirtLength(Double shirtLength) {
        this.shirtLength = shirtLength;
    }

    public Double getHip() {
        return hip;
    }

    public void setHip(Double hip) {
        this.hip = hip;
    }

    public Double getThigh() {
        return thigh;
    }

    public void setThigh(Double thigh) {
        this.thigh = thigh;
    }

    public Double getInseam() {
        return inseam;
    }

    public void setInseam(Double inseam) {
        this.inseam = inseam;
    }

    public Double getOutseam() {
        return outseam;
    }

    public void setOutseam(Double outseam) {
        this.outseam = outseam;
    }
}