
package org.example.strategy;

public class TicketPricing {

    public double calculatePrice(
            String type,
            double basePrice,
            int daysBeforeConcert,
            int demand,
            boolean loyalCustomer) {

        if (type.equals("EARLY_BIRD")) {
            if (daysBeforeConcert >= 30) {
                return basePrice * 0.80;
            }
            return basePrice;
        }

        if (type.equals("DEMAND")) {
            if (demand > 80) {
                return basePrice * 1.50;
            }
            return basePrice;
        }

        if (type.equals("LOYALTY")) {
            if (loyalCustomer) {
                return basePrice * 0.90;
            }
            return basePrice;
        }

        throw new IllegalArgumentException(
                "Unknown pricing type: " + type
        );
    }
}
