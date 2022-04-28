package A103;

import A103.Container;

public class Schiff {
    private int eigenMasse;
    Container containerAufPlatz1;
   Container containerAufPlatz2;

    public int getEigenMasse() {
        return eigenMasse;
    }

    public void setEigenMasse(int eigenMasse) {
        this.eigenMasse = eigenMasse;
    }


    public void beladePlatz1(Container container) {
       this.containerAufPlatz1 = container;
    }

    public void beladePlatz2(Container container) {
        this.containerAufPlatz2 = container;
    }

    public int gibGesamtMasse() {

        if (containerAufPlatz1 != null && containerAufPlatz2 == null) {
            return eigenMasse  + containerAufPlatz1.gibGesamtMasse();
        } else if ( containerAufPlatz1 == null && containerAufPlatz2 != null){
          return   eigenMasse  + containerAufPlatz2.gibGesamtMasse();
        } else if (containerAufPlatz1 == null && containerAufPlatz2 == null){
            return eigenMasse;
        }


        return eigenMasse + containerAufPlatz1.gibGesamtMasse() + containerAufPlatz2.gibGesamtMasse();
    }

    /*     public Fahrer aussteigen() {
        Fahrer austeigenderFahrer = this.fahrer;
        this.fahrer = null;
        return austeigenderFahrer;

    } */

    public Container entladePlatz1() {
        Container entladendeConteiner = this.containerAufPlatz1;
        this.containerAufPlatz1 = null;
        return entladendeConteiner;
    }

    public Container entladePlatz2() {
        Container entladendeConteiner = this.containerAufPlatz2;
        this.containerAufPlatz2 = null;
        return entladendeConteiner;
    }
}