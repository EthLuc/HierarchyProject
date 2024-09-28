public abstract class Domain {
    private String className;
    private String orderName;
    private String familyName;
    private String genusName;
    private String organismName;
    private String speciesName;
    private boolean isExtinct;

    public Domain(String className, String orderName, String familyName, String genusName, String speciesName, String organismName, boolean isExtinct)
    {
        this.className = className;
        this.orderName = orderName;
        this.familyName = familyName;
        this.genusName = genusName;
        this.organismName = organismName;
        this.isExtinct = isExtinct;
    }

    public String getClassName()
    {
        return className;
    }
    public void setClassName(String className)
    {
        this.className = className;
    }
    public String getOrderName()
    {
        return orderName;
    }
    public void setOrderName(String orderName)
    {
        this.orderName = orderName;
    }
    public String getFamilyName()
    {
        return familyName;
    }
    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }
    public String getGenusName()
    {
        return genusName;
    }
    public void setGenusName(String genusName)
    {
        this.genusName = genusName;
    }
    public String getSpeciesName()
    {
        return speciesName;
    }
    public void getSpeciesName(String speciesName)
    {
        this.speciesName = speciesName;
    }
    public String getOrganismName()
    {
        return organismName;
    }
    public void setOrganismName(String organismName)
    {
        this.organismName = organismName;
    }
    public Boolean isExtinct()
    {
        return isExtinct;
    }
    public void setExtinct(Boolean extinct)
    {
        this.isExtinct = extinct;
    }
    public abstract String toString();
}

