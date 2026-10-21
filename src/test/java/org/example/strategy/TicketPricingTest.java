
package org.example.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketPricingTest {

    private final TicketPricing pricing = new TicketPricing();

    @Test
    void earlyBirdDiscountTest() {
        double result = pricing.calculatePrice(
                "EARLY_BIRD", 10000, 40, 50, false);

        assertEquals(8000, result);
    }

    @Test
    void earlyBirdWithoutDiscountTest() {
        double result = pricing.calculatePrice(
                "EARLY_BIRD", 10000, 10, 50, false);

        assertEquals(10000, result);
    }

    @Test
    void highDemandTest() {
        double result = pricing.calculatePrice(
                "DEMAND", 10000, 10, 90, false);

        assertEquals(15000, result);
    }

    @Test
    void normalDemandTest() {
        double result = pricing.calculatePrice(
                "DEMAND", 10000, 10, 50, false);

        assertEquals(10000, result);
    }

    @Test
    void loyaltyDiscountTest() {
        double result = pricing.calculatePrice(
                "LOYALTY", 10000, 10, 50, true);

        assertEquals(9000, result);
    }

    @Test
    void loyaltyWithoutDiscountTest() {
        double result = pricing.calculatePrice(
                "LOYALTY", 10000, 10, 50, false);

        assertEquals(10000, result);
    }

    @Test
    void unknownStrategyTest() {
        assertThrows(IllegalArgumentException.class,
                () -> pricing.calculatePrice(
                        "UNKNOWN", 10000, 10, 50, false));
    }
}
