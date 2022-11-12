package sansliKullanicilaribulanprogram;

import java.util.List;

public class SansliKullanicilar {
    public static void yazdir(List<String> liste) {
        System.out.println("Kazanan isimler ve saniyeleri: ");
        for (String w : liste) {
            Integer saniyemiz = Integer.valueOf(w.replaceAll("[^0-9]", ""));
            if(saniyemiz < 10) {
                System.out.println(w);
            }
        }
    }

}
