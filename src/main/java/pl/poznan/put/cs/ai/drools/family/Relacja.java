package pl.poznan.put.cs.ai.drools.family;

import java.util.Arrays;

public class Relacja {

    public Osoba[] osoby = new Osoba[2];
    public String relacja;

    public Relacja(Osoba o1, Osoba o2, String relacja) {
        this.osoby[0] = o1;
        this.osoby[1] = o2;
        this.relacja = relacja;
        this.osoby[0].addRelacja(this);
        this.osoby[1].addRelacja(this);
        System.out.println("Adding new " + relacja + ": " + this);
    }

    @Override
    public String toString() {
        return "Relacja{" +
                "osoby=" + Arrays.toString(osoby) +
                ", relacja='" + relacja + '\'' +
                '}';
    }
}