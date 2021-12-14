package pl.poznan.put.cs.ai.drools.family;

import java.util.HashSet;
import java.util.Set;

public class Osoba {
    public String imie;
    public Plec plec;
    public Set<Relacja> relacje;

    public Osoba(String imie) {
        this.imie = imie;
        this.plec = Plec.NIEZNANA;
        this.relacje = new HashSet<Relacja>();
    }

    public void addRelacja(Relacja relacja) {
        relacje.add(relacja);
    }

    public String toString() {
        return imie;
    }
}
