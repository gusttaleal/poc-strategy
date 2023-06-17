package org.poc.strategy.core.usecase;

import org.poc.strategy.core.entity.Budget;

public class EstimateTax {
    public static void execute(Budget budget) {
        var income = budget.getIncome();
        var tax = budget.getTax().execute(income);
        System.out.println(tax);
    }
}
