package com.vladis1350.homeWork;

/**
 * разработал Урбанский Владислав
 * */

public class MathOperationsDemo {
    public int a;
    public int b;
    public double result;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public static void main(String[] args) {
        MathOperationsDemo mathOperationsDemo = new MathOperationsDemo();
        mathOperationsDemo.setA(15);
        mathOperationsDemo.setB(11);
        System.out.println("a = " + mathOperationsDemo.getA());
        System.out.println("b = " + mathOperationsDemo.getB());
        mathOperationsDemo.setResult(mathOperationsDemo.getA() + mathOperationsDemo.getB());
        System.out.println("Сложение чисел = " + mathOperationsDemo.getResult());

        mathOperationsDemo.setResult(mathOperationsDemo.getA() - mathOperationsDemo.getB());
        System.out.println("Вычитание чисел = " + mathOperationsDemo.getResult());

        mathOperationsDemo.setResult(mathOperationsDemo.getA() * mathOperationsDemo.getB());
        System.out.println("Умножение чисел = " + mathOperationsDemo.getResult());

        mathOperationsDemo.setResult(mathOperationsDemo.getA() / (double)mathOperationsDemo.getB());
        System.out.println("Деление чисел = " + mathOperationsDemo.getResult());
    }
}
