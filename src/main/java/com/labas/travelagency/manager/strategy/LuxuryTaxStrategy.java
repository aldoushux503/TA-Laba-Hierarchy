package com.labas.travelagency.manager.strategy;

import com.labas.travelagency.util.Constants;

/**
 * Luxury tax strategy with higher tax rates.
 */
public class LuxuryTaxStrategy implements TaxStrategy {
    @Override
    public final double applyTax(double price) {
        return price * Constants.LUXURY_TOUR_TAX;
    }
}
