package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.Tire;

public class Car {
    @Autowired
    @Qualifier("americaTire")
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
