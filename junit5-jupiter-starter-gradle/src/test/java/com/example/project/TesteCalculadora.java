package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TesteCalculadora {
	private final Calculator calculator = new Calculator();

    @Test
    void adicao() {
        assertEquals(2, calculator.add(1, 1));
        assertEquals(-2, calculator.add(-1, -1));
        assertEquals(5, calculator.add(2.5, 2.5));
        assertEquals(0, calculator.add(0,0));
//        assertEquals(c, calculator.add('a', 'b'));

    }
    
    @Test
    void subtracao() {
        assertEquals(1, calculator.sub(2, 1));
        assertEquals(-1, calculator.sub(2, 3));
        assertEquals(5.2, calculator.sub(10, 4.8));
        assertEquals(0, calculator.sub(0, 0));
//        assertEquals('a', calculator.sub('b', 'c'));
    }
    
    @Test
    void multiplicacao() {
    	assertEquals(6, calculator.mult(2, 3));
    	assertEquals(-6, calculator.mult(-2, 3));
    	assertEquals(3, calculator.mult(1.5, 2));
    	assertEquals(0, calculator.mult(0, 0));
//    	assertEquals('a', calculator.mult('b', 'c'));

    }
    
    @Test
    void divisao() {
    	assertEquals(2, calculator.div(4, 2));
    	assertEquals(-2, calculator.div(-4, 2));
    	assertEquals(1.5, calculator.div(3, 2));
    	assertEquals(0, calculator.div(0, 1));
//    	assertEquals('a', calculator.div('c', 'b'));

    }
}
