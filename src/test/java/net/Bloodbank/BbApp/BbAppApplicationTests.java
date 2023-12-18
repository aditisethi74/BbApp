package net.Bloodbank.BbApp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class BbAppApplicationTests {
	private Calculator calc=new Calculator();
	@Disabled
	@Test
	void contextLoads() {
	}
	
	//private Calculator calc=new Calculator();
	
	@Test
	void testSum() {
int actualResult	=calc.doSum(10, 20, 30);
	//calc.doProduct(10, 20);
	int  expectedResult=60; 
	assertThat(actualResult).isEqualTo(expectedResult);
	}
	
	@Test
	void testProduct() {
		int expectedResult=200;
	int actualResult=calc.doProduct(10, 20)	;
	assertThat(actualResult).isEqualTo(expectedResult);
	}

}
