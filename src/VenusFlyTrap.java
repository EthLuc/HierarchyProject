public class VenusFlyTrap extends Plantae implements ConsumeAnt{
    
    private double trapSize;

    public VenusFlyTrap(String className, String orderName, String familyName, String genusName, String speciesName, String organismName, boolean isExtinct, String division, double trapSize) {
        super(className, orderName, familyName, genusName, speciesName, organismName, isExtinct, division);
        this.trapSize = trapSize;
    }
    public double getTrapSize()
    {
        return trapSize;
    }
    public void setTrapSize(double trapSize)
    {
        this.trapSize = trapSize;
    }
    public void consumeAnt()
    {
        System.out.println("Venus Fly Trap eats an ant");
    }
    public String toString()
    {
        return super.toString() + ", Trap Size:" + trapSize;
    }
}
