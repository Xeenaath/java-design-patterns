package fr.diginamic.tp_grasps.builder;

import fr.diginamic.tp_grasps.beans.Animal;
import fr.diginamic.tp_grasps.beans.Zoo;
import fr.diginamic.tp_grasps.exception.ZoneException;
import junit.framework.TestCase;
import org.junit.Test;

public class ZooBuilderTest extends TestCase {
    @Test
    public void testAppendZone() {
        ZooBuilder zooBuilder = new ZooBuilder("Le zoo de la joie");
        Zoo zoo = zooBuilder.appendZone("Savane", 2).getZoo();

        assertEquals(1, zoo.getZones().size());
        assertEquals("Le zoo de la joie", zoo.getNom());
        assertEquals("Savane", zoo.getZones().get(0).getNom());
    }

    @Test
    public void testAppendAnimal() throws ZoneException {
        ZooBuilder zooBuilder = new ZooBuilder("Le zoo de la tristesse");
        Zoo zoo = zooBuilder.appendZone("Savane", 2)
                .appendAnimal("Savane", new Animal("Alex le lion"))
                .appendAnimal("Savane", new Animal("Marty le zèbre"))
                .getZoo();
        assertEquals(1, zoo.getZones().size());
        assertEquals(2, zoo.getZones().get(0).getAnimaux().size());
        assertEquals("Alex le lion", zoo.getZones().get(0).getAnimaux().get(0).getNom());
    }
}