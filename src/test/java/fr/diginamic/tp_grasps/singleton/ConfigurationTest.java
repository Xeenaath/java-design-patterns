package fr.diginamic.tp_grasps.singleton;

import junit.framework.TestCase;
import org.junit.Test;

public class ConfigurationTest extends TestCase {

    @Test
    public void testGetInstance() {
        Configuration configuration = Configuration.getInstance();
        assertEquals("root", configuration.getResourceBundle().getString("db.user"));
    }


}