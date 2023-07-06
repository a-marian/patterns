package ar.com.patterns.creational.categories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        RootCategory rootCategory = new RootCategory();
        rootCategory.createCategory(1, "Furniture", Arrays.asList("furniture", "table"), 1, 0);
        rootCategory.createCategory(2, "Electronics", Arrays.asList("electric", "light"), 1, 0);
        rootCategory.createCategory(3, "Home Appliances", Arrays.asList("appliances", "home"), 1, 0);
        rootCategory.createCategory(4, "Major Appliances", Arrays.asList("appliances", "major"), 2, 3);
        rootCategory.createCategory(5, "Minor Appliances", new ArrayList<>(), 2, 3);

        //rootCategory.getCategory(2);
        List<String> keywords1 = RootCategory.getKeywordsFromCategory(4);
        keywords1.forEach(System.out::println);

        List<String> keywords2 = RootCategory.getKeywordsFromCategory(5);
        keywords2.forEach(System.out::println);
    }
}
