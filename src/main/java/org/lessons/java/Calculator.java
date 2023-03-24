package org.lessons.java;

public class Calculator {
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static float subtract(float num1, float num2){
        return num1 - num2;
    }
    public static float divide(float num1, float num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Impossibile dividere per zero");
        }
        return num1 / num2;
    }
    public static float multiply(float num1, float num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Il risultato sarà sempre 0!");
        }
        return num1 * num2;
    }
}
