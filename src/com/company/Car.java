package com.company;

public class Car implements AutoCloseable {
    private String model;
    private String color;
    private int age;

    public Car(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void drive (){
        System.out.println("Maшина журуп жатат");
    };
    public void close() throws Exception {
        System.out.println("Машина жабылып жатат");
    };

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
