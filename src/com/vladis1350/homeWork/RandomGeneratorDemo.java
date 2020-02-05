package com.vladis1350.homeWork;

import java.util.Random;

public class RandomGeneratorDemo {
    public int a;
    public int b;
    public int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public static void main(String[] args) {
        Random random = new Random();
        RandomGeneratorDemo randomGeneratorDemo = new RandomGeneratorDemo();
        randomGeneratorDemo.setA(random.nextInt(50));
        randomGeneratorDemo.setB(random.nextInt(50));
        randomGeneratorDemo.setC(random.nextInt(50));
        System.out.println("Случайное число а = " + randomGeneratorDemo.getA());
        System.out.println("Случайное число b = " + randomGeneratorDemo.getB());
        System.out.println("Случайное число b = " + randomGeneratorDemo.getC());
        randomGeneratorDemo.setResult(randomGeneratorDemo.getA() + randomGeneratorDemo.getB() + randomGeneratorDemo.getC());
        System.out.println("Результат сложения а и b = " + randomGeneratorDemo.getResult());
    }
}
