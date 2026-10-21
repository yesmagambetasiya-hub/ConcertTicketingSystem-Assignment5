
package org.example.strategy;

public class EarlyBirdPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(
            double basePrice,
            int daysBeforeConcert,
            int demand,
            boolean loyalCustomer) {

        if (daysBeforeConcert >= 30) {
            return basePrice * 0.80;
        }

        return basePrice;
    }
}
