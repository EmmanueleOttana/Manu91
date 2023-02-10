import java.awt.*;

public class Main {

    String[] allTypePrimitive = {"byte", "short", "int", "long", "double", "float", "char", "boolean"};

    public static void getMultiplicationTable() {
        for (int i = 0; i < 12; i++) {
            System.out.println(12 - i);
        }
    }
    public static void main(String[] args) {

        //System.out.println(((Object)Math.round(Math.random() * 11+1)).getClass().getSimpleName());
        getMultiplicationTable();
    }
}