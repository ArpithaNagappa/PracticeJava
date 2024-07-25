package org.Launchcode;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product{
        private final Supplier<Double> priceSupplier;
        private final Function<LocalDate, Boolean> availabilityFunction;
        public GenericProduct(final Supplier<Double> priceSupplier, final Function<LocalDate,
                Boolean> availabilityFunction) {
            this.priceSupplier = priceSupplier;
            this.availabilityFunction = availabilityFunction;
        }
        @Override
        public Double getPrice() {
            return priceSupplier.get();
        }
        @Override
        public Boolean isAvailable(LocalDate localDate) {
            return availabilityFunction.apply(localDate);
        }
    }



