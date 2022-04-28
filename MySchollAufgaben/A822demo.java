package com.company;

public class A822demo {
    public static void main(String[] args) {
        int[][] lager = {{4711, 3, +60},
                {4711, 3, -10},
                {4711, 3, -30},
                {4711, 3, +30},

                {4711, 5, -20},
                {4711, 5, -10},
                {4711, 5, +40},

                {4711, 7, -20},
                {4711, 7, +40},
                {4711, 7, -60},
                {4711, 7, +50},
                {4711, 7, -10},    // 60

                {4712, 3, +70},
                {4712, 3, -10},

                {4712, 4, -30},
                {4712, 4, -10},
                {4712, 4, +40},
                {4712, 4, -50},

                {4712, 6, -10},    // 0

                {4713, 2, +30},
                {4713, 2, +20},

                {4713, 5, -20},
                {4713, 5, +40},
                {4713, 5, -30}}; // 40

        //-------------------------------------------------------
        // Hier folgt der Code zur Loesung der Aufgabe:
        int bisherigerMonat = 0;
        int monatszugang = 0;
        int monatsEntnahme = 0;
        int bisherigerArtikel = 0;
       int aktuellerBestand = 0;
       int gesamtbestand = 0;

        String[] monat = new String[]{"", "Januar", "Februar", "März", "April", "Mai",
                "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
        //Listenkopf

        System.out.println();
        System.out.println("Lagerwerwaltung");
        System.out.println("------------------");
        System.out.println();

        for (int zeile = 0; zeile < lager.length; zeile++) {


            //ausseres Gruppenkopf
            if (lager[zeile][0] != bisherigerArtikel) {
                bisherigerArtikel = lager[zeile][0];
                aktuellerBestand = 0;
                System.out.println("Artikel-Nummer   " + lager[zeile][0]);
                System.out.println();
            }

            //Innere Gruppenkopf
            if (lager[zeile][1] != bisherigerMonat) {
                bisherigerMonat = lager[zeile][1];
                monatszugang = 0;
                monatsEntnahme = 0;
                System.out.println();
                System.out.println("Monat:   " + monat[bisherigerMonat]);

            }

            //Laufende Zeile
            if (lager[zeile][2] > 0) {
                System.out.print("Zugang     +");
                monatszugang += lager[zeile][2];
            } else {
                System.out.print("Entnahme   ");
                monatsEntnahme += lager[zeile][2];
            }
            aktuellerBestand += lager[zeile][2];
            gesamtbestand += lager[zeile][2];
                    System.out.println(lager[zeile][2]);

            //Inndere gruppenfuss
            if (zeile + 1 == lager.length || bisherigerMonat != lager[zeile][1]) {
                System.out.println("Monats-Zugaenge:  " + monatszugang);
                System.out.println("Monats-Entnahme:  " + monatsEntnahme);
                System.out.println();
            }

            //Ausserer Gruppenfuss
            if (zeile + 1 == lager.length ||bisherigerArtikel != lager[zeile + 1][0]) {

                System.out.println("Aktuelle Bestand   " + aktuellerBestand);
                System.out.println("-------------------");
                System.out.println();

            }

        }

        //Listenfuss
        System.out.println("Gesamt-Bestand     "+ gesamtbestand);
    }
}
