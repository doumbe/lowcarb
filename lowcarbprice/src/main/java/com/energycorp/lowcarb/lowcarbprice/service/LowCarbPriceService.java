package com.energycorp.lowcarb.lowcarbprice.service;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.time.LocalDate;
import java.util.Random;

@Service
public class LowCarbPriceService implements ILowCarbPriceService {

    private static final Double MIN_VALUE = 0.8;

    private static final Double MAX_VALUE = 0.9;

    private static final Integer PRECISION = 4;

    @Override
    public MomentPrice getMomentPrice() {
        Random randomValue = new Random();
        //double value = randomValue.doubles(1, MIN_VALUE, MAX_VALUE).findAny().orElse(0.8675);
        BigDecimal valueBigDecimal = BigDecimal.valueOf(randomValue.doubles(1, MIN_VALUE, MAX_VALUE).findAny().orElse(0.8675)).round(new MathContext(PRECISION));

        MomentPrice momentPrice = new MomentPrice();
        momentPrice.setPrice(valueBigDecimal);
        momentPrice.setDate(LocalDate.now());
        return momentPrice;
    }

}

