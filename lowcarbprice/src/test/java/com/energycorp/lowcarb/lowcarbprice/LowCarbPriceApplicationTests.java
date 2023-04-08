package com.energycorp.lowcarb.lowcarbprice;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import com.energycorp.lowcarb.lowcarbprice.controller.LowCarbPriceController;
import com.energycorp.lowcarb.lowcarbprice.service.LowCarbPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class LowCarbPriceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetPrice() {
		// Créer un mock de LowCarbPriceService
		LowCarbPriceService mockService = mock(LowCarbPriceService.class);

		// Définir la valeur à retourner par le mock de LowCarbPriceService
		MomentPrice expectedPrice = new MomentPrice();
		expectedPrice.setPrice(new BigDecimal("0.12"));
		when(mockService.getPrice()).thenReturn(expectedPrice);

		// Créer une instance de LowCarbPriceController avec le mock de LowCarbPriceService
		LowCarbPriceController controller = new LowCarbPriceController(mockService);

		// Appeler la méthode getPrice() de LowCarbPriceController
		MomentPrice actualPrice = controller.getPrice();

		// Vérifier que la méthode getPrice() de LowCarbPriceService a été appelée
		verify(mockService).getPrice();

		// Vérifier que la valeur retournée par la méthode getPrice() de LowCarbPriceController est correcte
		assertEquals(expectedPrice, actualPrice);
	}

}

