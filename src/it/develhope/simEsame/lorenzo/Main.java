package it.develhope.simEsame.lorenzo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Workman man1 = new Workman(0, "Mario Gialli", 0.5f, 20);
        Workman man2 = new Workman(5, "Gianni Fannulloni", 0.2f, 30);
        Workman man3 = new Workman(17, "Giorgia Lavoroni", 0.85f, 40);

        List <Workman> workman = new ArrayList<>(Arrays.asList( man1, man2, man3 ));

        Head head1 = new Head(3, "Alessio Antichi", 0.55f, 20);
        Head head2 = new Head(1, "Marianna Figlidelcapo", 0.3f, 2);
        Head head3 = new Head(9, "Gianluigi Figlidelcapo", 0.3f, 4);

        List <Head> head = new ArrayList<>(Arrays.asList( head1, head2, head3 ));

        for (Workman value : workman) {
            System.out.println(value.getName()+" could he be promoted? "+ value.canApplyForPromotion());
        }
        for (Head value : head) {
            System.out.println(value.getName()+" could it be downgraded? "+ value.mayBeDemoted());
        }

        List <List<?>> Employee = new ArrayList<>(Arrays.asList(workman,head));

        for (Workman value : workman ) {
            System.out.println(value.getName() +" "+ value.getEfficiencyIndex());
        }
        for (Head value : head ){
            System.out.println(value.getName() +" "+ value.getEfficiencyIndex());
        }
        for (Workman value : workman ){
            System.out.println(value.getName().replaceAll("[A-Z]",""));
        }
        for (Head value : head ){
            System.out.println(value.getName().replaceAll("[A-Z]",""));
        }
        for ( Workman value : workman ){
            System.out.println(value.getName() +" "+ String.valueOf(value.getEfficiencyIndex()).replaceAll("\\.",",").replaceAll("[0-9]","?"));
        }
        for ( Head value : head ){
            System.out.println(value.getName() +" "+ String.valueOf(value.getEfficiencyIndex()).replaceAll("\\.",",").replaceAll("[0-9]","?"));
        }
    }
}