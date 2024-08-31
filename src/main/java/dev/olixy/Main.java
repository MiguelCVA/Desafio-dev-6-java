package dev.olixy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static List<Map<String, Object>> filterProductsByPrice(
            List<Map<String, Object>> products,
            double minPrice,
            double maxPrice
    ) {
        List<Map<String, Object>> filteredProducts = new ArrayList<>();

        for (Map<String, Object> product : products) {
            double price = (double) product.get("price");

            if(price >= minPrice && price <= maxPrice) {
                filteredProducts.add(product);
            }
        }

        return filteredProducts;
    }

    public static void main(String[] args) {
        List<Map<String, Object>> products = new ArrayList<>();

        products.add(Map.of("name", "Leite", "price", 10.00));
        products.add(Map.of("name", "Caviar", "price", 100.00));
        products.add(Map.of("name", "Kinder Ovo", "price", 45.00));
        products.add(Map.of("name", "Maizena", "price", 40.00));

        double maxPrice = 100.00;
        double minPrice = 40.00;

        List<Map<String, Object>> filteredProducts = filterProductsByPrice(products, minPrice, maxPrice);

        for (Map<String, Object> product : filteredProducts) {
            System.out.println(product);
        }
    }
}