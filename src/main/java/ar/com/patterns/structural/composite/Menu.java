package ar.com.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private String name;
    private String description;

    List<MenuComponent> menuComponents = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void print() {
        super.print();
        System.out.print("\n" + getName());
        System.out.println(": " + getDescription());
        System.out.println("------------");

        menuComponents.forEach(MenuComponent::print);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
