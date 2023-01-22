package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	 Calculator calculator ; 
	 
	 @BeforeEach
	  void Setup() {
		 calculator = new Calculator();
	 }
	 @Test
	 void TestMultiply() {
		 assertEquals(20, calculator.multiply(4,5));
	 }
	 
	 @Test
	  public void testMultiply_Differentparameteres() {
		 assertEquals(15, calculator.multiply(3,5)); 
	 }
	 @Test
	 public  void TestDevide() {
		 assertEquals(4, calculator.devide(8,2));
	 }
	 @AfterAll
	 void print() { 
		 fail("after all test");
	 }
	 

}
