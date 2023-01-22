package com.example.demo;

public  class MaClass {

public  int calculer(int a, int b) {
	    int res = a + b;
	    
	    if (a == 0){
	      res = b * 2;
	    } 
	    
	    if (b == 0) {
	      res = a * a;     
	    }
	    return res; 
	 }
	public boolean isEqual(int a, int b) {
	    return a == b;
	}

}
	  
