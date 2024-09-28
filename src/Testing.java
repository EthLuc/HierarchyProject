import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;

public class Testing {
    
    @Test
    public void testVenusFlyTrap() {
        VenusFlyTrap vft = new VenusFlyTrap("Magnoliopsida", "Caryophyllales", "Droseraceae", "Dionaea", "Dionaea muscipula", "Venus Fly Trap", false, "Anthophyta", 1.5);
        assertEquals("Venus Fly Trap", vft.getOrganismName());
        vft.consumeAnt();
    }

    @Test
    public void testAnt() {
        Ant ant = new Ant("Insecta", "Hymenoptera", "Formicidae", "Formica", "Formica rufa", "Wood Ant", false, "Arthropoda", "Worker");
        assertEquals("Wood Ant", ant.getOrganismName());
        assertEquals("Worker", ant.getCasteMembership());
    }
    
    @Test
    public void testAardvark() {
        Aardvark Aardvark = new Aardvark("Mammalia", "Tubildentata", "Orycteropodidae", "Orycteropus", "Orycteropus afer", "Aardvark", false, "Chordate", "Grassland");
        assertEquals("Aardvark", Aardvark.getOrganismName());
        assertEquals("Grassland", Aardvark.getHabitat());
        Aardvark.consumeAnt();
    }
}
