package it.develhope.simEsame.lorenzo;

public class Workman extends Employee{

    int weeklyWorkingHours;

    public Workman(int id, String name, float efficiencyIndex) {
        super(id, name, efficiencyIndex);
    }

    @Override
    public boolean canApplyForPromotion() {
        if (weeklyWorkingHours > 35 && getEfficiencyIndex() > 0.65){
            return true;
        }else return false;
    }

    @Override
    public boolean mayBeDemoted() {
        return false;
    }

    public void setWeeklyWorkingHours(int weeklyWorkingHours) {
        this.weeklyWorkingHours = weeklyWorkingHours;
    }

    public Workman(int id, String name, float efficiencyIndex, int weeklyWorkingHours) {
        super(id, name, efficiencyIndex);
        this.weeklyWorkingHours = weeklyWorkingHours;
    }
}
