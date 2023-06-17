package org.poc.strategy.core.entity;

import java.math.BigDecimal;

public abstract class Tax {
    private final BigDecimal rate;

    public Tax(BigDecimal rate) {
        this.rate = rate;
    }

    public BigDecimal execute(BigDecimal value) {
        return this.rate.multiply(value);
    }
}
