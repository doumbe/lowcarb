package com.energycorp.lowcarb.lowcarbprice.controller;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import com.energycorp.lowcarb.lowcarbprice.service.LowCarbPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.time.LocalDateTime;

public class LowCarbPriceControllerTestBis {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private LowCarbPriceService lowCarbPriceService;

    // Un mock pour stimuler sur le EndPoint
    @Test
    public void testGetMomentPrice() throws Exception {
        MomentPrice momentPrice = new MomentPrice(100.0, LocalDateTime.now());
        when(lowCarbPriceService.getMomentPrice()).thenReturn(momentPrice);
        mockMvc.perform(MockMvcRequestBuilders.get("/latestPrice")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.price").value(momentPrice.getPrice()))
                .andExpect(jsonPath("$.timestamp").value(momentPrice.getTimestamp().toString()));
    }

}



