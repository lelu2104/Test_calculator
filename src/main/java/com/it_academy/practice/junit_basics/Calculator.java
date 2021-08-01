package com.it_academy.practice.junit_basics;

import java.util.Scanner;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float calculate(char operation) {
        switch (operation) {
            default: {
                return 0;
            }
            case '-': {
                return a - b;
            }
            case '+': {
                return a + b;
            }
            case '/': {
                return a / b;
            }
            case '*': {
                return a * b;
            }
            case '^': {
                float result = Float.parseFloat(String.valueOf(Math.pow(Double.parseDouble(String.valueOf(a)), Double.parseDouble(String.valueOf(b)))));
                return result;
            }
            case 's': {
                float result = Float.parseFloat(String.valueOf(Math.sqrt(Double.parseDouble(String.valueOf(a)))));
                return result;
            }
        }
    }

    public float calculate1(char operation, int n) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        float result = calculate2(array, operation);
        return result;
    }

    public float calculate2(int[] arr, char operation1) {
        int number = 0;
        switch (operation1) {
            default: {
                return 0;
            }
            case '-': {
                for (int i = 0; i < arr.length; i++) {
                    number = arr[0];
                    do {
                        number = number - arr[i + 1];
                        i = i + 1;
                    }
                    while (arr.length - 1 > i);
                }
                return number;
            }
            case '+': {
                for (int i = 0; i < arr.length; i++) {
                    number = arr[0];
                    do {
                        number = number + arr[i + 1];
                        i = i + 1;
                    }
                    while (arr.length - 1 > i);
                }
                return number;
            }
            case '/': {
                for (int i = 0; i < arr.length; i++) {
                    number = arr[0];
                    do {
                        number = number / arr[i + 1];
                        i = i + 1;
                    }
                    while (arr.length - 1 > i);
                }
                return number;
            }
            case '*': {
                for (int i = 0; i < arr.length; i++) {
                    number = arr[0];
                    do {
                        number = number * arr[i + 1];
                        i = i + 1;
                    }
                    while (arr.length - 1 > i);
                }
                return number;
            }
        }
    }
}
