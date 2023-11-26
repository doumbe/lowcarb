package com.energycorp.lowcarb.quoting.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.math.BigDecimal;

@RunWith(MockitoJUnitRunner.class)
public class QuotingServiceTest {

    // Il faut refaire le test en utilisant getPriceLowCarb

    @Test
    public void whenBigDecimalCreatedUsingValueOf_thenValueMatches() {
        BigDecimal bdFromLong1 = BigDecimal.valueOf(123412345678901L);
        BigDecimal bdFromLong2 = BigDecimal.valueOf(123412345678901L, 2);
        BigDecimal bdFromDouble = BigDecimal.valueOf(0.1d);

        assertEquals("123412345678901", bdFromLong1.toString());
        assertEquals("1234123456789.01", bdFromLong2.toString());
        assertEquals("0.1", bdFromDouble.toString());
    }

}

