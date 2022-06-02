package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        try (Car car = new Car("Mersedes G55", "Black", 2022)){
            Car.drive();
            }
    catch (Exception e) {
        e.printStackTrace();
        }}}


