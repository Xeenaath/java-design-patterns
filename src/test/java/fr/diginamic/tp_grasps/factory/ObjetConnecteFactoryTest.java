package fr.diginamic.tp_grasps.factory;

import fr.diginamic.tp_grasps.beans.ObjetConnecte;
import fr.diginamic.tp_grasps.beans.TelephonePortable;
import fr.diginamic.tp_grasps.beans.TypeObjetConnecte;
import junit.framework.TestCase;
import org.junit.Test;

public class ObjetConnecteFactoryTest extends TestCase {

    @Test
    public void testGetInstance() {
        ObjetConnecte conn = ObjetConnecteFactory.getInstance(TypeObjetConnecte.TELEPHONE, 10);
        assertEquals(TelephonePortable.class, conn.getClass());
        assertEquals(10, conn.getLimiteVolts());
    }

}