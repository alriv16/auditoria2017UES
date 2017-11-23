package com.core.common;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.After;
 
 
public class EjemploBeanTest {
	private static EjemploBean helloWorld;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Antes de todas");
		helloWorld = new EjemploBean();
	}
	
	@Before
	public void before() {
		System.out.println("Antes de cada una");
	}
	
	@Test
	public void isGreaterTest() {
		System.out.println("La Prueba");
		System.out.println("Usuario "+ helloWorld.getName());
	}
	
	@After
	public void after() {
		System.out.println("Despues de cada una");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("Despues de todas");
	}
}

