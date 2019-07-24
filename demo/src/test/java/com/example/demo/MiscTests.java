package com.example.demo;

import org.junit.Test;

public class MiscTests {


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
