package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Location {
    private  final int locationId;
    private final String aciklama;
    private final Map<String,Integer> cıkıslar;

    public Location(int locationId, String aciklama,Map<String,Integer> yönler) {
        this.locationId = locationId;
        this.aciklama = aciklama;
        if(yönler!= null){
            this.cıkıslar =new HashMap<>(yönler);
        }else {
            this.cıkıslar = new HashMap<>();
        }

        this.cıkıslar.put("Q",-1);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getAciklama() {
        return aciklama;
    }

    public Map<String, Integer> getCıkıslar() {
        return cıkıslar;
    }

    public void addCıkıs(String direction, int location){
        this.cıkıslar.put(direction,location);
    }
}
