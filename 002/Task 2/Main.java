package com.company;

import java.util.Random;

class Vector {

    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {        // Конструктор
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {                    // Длина вектора
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double dot(Vector vector) {          // Скалярное произведение
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector crossProduct(Vector vector) { // Векторное произведение
        int newX = y * vector.z - z * vector.y;
        int newY = z * vector.x - x * vector.z;
        int newZ = x * vector.y - y * vector.x;
        return new Vector(newX, newY, newZ);
    }

    public double vectorCos(Vector vector) {    // Угол между векторами
        double d = dot(vector);
        double length1 = length();
        double length2 = vector.length();
        return d / (Math.abs(length2) * Math.abs(length1));
    }

    public Vector vectorSum(Vector vector) {         // Сумма векторов
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector difference(Vector vector) {       // Разность векторов
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] generator(int N) {       // Генератор массива случайных векторов
        Vector vectorsArr[];
        vectorsArr = new Vector[N];
        for (int i = 0; i < N; i++) {
            Random rand = new Random();
            // Generate random integers in range 0 to 999
            int randx = rand.nextInt(100);
            int randy = rand.nextInt(100);
            int randz = rand.nextInt(100);
            vectorsArr[i] = new Vector(randx, randy, randz);
        }

        return vectorsArr;
    }

    public void get() {
        System.out.format("(%d, %d, %d)%n", x, y, z);
    }
}

public class Main {

    public static void main(String[] args) {

        //Случайные вектора
        Vector[] vectors = Vector.generator(5);
        for (int i = 0; i < vectors.length; i++) {
            vectors[i].get();
        }

        Vector vector1 = new Vector(2, 5, 5);
        Vector vector2 = new Vector(10, 25, 2);
        System.out.println("\nВектор 1");
        vector1.get();
        System.out.println("\nВектор 2");
        vector2.get();

        System.out.println("\nДлина вектора 1: " + vector1.length());
        System.out.println("Длина вектора 2: " + vector2.length());

        System.out.println("Скалярное произведение вектора 1 и 2: " + vector1.dot(vector2));
        System.out.println("Векторное произведение вектора 1 и 2:");
        vector1.crossProduct(vector2).get();

        System.out.println("Угол между векторами 1 и 2: " + vector1.vectorCos(vector2));

        System.out.println("Сумма векторов 1 и 2");
        vector1.vectorSum(vector2).get();

        System.out.println("Разность векторов 1 и 2");
        vector1.difference(vector2).get();
    }
}