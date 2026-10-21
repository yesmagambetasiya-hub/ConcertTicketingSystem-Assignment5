
package org.example.strategy;

public class TicketPricing {

    public double calculatePrice(
            String type,
            double basePrice,
            int daysBeforeConcert,
            int demand,
            boolean loyalCustomer) {

        PricingStrategy strategy;

        switch (type) {
            case "EARLY_BIRD":
                strategy = new EarlyBirdPricingStrategy();
                break;

            case "DEMAND":
                strategy = new DemandPricingStrategy();
                break;

            case "LOYALTY":
                strategy = new LoyaltyPricingStrategy();
                break;

            default:
                throw new IllegalArgumentException(
                        "Unknown pricing type: " + type
                );
        }

        return strategy.calculatePrice(
                basePrice,
                daysBeforeConcert,
                demand,
                loyalCustomer
        );
    }
}
