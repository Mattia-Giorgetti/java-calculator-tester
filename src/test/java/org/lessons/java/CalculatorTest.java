package org.lessons.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static Calculator calculator = null;

    @BeforeAll
    static void setup(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("verifica somma")
    void add() {
        assertEquals(10.00F, calculator.add(5.50F, 4.50F), "La somma deve essere 10.00");
    }

    @Test
    @DisplayName("verifica sottrazione")
    void subtract() {
        assertEquals(51.927704F, Calculator.subtract(63.712F, 11.7843F));
        assertTrue(Calculator.subtract(24F, 38.50F) == -14.5F);
    }

    @Test
    @DisplayName("verifica divisione")
    void divide() {
        assertEquals(4.66141029F, calculator.divide(315.35F,67.6512F));
        assertThrows(IllegalArgumentException.class, ()-> calculator.divide(10,0), "Deve sollevare una IllegalArgumentException");
    }

    @Test
    @DisplayName("verifica moltiplicazione")
    void multiply() {
        assertEquals(4F, calculator.multiply(2F,2F));
        assertThrows(IllegalArgumentException.class, ()-> calculator.multiply(98.567F, 0), "Il messaggio solleva una IllegalArgumentException");
    }
}