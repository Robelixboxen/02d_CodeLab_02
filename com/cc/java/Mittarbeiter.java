package com.cc.java;

public class Mittarbeiter {
    
    private String name;
    private String vorname;
    private String funktion;
    private int eintrittsjahr;

    // Klasse instanziieren => ist das richtig?
        
    public Mittarbeiter(String name, String vorname, String funktion, int eintrittsjahr) {
        this.name = name;
        this.vorname = vorname;
        this.funktion = funktion;
        this.eintrittsjahr = eintrittsjahr;
    } 

    // getter...

        public String getName() {
            return name;
        }

        public String getVorname() {
            return vorname;
        }

        public String getFunktion() {
            return funktion;
        }

        public int getEintrittsjahr() {
            return eintrittsjahr;
        }
}    

