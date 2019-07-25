package com.example.demo;

import java.time.LocalDate;

import org.junit.Test;

public class MiscTests {

	@Test
	public void boot() {
		
	}

	@Test
	public void getAge() {
		System.out.println(Calculator.getAge(LocalDate.of(1962, 06, 15)));
		System.out.println(Calculator.getAge(LocalDate.of(1980, 03, 15)));
	}

	@Test
	public void getDistanceBetween() {
		System.out.println(Calculator.getDistance(LocalDate.of(1962, 06, 15),LocalDate.of(1980, 03, 15)));
	}


	@Test
	public void java12Switch() {
		var name = "Tyler";
		switch (name) {
		case "Scott", "Tyler" -> System.out.println("Name was a Stanlick");
		case "Jennifer" -> System.out.println("Name was Jennifer");
		default -> System.out.println("Bad name.");
		}
	}
}
