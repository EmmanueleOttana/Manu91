package it.develhope.javaAvanzato.wildcards2;

import java.util.Objects;

public class GenericsClass <T> {

    private T t;

    public T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenericsClass<?> that = (GenericsClass<?>) o;
        return Objects.equals(t, that.t);
    }
    public static boolean isEquals(GenericsClass sol1, GenericsClass gc2) {
        return sol1.equals(gc2);
    }

}