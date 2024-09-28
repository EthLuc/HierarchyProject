public class Animalia extends Domain {
    private String phylum;

    public Animalia(String className, String orderName, String familyName, String genusName, String speciesName, String organismName, boolean isExtinct, String phylum)
    {
        super(className, orderName, familyName, genusName, speciesName, organismName, isExtinct);
        this.phylum = phylum;
    }

    public String getPhylum()
    {
        return phylum;
    }
    public void setPhylum(String phylum)
    {
        this.phylum = phylum;
    }

    public String toString() {
        return "Organism: " + getOrganismName() +
               "\nClass: " + getClassName() +
               "\nOrder: " + getOrderName() +
               "\nFamily: " + getFamilyName() +
               "\nGenus: " + getGenusName() +
               "\nSpecies: " + getSpeciesName() +
               "\nPhylum: " + phylum +
               "\nExtinct: " + (isExtinct() ? "Yes" : "No");
    }
}
