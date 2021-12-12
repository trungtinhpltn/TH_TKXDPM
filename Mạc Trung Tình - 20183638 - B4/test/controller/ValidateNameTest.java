package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameTest {
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		",false",
		"Nhat Phong dep trai,true",
		"Nhat Phong dep trai 1,false",
		"Nhat Phong dep trai @#,false",
		"@#!@#!,false",
		"9123456789,false"
		
	})

	@Test
	void test(String name, boolean expected) {
		boolean isValided = placeOrderController.validateName(name);
		assertEquals(expected, isValided);
	}
}

