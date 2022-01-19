package com.company;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> maps = new HashMap<>();
        maps.put("GUNEY",2);
        maps.put("KUZEY",1);
        maps.put("BATI",4);
        maps.put("DOGU",3);
        locations.put(0,new Location(1,"Java öğreniyorum Şuan merkezdesiniz.",maps));

        maps = new HashMap<>();
        maps.put("GUNEY",0);
        locations.put(1,new Location(1,"Şuan ormandasınız.",maps));

        maps = new HashMap<>();
        maps.put("KUZEY",0);
        maps.put("BATI",4);
        locations.put(2,new Location(2,"Şuan çöldesiniz.",maps));

        maps = new HashMap<>();
        maps.put("BATI",0);
        locations.put(3,new Location(3,"Şuan şehirdesiniz.",maps));

        maps = new HashMap<>();
        maps.put("GUNEY",2);
        maps.put("KUZEY",1);
        maps.put("DOGU",0);
        locations.put(4,new Location(4,"Şuan Köydesiniz.",maps));

        Map<String,String > kelimeler = new HashMap<>();
        kelimeler.put("QUIT","Q");
        kelimeler.put("KUZEY","K");
        kelimeler.put("GUNEY","G");
        kelimeler.put("DOGU","D");
        kelimeler.put("BATI","B");

        int loc=0;
        while (true){
            System.out.println(locations.get(loc).getAciklama());
            if (loc==-1){
                break;
            }
            Map<String,Integer> exits = locations.get(loc).getCıkıslar();
            System.out.println("ÇIKIŞLAR");
            for (String s : exits.keySet()) {
                System.out.print(s+"  ");
            }
            System.out.println();

            String yön = scanner.nextLine().toUpperCase();
            if (yön.length()>1){
                if (exits.containsKey(yön)){
                    loc = exits.get(yön);
                }else {
                    System.out.println("yön bulunamadı.");
                }
            }

        }



    }
}
