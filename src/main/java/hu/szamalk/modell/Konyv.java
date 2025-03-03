package hu.szamalk.modell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class Konyv implements Serializable {

    private String cim;
    private ArrayList<String> szerzok;
    private int kiadEv;
    private transient UUID id;

    public Konyv(String cim, ArrayList<String> szerzok, int kiadEv) {
        this.cim = cim;
        this.szerzok = szerzok;
        this.kiadEv = kiadEv;
    }

    @Override
    public String toString() {
        return "Konyv{" +
                "cim='" + cim + '\'' +
                ", szerzo='" + szerzok + '\'' +
                ", kiadEv=" + kiadEv +
                '}';
    }
}
