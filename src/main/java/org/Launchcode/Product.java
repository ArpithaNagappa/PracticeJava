package org.Launchcode;

import java.time.LocalDate;

public interface Product {
        Double getPrice();
        Boolean isAvailable(LocalDate localDate);
    }

