package com.company;

public class A822 {
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

        System.out.println("Lagerverwaltung\n" +
                "---------------------\n");

        String[] monat = new String[]{"", "Januar", "Februar", "März", "April", "Mai",
                "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};


        int mount = lager[0][1];

        System.out.println("Artikel-Nummer " + lager[0][0]);
        System.out.println();
        System.out.println("Monat: " + monat[lager[mount][1]]);
        System.out.println();

        int aktuellemonatPlus = 0;
        int akutelleMonatminus = 0;
        int aktuelleBestand = 0;
        int sum = 0;
        for (int i = 0; i < lager.length; i++) {
            if (i == lager.length - 1) {
                if (lager[i][2] < 1) {
                    akutelleMonatminus += lager[i][2];
                } else {
                    aktuellemonatPlus += lager[i][2];
                }
                aktuelleBestand += lager[i][2];
                printEntnahme(lager[i][2]);
                printMonatZugnahmeEntnahme(aktuellemonatPlus, akutelleMonatminus);
                System.out.println("Aktuelle Bestand    " + aktuelleBestand);
                System.out.println("----------------------------");
                continue;
            }
            if ( lager[i][0] == lager[i + 1][0]) {

                if (lager[i][1] == lager[i + 1][1]) {
                    if (lager[i][2] < 1) {
                        akutelleMonatminus += lager[i][2];

                    } else {
                        aktuellemonatPlus += lager[i][2];
                    }
                    aktuelleBestand += lager[i][2];
                    sum +=lager[i][2];
                    printEntnahme(lager[i][2]);
                } else {
                    if (lager[i][2] < 1) {
                        akutelleMonatminus += lager[i][2];

                    } else {
                        aktuellemonatPlus += lager[i][2];
                    }
                    aktuelleBestand += lager[i][2];
                    sum += lager[i][2];
                    printEntnahme(lager[i][2]);
                    printMonatZugnahmeEntnahme(aktuellemonatPlus, akutelleMonatminus);
                    System.out.println("Monat: " + monat[lager[i + 1][1]]);
                    aktuellemonatPlus = 0;
                    akutelleMonatminus = 0;
                }
            } else {
                if (lager[i][2] < 1) {
                    akutelleMonatminus += lager[i][2];
                } else {
                    aktuellemonatPlus += lager[i][2];
                }
                aktuelleBestand += lager[i][2];
                sum += lager[i][2];
                printEntnahme(lager[i][2]);
                printMonatZugnahmeEntnahme(aktuellemonatPlus, akutelleMonatminus);
                System.out.println("Aktuelle Bestand    " + aktuelleBestand);
                System.out.println("----------------------------");
                aktuelleBestand = 0;
                aktuellemonatPlus = 0;
                akutelleMonatminus = 0;
                System.out.println();
                System.out.println("Artikel-Nummer " + lager[i + 1][0]);
                System.out.println();
                System.out.println("Monat: " + monat[lager[i + 1][1]]);
            }
        }
        int aktuellesum = 0;
        for (int[] ints : lager) {
            aktuellesum += ints[2];
        }
        System.out.println("Gesamt-Bestand     " + aktuellesum);
    }
    private static void printEntnahme(int zahl) {
        String output = zahl < 1 ? "Entnahme:  " + zahl : "Zugang:    +" + zahl;
        System.out.println(output);
    }
    private static void printMonatZugnahmeEntnahme(int aktuellemonatPlus, int akutelleMonatminus) {
        System.out.println("Monats-Zugaenge    +" + aktuellemonatPlus);
        System.out.println("Monats-Entnahmen   " + akutelleMonatminus);
        System.out.println();


    }
}


