package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Tire;

public class Car {
    @Autowired
    private Tire tire;
    
    public Car() {}

    public Tire getTire() {
        return this.tire;
    }

    // public void setTire(Tire tire) {
    //     this.tire = tire;
    // };

    public void getBrand() {
        tire.getBrand();
    }
}
