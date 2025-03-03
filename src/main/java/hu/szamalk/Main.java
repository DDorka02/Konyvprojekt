package hu.szamalk;


import hu.szamalk.modell.Konyv2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        egykony();
        tobbkony();
        listazas();

    }

    private static void listazas() {
        ArrayList<Konyv2> konyvek = new ArrayList<>();
        konyvek.add(new Konyv2(" Potter", "JK Rolling",2002));
        konyvek.add(new Konyv2("tter", "JK Rolling",2002));
        konyvek.add(new Konyv2("otter", "JK Rolling",2002));
        konyvek.add(new Konyv2("ter", "JK Rolling",2002));
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("listazas.txt"))){
            oss.writeObject(konyvek);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void tobbkony() {
        Konyv2 konyv1 = new Konyv2("Harry Potter", "JK Rolling",2002);
        Konyv2 konyv2 = new Konyv2("Harry ", "JK Rolling",2012);
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("tobbkonyv.txt"))){
            oss.writeObject(konyv1);
            oss.writeObject(konyv2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void egykony() {
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("konyv.txt"))){
            oss.writeObject(new Konyv2("Harry Potter", "JK Rolling",2002));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}