package org.poc.strategy.core.entity;

import java.math.BigDecimal;

public class ICMS extends Tax {
    public ICMS() {
        super(new BigDecimal("0.1"));
    }
}
