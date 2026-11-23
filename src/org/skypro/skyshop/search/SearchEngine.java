package org.skypro.skyshop.search;

import java.util.*;

public class SearchEngine {

    private final Set<Searchable> searchables = new HashSet<>();

    public void add(Searchable item) {
        searchables.add(item);
    }

    public Set<Searchable> search(String query) {
        Set<Searchable> results = new TreeSet<>((o1, o2) -> {
            int lengthCompare = Integer.compare(o2.getName().length(), o1.getName().length());
            if (lengthCompare == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return lengthCompare;
        });

        for (Searchable item : searchables) {
            if (item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }
}
