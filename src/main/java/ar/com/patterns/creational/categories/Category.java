package ar.com.patterns.creational.categories;

import java.util.ArrayList;
import java.util.List;

public class Category extends RootCategory {

    private int id=0;
    private List<String> keywords = new ArrayList<>();
    private int level;

    private String name;

    private Category parent;


    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    public Category(int id, String name, List<String> keywords, int level ){
        this.id = id;
        this.keywords = keywords;
        this.name = name;
        this.level = level;
    }


    public Category(int id, String name, List<String> keywords, int level, Category parent ){
        this.id = id;
        this.keywords = keywords;
        this.name = name;
        this.level = level;
        this.parent = parent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Category getParent(int parentId){
        Category parent= null;
        for (int i = 0; i < getCategories().size() ; i++) {
            if (parentId == getCategories().get(i).getId()){
                parent = getCategories().get(i);
            }
        }
        return parent;
    }

    @Override
    public String toString() {
        return  "Category "+ name +
                "keywords "+ getKeywords() +
                "level " + level;
    }
}
