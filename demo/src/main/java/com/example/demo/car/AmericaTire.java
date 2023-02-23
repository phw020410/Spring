package com.example.demo.car;

import com.example.demo.Tire;

public class AmericaTire implements Tire {

    @Override
    public void getBrand() {
        System.out.println("America Tire!");
    }
}
