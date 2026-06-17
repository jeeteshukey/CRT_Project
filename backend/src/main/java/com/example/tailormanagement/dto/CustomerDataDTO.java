package com.example.tailormanagement.dto;

import java.time.LocalDate;

public class CustomerDataDTO {

    // Customer Details
    private String name;
    private String mobile;
    private String address;
    private String gender;

    // Measurements
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

    // Order Details
    private String garmentType;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Double totalAmount;
    private Double advancePaid;
    private Double remainingAmount;
    private String notes;

    public CustomerDataDTO() {
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public String getGarmentType() {
        return garmentType;
    }

    public void setGarmentType(String garmentType) {
        this.garmentType = garmentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getAdvancePaid() {
        return advancePaid;
    }

    public void setAdvancePaid(Double advancePaid) {
        this.advancePaid = advancePaid;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public void setRemainingAmount(Double remainingAmount) {
        this.remainingAmount = remainingAmount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}