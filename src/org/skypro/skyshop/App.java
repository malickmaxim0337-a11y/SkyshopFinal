package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Корзина ===");
        ProductBasket basket = new ProductBasket();
        basket.addProduct(new SimpleProduct("Яблоко", 50));
        basket.addProduct(new SimpleProduct("Хлеб", 40));
        basket.addProduct(new SimpleProduct("Яблоко", 60));

        System.out.println("--- Удаляем 'Яблоко' ---");
        List<Product> removed = basket.removeProductByName("Яблоко");
        for (Product p : removed) System.out.println(p);

        System.out.println("\n--- Корзина после удаления ---");
        basket.printBasket();
    }
}
