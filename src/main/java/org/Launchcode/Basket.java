package org.Launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Basket {
//        private final List<Product> productList = new ArrayList<>();
//
//        public void add(Product product) {
//            productList.add(product);
//        }
//        public void remove(Product product) {
//            productList.remove(product);
//        }
//        public List<Product> getProductList() {
//            return new ArrayList<>(productList);
//        }

    private final Map<Product, AtomicInteger> productList = new HashMap<>();
    public void add(Product product, Integer quantity) {
        if (productList.containsKey(product)) {
            productList.get(product).getAndAdd(quantity);
        } else {
            productList.put(product, new AtomicInteger(quantity));
        }
    }
    public void remove(Product product, Integer quantity) {
        if (productList.containsKey(product) && productList.get(product).get() <= quantity) {
            productList.remove(product);
        } else if (productList.containsKey(product)) {
            productList.get(product).getAndAdd(-quantity);
        }
    }

    public List<Product> getProductList() {
        return new ArrayList<>(productList.keySet());
    }

    public Map<Object, Object> getProductsQuantity() {

        return null;
    }
}


