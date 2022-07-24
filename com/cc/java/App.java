package com.cc.java;

public class App {

        public static void main(String[] args) {
        
            System.out.println(String.getInfo(kontoNr, feld));
            // output(getInfo());
     
    }

    public int kontoNr = 0;     // Auswahl des Kontos
    public int feld = 0;        // darüber wird ausgewählt welche Felder zuückgegeben wereden sollen...
    
    // hier muss die zweiteilig Auswahl erfolgen 1) welches Konto 2) welches Feld
    // Diese Lösung ist Spagetticode = SCHEISSE
    // das muss anders gehen!

    

   Mittarbeiter mittarbeiter1 = new Mittarbeiter("Müller", "Max", "Chef", 1980);

   Mittarbeiter mittarbeiter2 = new Mittarbeiter("Maier", "Eva", "Sekritärin", 1982);

   Mittarbeiter mittarbeiter3 = new Mittarbeiter("Huber", "Josef", "Lagerist", 1985);

   public String getInfo(){

        switch (kontoNr) {
            case 1:
                switch (feld) {
                    case 1:
                        return mittarbeiter1.getName();
                    case 2:
                        return mittarbeiter1.getVorname();            
                    case 3:
                        return mittarbeiter1.getFunktion();            
                    case 4:
                        return String.valueOf(mittarbeiter1.getEintrittsjahr());     // typecast von int zu string   
                    default:
                        return "ERROR!";}

            case 2:
                switch (feld) {
                    case 1:
                        return mittarbeiter2.getName();
                    case 2:
                        return mittarbeiter2.getVorname();            
                    case 3:
                        return mittarbeiter2.getFunktion();            
                    case 4:
                        return String.valueOf(mittarbeiter2.getEintrittsjahr());     // typecast von int zu string   
                    default:
                        return "ERROR!";}
            
            case 3:

                switch (feld) {
                    case 1:
                        return mittarbeiter3.getName();
                    case 2:
                        return mittarbeiter3.getVorname();            
                    case 3:
                        return mittarbeiter3.getFunktion();            
                    case 4:
                        return String.valueOf(mittarbeiter3.getEintrittsjahr());     // typecast von int zu string   
                    default:
                        return "ERROR!";}
                                    
            default:
                return "ERROR!";}
        }

            

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

