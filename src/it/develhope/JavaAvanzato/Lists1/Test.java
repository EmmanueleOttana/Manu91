package it.develhope.JavaAvanzato.Lists1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        final List <String> cityNames = Arrays.asList("Roma","Berlino","Londra");

        //cityNames.add("Londra");--> Non avendo dichiarato "cityNames" come un "new ArrayList<>()" non vi è possibile modificare la lunghezza della lista.
        cityNames.set(1,"Tegucigalpa");

        System.out.println(cityNames.toString());

        List <String> kingsOfRome = new ArrayList<>(Arrays.asList("Romolo","Numa Pompilio","Tullo Ostilio",
                "Anco Marco","Tarquinio Prisco","Servio Tullio","Tarquinio il Superbo"));

        System.out.println(kingsOfRome.toString());

        String[] kingsOfRomeArray = new String[kingsOfRome.size()];

        for (int i = 0 ; i < kingsOfRomeArray.length; i++) {
            if (i == kingsOfRomeArray.length-1)  {
                kingsOfRomeArray[i] = "Tarquinius Supercar";
            } else {
                kingsOfRomeArray[i] = kingsOfRome.get(i);
            }
        }

        System.out.println(Arrays.toString(kingsOfRomeArray));

    }

}
