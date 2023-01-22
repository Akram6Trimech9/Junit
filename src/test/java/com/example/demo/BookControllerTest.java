package com.example.demo;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;

import org.junit.*; 
public class BookControllerTest {
	private MockMvc mockmvc ; 
	ObjectMapper objectmapper=new ObjectMapper();
	ObjectWriter objWriter=objectmapper.writer();		
}
