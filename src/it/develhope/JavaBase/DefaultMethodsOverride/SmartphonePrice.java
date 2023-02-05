package it.develhope.JavaBase.DefaultMethodsOverride;

import java.util.Objects;

public class SmartphonePrice implements Cloneable{
    String priceType;
    double priceInEuros;

    @Override
    public Object clone() throws CloneNotSupportedException {
        SmartphonePrice smartphonePrice = (SmartphonePrice)super.clone();
        return smartphonePrice;
    }
    public SmartphonePrice(String priceType, double priceInEuros){
        this.priceType=priceType;
        this.priceInEuros=priceInEuros;
    }
    @Override
    public String toString() {
        return  "priceType='" + priceType + '\'' +
                ", priceInEuros=" + priceInEuros +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartphonePrice that = (SmartphonePrice) o;
        return Double.compare(that.priceInEuros, priceInEuros) == 0
                && Objects.equals(priceType, that.priceType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(priceType, priceInEuros);
    }
}
