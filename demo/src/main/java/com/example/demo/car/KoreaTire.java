package com.example.demo.car;

import com.example.demo.Tire;

public class KoreaTire implements Tire {

    @Override
    public void getBrand() {
        System.out.println("Korea Tire!!");
    }
}
