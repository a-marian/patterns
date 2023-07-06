package ar.com.patterns.creational.categories;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RootCategory {
    private static List<Category> categories = new ArrayList<>();

    public static List<Category> getCategories() {
        return categories;
    }

   static {
      Category root =  new Category(0,"Root", Arrays.asList("root"), 0);
      categories.add(root);
   }

    public static List<String> getKeywordsFromCategory(int id) {
       Category category = categories.stream().filter(cat -> cat.getId() == id).collect(toSingleton());
        List<String> keywords = category.getKeywords();
        if(keywords.isEmpty()){
            keywords = category.getParent().getKeywords();
        }
        return  keywords;
    }


    public Category getCategory(int identificator) {
        return getCategories().stream()
                .filter(cat-> cat.getId() == identificator).collect(toSingleton());
    }

    public static void findCategoryByKeyword(String light) {
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


    public void createCategory(int id, String name, List<String> keywords, int level, int parent){
        Category parentCategory = getCategory(parent);
        Category category = new Category(id, name, keywords, level, parentCategory );
        categories.add(category);
    }

    public static <T>Collector<T,?,T> toSingleton(){
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> { if(list.size() != 1){
                    throw new IllegalStateException();
                }
                return list.get(0);
                }
        );
    }








}
