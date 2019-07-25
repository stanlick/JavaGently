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


	@Test
	public void contextLoads() {
		System.out.println("Test was executed");
	}


}
