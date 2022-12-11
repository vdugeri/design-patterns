package com.danverem.registry;

import java.util.HashMap;
import java.util.Map;

// The registry class
public class Registry {
    // The single instance of the registry
    private static final Registry INSTANCE = new Registry();

    // A map to store the registered objects
    private final Map<String, Object> objects = new HashMap<>();

    // Private constructor to prevent other instances from being created
    private Registry() {
    }

    // Method to get the single instance of the registry
    public static Registry getInstance() {
        return INSTANCE;
    }

    // Method to register an object with the registry
    public void registerObject(String key, Object object) {
        objects.put(key, object);
    }

    // Method to retrieve an object from the registry
    public Object getObject(String key) {
        return objects.get(key);
    }
}


