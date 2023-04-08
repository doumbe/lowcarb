package com.energycorp.lowcarb.quoting.service;

import com.energycorp.lowcarb.core.bo.MomentPrice;
import com.energycorp.lowcarb.core.bo.ProductOfferingPrice;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class QuotingService {

    private static final String QUOTING_URL_LOCARBPRICE = "http://localhost:9090/api/lowcarprice/latestPrice";
    private static final String QUOTING_URL_COALFIRED = "http://localhost:3000/platform/productCatalogManagement/v4/productOfferingPrice/block-256-offer-price";

    private final RestTemplate restTemplate;

    public QuotingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Retourne le prix actuel en fonction du nbkwh fournit par l'utilisateur
    public BigDecimal getPriceByNbKwh(BigDecimal nbkwh) {

        BigDecimal priceKwhMixEnergie = getPriceMixEnergie(nbkwh);

        return nbkwh.multiply(priceKwhMixEnergie);


        //return priceKwhMixEnergie.floatValue();
    }

    // Calcul price KwhMix Energie pour obtenir le prix des deux energies
    private BigDecimal getPriceMixEnergie(BigDecimal nbkw) {

        BigDecimal priceCoalFired = getCoalFiredPrice(); // l'energie salle

        BigDecimal priceLowCarb = getPriceLowCarb(); // l'energie propre

        return priceCoalFired.add(priceLowCarb);

    }

    // Méthode qui appel un micro-service Lowcarb
    public BigDecimal getPriceLowCarb() {
        final MomentPrice mp =
                restTemplate.getForObject(QUOTING_URL_LOCARBPRICE,
                        MomentPrice.class);
        assert mp != null;
        return mp.getPrice() != null ? mp.getPrice():BigDecimal.ZERO;
    }

    // Calcul prix fixe de 10 dollars pour 256kwh pour l’énergie carbonée.
    private BigDecimal getCoalFiredPrice() {

        final ProductOfferingPrice productOfferingPrice =
                restTemplate.getForObject(QUOTING_URL_COALFIRED,
                        ProductOfferingPrice.class);
        assert productOfferingPrice != null;
        return BigDecimal.valueOf(productOfferingPrice.getPrice().getValue());
    }

}


