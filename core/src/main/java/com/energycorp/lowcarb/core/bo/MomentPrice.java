package com.energycorp.lowcarb.core.bo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class MomentPrice {

    private BigDecimal price;
    private LocalDate date;

    public MomentPrice(double v, LocalDateTime now) { // code ajouter
    }

    public MomentPrice() {

    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MomentPrice{" +
                "price=" + price +
                ", date=" + date +
                '}';
    }

    public Object getTimestamp() { // code ajouter
        return null;
    }
}