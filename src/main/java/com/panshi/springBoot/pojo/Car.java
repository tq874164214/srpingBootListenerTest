package com.panshi.springBoot.pojo;



public class Car {
    private String brand;//品牌
    private String type;//型号
    private double speed;//最大时速

    public Car() {
    }

    public Car(String brand, String type, double speed) {
        this.brand = brand;
        this.type = type;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", type=" + type + ", speed=" + speed + "]";
    }
}