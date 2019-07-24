package com.example.demo;

import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import static org.hamcrest.CoreMatchers.*;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Inject
	private Calculator calculator;

	@Test
	public void contextLoads() {
		System.out.println("Test was executed");
	}

	@Test
	public void getCalclulator() {
		assertThat(calculator, notNullValue());
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
		
	}
}
