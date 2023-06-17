package org.poc.strategy;

import org.poc.strategy.core.entity.Budget;
import org.poc.strategy.core.entity.ICMS;
import org.poc.strategy.core.entity.ISS;
import org.poc.strategy.core.usecase.EstimateTax;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EstimateTax.execute(Budget.builder()
                .tax(new ICMS())
                .income(new BigDecimal(100))
                .build());

        EstimateTax.execute(Budget.builder()
                .tax(new ISS())
                .income(new BigDecimal(100))
                .build());
    }
}
