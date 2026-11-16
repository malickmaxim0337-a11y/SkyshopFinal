package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public abstract class Product implements Searchable {
    private final String name;
    public Product(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Пустое имя");
        this.name = name;
    }
    @Override
    public String getName() { return name; }
    @Override
    public String getSearchTerm() { return name; }
    @Override
    public String getContentType() { return "PRODUCT"; }
    public abstract int getPrice();
    public abstract boolean isSpecial();
}
