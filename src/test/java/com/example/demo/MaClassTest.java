package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MaClassTest {
	 MaClass Maclass ; 
	 @BeforeEach
	  void Setup() {
		 Maclass = new MaClass();
	 }
	  @Test
	  public void testCalculer() throws Exception {
		    assertEquals(2,Maclass.calculer(1,1));
		  }
	  
	  @Test
	  public void testt() throws Exception {
		    assertTrue(Maclass.isEqual(1,1));
		  }
	  
}
