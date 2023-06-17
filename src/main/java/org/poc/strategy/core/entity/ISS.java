package org.poc.strategy.core.entity;

import java.math.BigDecimal;

public class ISS extends Tax {
    public ISS() {
        super(new BigDecimal("0.06"));
    }
}
