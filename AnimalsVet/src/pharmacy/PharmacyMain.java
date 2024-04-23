package pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component pinicillin = new Component("Penicillin", "34mg", 5);
        Component salt = new Component("Salt", "13mg", 2);
        Component iod = new Component("Iod", "100mg", 19);

        Component iod1 = new Component("Iod1", "100mg", 19);
        Component iod2 = new Component("Iod2", "100mg", 19);
        Component iod3 = new Component("Iod3", "98mg", 19);
        Component iod4 = new Component("Iod4", "30mg", 191);
        Component iod5 = new Component("Iod2", "590mg", 19);

//        Pharmacy pharmacy1 = new Pharmacy();
////        Pharmacy pharmacy2 = new Pharmacy();//
//        pharmacy1.addComponents(salt, pinicillin);
//        pharmacy2.addComponents(iod, pinicillin);
//        Iterator<Component> iterator1 = pharmacy1;
//        while (iterator1.hasNext()) {
//        System.out.print(iterator1.next());
//            System.out.print(iterator1.next());
//
//        Iterator<Component> iterator2 = pharmacy2;
//        while (iterator2.hasNext()) {
//        System.out.print(iterator2.next());
//        }
//        IterablePharmacy pharmacy2 = new IterablePharmacy();
//        pharmacy2.addComponents(iod, pinicillin);
//
//        for(Component comp : pharmacy2){
//            System.out.print(comp);

//            List<Component> list1 = new ArrayList<>();
//            list1.add(salt);
//            list1.add(iod);
//            list1.add(pinicillin);
//            Collections.sort(list1);
//            System.out.print(list1);
        IterablePharmacy seo = new IterablePharmacy("giga");
        seo.addComponents(iod, iod1, iod2);
        //for (Component comp : seo) {
        //System.out.print(comp);

        IterablePharmacy seo4 = new IterablePharmacy("Fate");
        seo4.addComponents(iod, iod1, iod2);
        IterablePharmacy seo78 = new IterablePharmacy("Life");
        seo78.addComponents(iod, iod3, iod2);
        IterablePharmacy seo12 = new IterablePharmacy("Dream");
        seo12.addComponents(iod, salt, iod2);
        IterablePharmacy seo122 = new IterablePharmacy("Hope");
        seo122.addComponents(iod, salt, iod2);
        IterablePharmacy seo48 = new IterablePharmacy("Health");

        HashSet<IterablePharmacy> placebo = new HashSet<>();
        placebo.add(seo);
        placebo.add(seo4);
        placebo.add(seo12);
        placebo.add(seo78);
        placebo.add(seo48);
        placebo.add(seo122);

        System.out.println("Наши уникальные лекарcтва: ");
        for (IterablePharmacy farms : placebo)
            System.out.println(farms.getName());

        System.out.print("Размер нашего набора уникальных лекарств:  " + placebo.size() + "\n");
        System.out.print("                                  \n");


        List<Pharmacy> chemistry = new ArrayList<>();

        Pharmacy see = new Pharmacy("Night");
        see.addComponents(iod, salt, iod2, iod3);
        Pharmacy soo = new Pharmacy("Day");
        soo.addComponents(pinicillin, salt, iod5);
        Pharmacy suu = new Pharmacy("Morning");
        suu.addComponents(pinicillin, salt, iod, iod);

        chemistry.add(suu);
        chemistry.add(see);
        chemistry.add(soo);
        chemistry.sort(Pharmacy::compareTo);
        System.out.print("Вес Night - " + see.calcWeight() + "\n" + "Вес Day - "
                + soo.calcWeight() + "\n" + "Вес Morning - " + suu.calcWeight() + "\n");
        System.out.print("Теперь наши лекарства расположены в порядке убывания суммарного веса компонентов:  ");
        for (Pharmacy che : chemistry) {
            System.out.print(che.getName() + "  ");
        }


//        System.out.print(placebo.size());
//        Pharmacy seo90 = new Pharmacy();

//        int weight = Integer.parseInt(iod.getWeight().replaceAll("[^0-9]", ""));
//        System.out.print(iod.getWeight() + weight);

    }
}



