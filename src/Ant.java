public class Ant extends Animalia {

    private String casteMembership;
    
    public Ant(String className, String orderName, String familyName, String genusName, String speciesName, String organismName, boolean isExtinct, String phylum, String casteMembership) {
        super(className, orderName, familyName, genusName, speciesName, organismName, isExtinct, phylum);
        this.casteMembership = casteMembership;
    }
    public String getCasteMembership()
    {
        return casteMembership;
    }
    public void setCasteMembership(String casteMembership)
    {
        this.casteMembership = casteMembership;
    }
    public String toString() {
        return super.toString() + ", Caste Membership: " + casteMembership;
    }
}
