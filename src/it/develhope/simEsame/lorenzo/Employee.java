package it.develhope.simEsame.lorenzo;

public abstract class Employee {
    private int id;
    private String name;
    private float efficiencyIndex;

    public int getId() { return id; }

    public String getName() { return name; }

    public float getEfficiencyIndex() { return efficiencyIndex; }

    public Employee(int id, String name, float efficiencyIndex) {
        this.id = id;
        this.name = name;
        this.efficiencyIndex = efficiencyIndex;
    }

    public void setEfficiencyIndex(float efficiencyIndex) {
        this.efficiencyIndex = efficiencyIndex;
    }

    public abstract boolean canApplyForPromotion();

    public abstract boolean mayBeDemoted();



}
