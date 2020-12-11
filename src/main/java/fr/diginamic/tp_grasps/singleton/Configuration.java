package fr.diginamic.tp_grasps.singleton;

import java.util.ResourceBundle;

public class Configuration {
    public static Configuration instance = new Configuration();
    private final ResourceBundle resourceBundle = ResourceBundle.getBundle("configuration");

    public ResourceBundle getResourceBundle() {
        return resourceBundle;
    }

    private Configuration() {
    }

    public static Configuration getInstance() {
        return instance;
    }
}
