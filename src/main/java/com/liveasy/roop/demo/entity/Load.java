package com.example.demoforfrnd.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "loads")
public class Load {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String loadingPoint;

    @Column(nullable = false)
    private String unloadingPoint;

    @Column(nullable = false)
    private String productType;

    @Column(nullable = false)
    private String truckType;

    @Column(nullable = false)
    private int noOfTrucks;

    @Column(nullable = false)
    private int weight;

    private String comment;

    @Column(nullable = false)
    private String shipperId;
    @Column(nullable = false)
    private LocalDate date;


    public Long getId() {
        return id;
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public String getComment() {
        return comment;
    }

    public String getShipperId() {
        return shipperId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setShipperId(String shipperId) {
        this.shipperId = shipperId;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

}