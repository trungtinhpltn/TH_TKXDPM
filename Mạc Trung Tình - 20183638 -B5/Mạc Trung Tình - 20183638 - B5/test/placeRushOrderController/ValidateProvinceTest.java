package placeRushOrderController;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceRushOrderController;

class ValidateProvinceTest {
	private PlaceRushOrderController placeRushOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}
	@ParameterizedTest
	@CsvSource({
        "Hà Nội, true",
        "hà nội, true",
        "Thái Nguyên, false",
        ", false"
	})
	@Test
	void test(String province, boolean expected ) {
		boolean rs = placeRushOrderController.validateProvince(province);
        assertEquals(expected, rs);
	}

}
