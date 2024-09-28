public class Plantae extends Domain {

    private String division;

    public Plantae(String className, String orderName, String familyName, String genusName, String speciesName, String organismName, boolean isExtinct, String division)
    {
        super(className, orderName, familyName, genusName, speciesName, organismName, isExtinct);
        this.division = division;
    }
    public String getDivision()
    {
        return division;
    }
    public void setDivision(String division)
    {
        this.division = division;
    }
    public String toString()
    {
        return "Organism: " + getOrganismName() +
               "\nClass: " + getClassName() +
               "\nOrder: " + getOrderName() +
               "\nFamily: " + getFamilyName() +
               "\nGenus: " + getGenusName() +
               "\nSpecies: " + getSpeciesName() +
               "\nDivision: " + division +
               "\nExtinct: " + (isExtinct() ? "Yes" : "No");
    }
}
