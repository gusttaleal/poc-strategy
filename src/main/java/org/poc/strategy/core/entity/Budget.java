package org.poc.strategy.core.entity;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class Budget {
    Tax tax;
    BigDecimal income;
    BigDecimal expenses;
    BigDecimal savings;
}
