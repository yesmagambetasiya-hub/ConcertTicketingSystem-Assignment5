
package org.example.strategy;

public class LoyaltyPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(
            double basePrice,
            int daysBeforeConcert,
            int demand,
            boolean loyalCustomer) {

        if (loyalCustomer) {
            return basePrice * 0.90;
        }

        return basePrice;
    }
}
