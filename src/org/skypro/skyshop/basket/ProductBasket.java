package org.skypro.skyshop.basket;

import org.skypro.skyshop.product.Product;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ProductBasket {
    private final List<Product> products = new LinkedList<>();
    public void addProduct(Product product) { products.add(product); }
    public int getTotalPrice() {
        int total = 0;
        for (Product p : products) total += p.getPrice();
        return total;
    }
    public void printBasket() {
        if (products.isEmpty()) { System.out.println("В корзине пусто"); return; }
        int special = 0;
        for (Product p : products) {
            System.out.println(p);
            if (p.isSpecial()) special++;
        }
        System.out.println("Итого: " + getTotalPrice());
        System.out.println("Специальных товаров: " + special);
    }
    public List<Product> removeProductByName(String name) {
        List<Product> removed = new LinkedList<>();
        Iterator<Product> it = products.iterator();
        while (it.hasNext()) {
            Product p = it.next();
            if (p.getName().equals(name)) { removed.add(p); it.remove(); }
        }
        return removed;
    }
}
