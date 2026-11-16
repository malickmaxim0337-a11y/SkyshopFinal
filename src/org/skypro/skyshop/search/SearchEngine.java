package org.skypro.skyshop.search;

import java.util.LinkedList;
import java.util.List;

public class SearchEngine {
    private final List<Searchable> searchables = new LinkedList<>();
    public void add(Searchable item) { searchables.add(item); }
    public List<Searchable> search(String query) {
        List<Searchable> results = new LinkedList<>();
        for (Searchable item : searchables) {
            if (item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) results.add(item);
        }
        return results;
    }
}
