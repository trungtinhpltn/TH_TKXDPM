package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidatePhoneNumberTest {
	private PlaceOrderController placeOrderController;

	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"0123456789,true",
		"012345678, false",
		"mothaiba,false",
		"Mot1231,false",
		"@!@#!,false",
		"9123456789,false"
		
	})

	@Test
	void test(String phone, boolean expected) {
		boolean isValided = placeOrderController.validatePhoneNumber(phone);
		assertEquals(expected, isValided);
	}
}
