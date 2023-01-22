package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Maclasse2 {
//	 MaClass2 Maclass2 ; 
//	 @BeforeEach
//	  void Setup() {
//		 Maclass2 = new MaClass2(1, 2);
//	 }
//	 @Test
//	  public void testCalculer() throws Exception {
//		 MaClass2 mc = new MaClass2(1,1);
//		    assertEquals(2,mc.calculer());
//		  }
//	 @Test
//	  public void testSommer() throws Exception {
//		    MaClass2 mc = new MaClass2(0,0);
//		    mc.sommer();        
//		  } 
//	 
	@Test
	 public void testSommer() throws Exception {
		MaClass2 mc = new MaClass2(1,1);
		    
		    // cas de test 1
		    assertEquals(2,mc.sommer());
		    // cas de test 2
		    try {
		      mc.setA(0);
		      mc.setB(0);
		      mc.sommer();    
		      fail("Une exception de type IllegalStateException aurait du etre levee");
		    } catch (IllegalStateException ise) {
		    }
		  }
	  
	  
	  
}
