package ar.com.patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Add clone() method to the hierarchy of our objects
 * Design a registry that maintains a cache of prototypical objects
 * Design API that allows to clone object inside the factory and return new object as result.
 * User factory API instead of NEW keyword to instantiate the objects
 * */
public class ArchiverFactory {

    private static Map<String, Archiver> prototypes = new HashMap<>();

    static {
        prototypes.put("zip", new ZipArchiver());
        prototypes.put("rar", new RarArchiver());
    }

    public static Archiver getPrototypeForType(String archiverType){
        return prototypes.get(archiverType).clone();
    }
}
