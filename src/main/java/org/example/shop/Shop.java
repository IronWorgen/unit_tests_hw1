package org.example.shop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getCost()>o2.getCost()){
                    return 1;
                }else if(o1.getCost()<o2.getCost()){
                    return -1;
                }
                return 0;

            }
        });
        return products;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        if (products.size()==0){
            throw new IndexOutOfBoundsException("list is empty");
        }
        Product maxCostProduct = products.get(0);
        for (var product :
                products) {
            if (maxCostProduct.getCost()<product.getCost()){
                maxCostProduct = product;
            }
        }
        return maxCostProduct;
    }

}