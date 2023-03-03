package Esercizio03_03_2023;

import java.util.ArrayList;
import java.util.Collection;

public class Database extends Start {
    public static void main(String[] args) {

        User davide = new User("Davide","Di Franco","SaffaniBaddoni@outlook.it","Via del non lo so 32/z");
        User alessandra = new User("Alessandra","Di Franco","SaffaniBidoni@gmail.com","Via del non lo so 33/z");
        User martina = new User("Martina", "Di Franco","SaffaniBeduini@libero.it","Via dei comunisti 13");
        User antonia = new User("Antonia", "Abate","AAccitua@hotlook.it","Via del non lo so 30/a");
        User eugenio = new User("Eugenio", "Di Franco","SaffaniBoh@gmail.com","Via del non lo so 33/b");

        Collection collection = new ArrayList();
        collection.add(davide);
        collection.add(alessandra);
        collection.add(martina);
        collection.add(antonia);
        collection.add(eugenio);


    }

}
