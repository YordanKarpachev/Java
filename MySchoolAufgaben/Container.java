package A103;

import java.io.FilterOutputStream;

public class Container {
    Palette palettePlatz1;
    Palette palettePlatz2;
    Palette palettePlatz3;
    private String zielHafen;

    public int getEigenMasse() {
        return EigenMasse;
    }

    public void setEigenMasse(int eigenMasse) {
        EigenMasse = eigenMasse;
    }

    int EigenMasse;

    public String getZielHafen() {
        return zielHafen;
    }


    public void belegePlatz(int platz, Palette palette) {
        if (platz < 1 || platz > 3) {
            System.out.println("Platz " + platz + " exestiert nicht");
        }
        if (platz == 1) {
            this.palettePlatz1 = palette;
        }
        if (platz == 2) {
            this.palettePlatz2 = palette;
        }

        if (platz == 3) {
            this.palettePlatz3 = palette;
        }
    }

    public Palette raeumePlatz(int platz) {
        if (platz < 1 || platz > 3) {
            System.out.println("Platz " + platz + " exestiert nicht");


        }
        if (platz == 1) {
            Palette entladendePalettePlatz1 = this.palettePlatz1;
            this.palettePlatz1 = null;
            return entladendePalettePlatz1;
        }
        if (platz == 2) {
            Palette entladendePalettePlatz2 = this.palettePlatz2;
            this.palettePlatz2 = null;
            return entladendePalettePlatz2;
        }

        if (platz == 3) {
            Palette entladendePalettePlatz3 = this.palettePlatz3;
            this.palettePlatz3 = null;
            return entladendePalettePlatz3;
        }

            return null;
    }

    public Palette raumePlatz() {
        Palette entladendePalettePlatz2 = this.palettePlatz2;
        this.palettePlatz2 = null;
        return entladendePalettePlatz2;
    }

    public Palette entladePalletePlatz3() {
        Palette entladendePalettePlatz3 = this.palettePlatz3;
        this.palettePlatz3 = null;
        return entladendePalettePlatz3;
    }


    public void setZielHafen(String zielHafen) {
        this.zielHafen = zielHafen;
    }

    private int masse;

    public int gibGesamtMasse() {

        if (palettePlatz1 != null && palettePlatz2 == null && palettePlatz3 == null) {
            return getEigenMasse()+ palettePlatz1.getMasse();
        } else if (palettePlatz1 == null && palettePlatz2 != null && palettePlatz3 == null) {
            return getEigenMasse()+ palettePlatz2.getMasse();
        } else if (palettePlatz1 == null && palettePlatz2 == null && palettePlatz3 != null) {
            return getEigenMasse()+palettePlatz3.getMasse();
        } else if (palettePlatz1 != null && palettePlatz2 != null && palettePlatz3 == null) {
            return getEigenMasse()+ palettePlatz1.getMasse() + palettePlatz2.getMasse();
        } else if (palettePlatz1 != null && palettePlatz2 == null && palettePlatz3 != null) {
            return getEigenMasse()+palettePlatz1.getMasse() + palettePlatz3.getMasse();
        } else if (palettePlatz1 == null && palettePlatz2 != null && palettePlatz3 != null) {
            return getEigenMasse()+ palettePlatz3.getMasse() + palettePlatz2.getMasse();
        }

        return getEigenMasse()+ palettePlatz1.getMasse() + palettePlatz2.getMasse() + palettePlatz3.getMasse();
    }

}



