package placeRushOrderController;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceRushOrderController;

class ValidateDeliveryDateTest {
	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}
	@ParameterizedTest
	@CsvSource({
        "2021-12-10, true",
        "2021-12-29, false",
        ", false"
	})
	@Test
	void test(String date, boolean expected ) {
		boolean rs = placeRushOrderController.validateDeliveryDate(date);
        assertEquals(expected, rs);
	}

}
