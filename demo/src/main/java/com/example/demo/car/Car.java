package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import jakarta.annotation.Resource;

public class Car {
    @Autowired
    @Qualifier("koreaTire")
    private Tire tire;
    
    public Car() {
        System.out.println("Constructer");
    }

    public Tire getTire() {
        return this.tire;
    }

    public void setTire(Tire tire) {
        System.out.println("setTire");
        this.tire = tire;
    };

    public void getBrand() {
        tire.getBrand();
    }
}
