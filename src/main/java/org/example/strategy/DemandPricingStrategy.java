
package org.example.strategy;

public class DemandPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(
            double basePrice,
            int daysBeforeConcert,
            int demand,
            boolean loyalCustomer) {

        if (demand > 80) {
            return basePrice * 1.50;
        }

        return basePrice;
    }
}
