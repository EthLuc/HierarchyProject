public class Aardvark extends Animalia implements ConsumeAnt {
    
    private String habitat;

    public Aardvark(String className, String orderName, String familyName, String genusName, String speciesName, String organismName, boolean isExtinct, String phylum, String habitat) {
        super(className, orderName, familyName, genusName, speciesName, organismName, isExtinct, phylum);
        this.habitat = habitat;
    }
    public String getHabitat()
    {
        return habitat;
    }
    public void setHabitat(String habitat)
    {
        this.habitat = habitat;
    }
    public void consumeAnt() {
        System.out.println("Aardvark consumes an ant!");
    }
    public String toString() {
        return super.toString() + ", Habitat: " + habitat;
    }
}
