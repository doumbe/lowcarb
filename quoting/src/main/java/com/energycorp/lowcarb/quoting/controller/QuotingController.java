package com.energycorp.lowcarb.quoting.controller;

import java.math.BigDecimal;

import com.energycorp.lowcarb.quoting.service.QuotingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/quoting")
public class    QuotingController {

    private final QuotingService quotingService;

    public QuotingController(QuotingService quotingService) {
        this.quotingService = quotingService;
    }

    @GetMapping("/res")
    //http://localhost:8090/api/quoting/res?nbkwh=10
    //https://www.baeldung.com/spring-requestparam-vs-pathvariable
    public @ResponseBody BigDecimal getPriceByNbKwh(@RequestParam int nbkwh) {
        return quotingService.getPriceByNbKwh(BigDecimal.valueOf(nbkwh));
    }
}
