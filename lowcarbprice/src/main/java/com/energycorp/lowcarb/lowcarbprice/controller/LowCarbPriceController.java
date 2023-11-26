package com.energycorp.lowcarb.lowcarbprice.controller;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import com.energycorp.lowcarb.lowcarbprice.service.ILowCarbPriceService;
import com.energycorp.lowcarb.lowcarbprice.service.LowCarbPriceService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/lowcarprice")
public class LowCarbPriceController {

   private final ILowCarbPriceService iLowCarbPriceService;

    public LowCarbPriceController(ILowCarbPriceService iLowCarbPriceService) {
        this.iLowCarbPriceService = iLowCarbPriceService;
    }


    @GetMapping(value = "/latestPrice", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    MomentPrice getMomentPrice() {
        return iLowCarbPriceService.getMomentPrice();
    }

        /*
        @GetMapping("/nbkwh")
        public @ResponseBody
        BigDecimal getPriceLowCarb(@PathVariable("nbkwh") BigDecimal nbkwh){
            return lowCarbPriceService.getPriceLowCarb();
        }
        */

}
