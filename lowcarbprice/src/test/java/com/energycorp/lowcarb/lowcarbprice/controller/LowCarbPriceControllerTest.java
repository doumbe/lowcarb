/*
package com.energycorp.lowcarb.lowcarbprice.controller;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import com.energycorp.lowcarb.lowcarbprice.service.LowCarbPriceService;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
@AutoConfigureMockMvc
public class LowCarbPriceControllerTest {

    @Mock
    public LowCarbPriceService lowCarbPriceService;

    public LowCarbPriceControllerTest(LowCarbPriceService lowCarbPriceService) {
        this.lowCarbPriceService = lowCarbPriceService;
    }

    @Test
    public void getMomentPrice() {

        MomentPrice momentPrice = new MomentPrice();
        momentPrice.setPrice(BigDecimal.valueOf(0.8124));
        momentPrice.setDate(LocalDate.now());


    }
}

 */