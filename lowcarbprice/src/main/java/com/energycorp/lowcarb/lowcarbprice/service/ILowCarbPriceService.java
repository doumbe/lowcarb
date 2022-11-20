package com.energycorp.lowcarb.lowcarbprice.service;

import com.energycorp.lowcarb.core.bo.MomentPrice;

import java.math.BigDecimal;

public interface ILowCarbPriceService {

    MomentPrice getPrice();
    //public BigDecimal getPriceLowCarb();
}
