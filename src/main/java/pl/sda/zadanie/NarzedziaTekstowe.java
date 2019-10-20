package pl.sda.zadanie;

import java.util.ArrayList;
import java.util.List;

public class NarzedziaTekstowe {
    public static String zamienNaDuzeZnaki(String tekst){
        return tekst.toUpperCase();
    }

    public static String odwrocString(String tekst){
        for (int i = 0; i < tekst.length(); i++) {
            tekst.replace(tekst.charAt(i), tekst.charAt(tekst.length()-i));
            }
        return tekst;
    }

    public static String zwielokrotnijString(String tekst, int i){
        String tekstKoncowy = "";
        for (int j = 0; j < i; j++) {
            tekstKoncowy += tekst + " ";
        }
        return tekstKoncowy;
    }

//    public static String usunWielkieLitery(String tekst){
//        String[] lista = new String[24];
//        for (String i = "A"; i < "Z"; i++) {
//
//        }
//        return tekst.replaceAll();
//    }

}
