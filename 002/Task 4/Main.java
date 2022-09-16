package com.company;

abstract class Shape { //Теперь абстрактный класс
    private double volume;

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}

abstract class Pyramid extends Shape { //Теперь абстрактный класс
    private double s;
    private double h;
}


class Box extends Shape {

    public boolean add(Shape shape) {
        if (this.getVolume() < shape.getVolume()) {
            return false;
        } else {
            double freeVolume = this.getVolume() - shape.getVolume();
            this.setVolume(freeVolume);
            return true;
        }
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

}

abstract class Cylinder extends SolidOfRevolution { //Теперь абстрактный класс
    private double height;
}

class Ball extends SolidOfRevolution {}


public class Main {

    private static void successOrNot(boolean r){
        if (r){
            System.out.println("Добавить удалось"); 
        } else{
            System.out.println("Добавить не удалось"); 
        }
    }
    public static void main(String[] args) {
       
        Box box = new Box();
        box.setVolume(100.5);

        Ball ball1 = new Ball();
        ball1.setVolume(33.5);

        System.out.println("\nОбъём коробки: " + box.getVolume());
        boolean result = box.add(ball1);
        successOrNot(result);
        System.out.println("Объём коробки: " + box.getVolume());

        SolidOfRevolution obj = new SolidOfRevolution();
        obj.setVolume(435);

        System.out.println("\nОбъём коробки: " + box.getVolume());
        result = box.add(obj);
        successOrNot(result);
        System.out.println("Объём коробки: " + box.getVolume());
    }
}