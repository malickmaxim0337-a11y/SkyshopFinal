package org.skypro.skyshop.search;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SearchEngine {
    private final List<Searchable> searchables = new LinkedList<>();

    public void add(Searchable item) {
        searchables.add(item);
    }

    public Map<String, Searchable> search(String query) {
        Map<String, Searchable> results = new TreeMap<>();
        for (Searchable item : searchables) {
            if (item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                results.put(item.getName(), item);
            }
        }
        return results;
    }
}
