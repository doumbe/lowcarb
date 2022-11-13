package com.energycorp.lowcarb.lowcarbprice.controller;


import com.energycorp.lowcarb.core.bo.MomentPrice;
import com.energycorp.lowcarb.lowcarbprice.service.ILowCarbPriceService;
import com.energycorp.lowcarb.quoting.service.QuotingService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("api/lowcarprice")
public class LowCarbPriceController {

    private final ILowCarbPriceService priceEnergy;
    private final QuotingService quotingService;

    public LowCarbPriceController(ILowCarbPriceService priceEnergy, QuotingService quotingService1) {
        this.priceEnergy = priceEnergy;
        this.quotingService = quotingService1;
    }

    /*
    @GetMapping("/latest")
    public ResponseEntity<MomentPrice> getPrice() {
    return ResponseEntity.ok(priceEnergy.getPrice());
    }
    */
        @GetMapping("/latest")
        public @ResponseBody MomentPrice getPrice() {
            return priceEnergy.getPrice();
        }
        @GetMapping("/nbkwh")
        public @ResponseBody BigDecimal getPriceByNbKwh(@PathVariable("nbkwh") BigDecimal nbkwh){
            return quotingService.getPriceByNbKwh(nbkwh);
        }

}
