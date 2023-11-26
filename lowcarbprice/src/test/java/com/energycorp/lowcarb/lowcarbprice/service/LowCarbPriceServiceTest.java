package com.energycorp.lowcarb.lowcarbprice.service;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class LowCarbPriceServiceTest {

    LowCarbPriceService service = new LowCarbPriceService();

   /* @Test
    public void testGetPrice() {
        // Créer un mock de LowCarbPriceService
        LowCarbPriceService mockService = mock(LowCarbPriceService.class);

        // Définir la valeur à retourner par le mock de LowCarbPriceService
        MomentPrice expectedPrice = new MomentPrice();
        expectedPrice.setPrice(new BigDecimal("0.12"));
        expectedPrice.setDate(LocalDate.of(2023,4,8));

        when(mockService.getPrice()).thenReturn(expectedPrice);

        // Vérifier que la valeur retournée par la méthode getPrice() de LowCarbPriceController est correcte
        assertEquals(expectedPrice, mockService.getPrice());
    }*/

    @Test
    void testWithoutMockito() {
        MomentPrice momentPrice = service.getMomentPrice();
        //assertNotEquals(null, momentPrice);
        assertNotNull(momentPrice);
        // Verifie bien que la valeur de momentPrice est bien entre le min et max que j'ai définie
        assertThat(momentPrice.getPrice().doubleValue(), allOf(greaterThanOrEqualTo(0.8), lessThanOrEqualTo(0.9)));
        //assertNotEquals(null, momentPrice.getPrice());
        assertEquals(momentPrice.getDate(), LocalDate.now());
    }
}
