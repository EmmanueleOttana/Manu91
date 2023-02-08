package it.develhope.simEsame.lorenzo;

public class Head extends Employee{

    int yearsAsHead;

    public Head(int id, String name, float efficiencyIndex) {
        super(id, name, efficiencyIndex);
    }

    @Override
    public boolean canApplyForPromotion() {
        return false;
    }

    @Override
    public boolean mayBeDemoted() {
        if (yearsAsHead < 10 && getEfficiencyIndex() < 0.5 ){
            return true;
        }else return false;
    }

    public Head(int id, String name, float efficiencyIndex, int yearsAsHead) {
        super(id, name, efficiencyIndex);
        this.yearsAsHead = yearsAsHead;
    }

    public void setYearsAsHead(int yearsAsHead) {
        this.yearsAsHead = yearsAsHead;
    }

}
