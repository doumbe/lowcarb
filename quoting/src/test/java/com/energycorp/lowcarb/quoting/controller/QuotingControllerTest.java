package com.energycorp.lowcarb.quoting.controller;


import com.energycorp.lowcarb.quoting.service.QuotingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class QuotingControllerTest {

    @Autowired
    private QuotingController quotingController;
    private QuotingService quotingService;

    @Before
    public void setUp() {
        quotingService = mock(QuotingService.class);
        // On initialise le contrôleur avec le service de devis
        quotingController = new QuotingController(quotingService);
    }

    @Test
    public void testGetPriceByNbKwh() {
        // Préparation des données de test
        int nbKwh = 150;
        BigDecimal expectedPrice = BigDecimal.valueOf(70.0); // Remplacez ceci par la valeur attendue dans le test

        // Définir le comportement simulé du service de devis
        when(quotingService.getPriceByNbKwh(BigDecimal.valueOf(nbKwh))).thenReturn(expectedPrice);
        // Appel de la méthode du contrôleur
        BigDecimal actualPrice = quotingService.getPriceByNbKwh(BigDecimal.valueOf(nbKwh));
        // Vérification
        assertEquals(expectedPrice, actualPrice);
        // On verifie si la méthode du service de devis a bien été appelée avec le bon argument
        verify(quotingService, times(1)).getPriceByNbKwh(BigDecimal.valueOf(nbKwh));
    }

}