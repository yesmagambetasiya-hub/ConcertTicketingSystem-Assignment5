package org.example.strategy;

public interface PricingStrategy {
    double calculatePrice(
            double basePrice,
            int daysBeforeConcert,
            int demand,
            boolean loyalCustomer
    );
}