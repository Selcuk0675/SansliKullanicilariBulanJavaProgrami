package sansliKullanicilaribulanprogram;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kayit extends SansliKullanicilar {
    static Scanner scan = new Scanner(System.in);
    static List<String> list = new ArrayList<String>();

    public static List kayit(){
        while (true) {
            System.out.println("Adinizi giriniz");
            String ad = scan.next();
            System.out.println("Adinizi eklemek icin 'E' tusuna basiniz. Eklemek istemiyorsaniz herhangi bir tusa basabilirsiniz.");
            char yanit = scan.next().toLowerCase().charAt(0);

            if(yanit == 'e') {
                LocalTime sn = LocalTime.now();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss");
                String saniye = dtf.format(sn);
                list.add("Isim: " + ad + " | Saniye: " + saniye);
            }else {
                break;
            }
        }
        return list;
    }

}
