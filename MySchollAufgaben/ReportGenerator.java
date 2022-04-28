// u08_array
// auf8.26

// Handelskammerpruefung Fachinformatiker Anwendungsentwicklung
// Winter 2012 Fachpruefung G1 Handlungsschritt 3

import java.util.*;

/*
 * Mittels Vererbung steht folgendes Array zur Verfuegung:
 * Integer[][] VKA;
 *
 * Mittels Vererbung stehen folgende Funktionen zur Verfuegung:
 *
 * Order    getOrderData(Integer nr)
 * Agent    getAgentData(Integer nr)
 * Customer getCustomerData(Integer nr)
 * void     printOrderData(Order auftrag)
 * void     printAgentData(Agent vertreter)
 * void     printCustomerData(Customer kunde)
 * void     printSum(String text, Double netto, Double prov)
 * void     printMaxText(Integer vertreterNr, Double netto)
 *
 * Mit "java Start" kann die Anwendung gestartet werden.
 */
public class ReportGenerator extends ReportDaten
{
   public void erstelleReport()
   {
      // Folgende Zeilen demonstrieren die Form der Ausgabe
      // der o.g. Funktionen.
      // Sie koennen nach erfolgreichem Test und vor der
      // eigenen Programmierung geloescht oder
      // herauskommentiert werden:
      


      
      //=======================================================
      // Hier beginnt der Code zur Loesung der Aufgabe
        getOrderData(VKA[0][2]);
        Order order = getOrderData(VKA[0][2]);
        Agent agen = getAgentData(VKA[0][0]);
        printAgentData(agen);
        Customer customer = getCustomerData(VKA[0][1]);
        printCustomerData(customer);

        int test = order.getNr();

        double netto = order.getNetto();

        double prov = order.getProv();

        printOrderData(order);
        // Hier endet der Code zur Loesung der Aufgabe
        double provisionGesamtVertreter = 0;
       double provisionGesamt = 0;
        double nettoGesamt = 0; 
        double vertreterGesamtMax = 0 ;
         int    vertreterGesamtNr = 0;
         double nettoproMonat = 0;

        int vertreterNr = 0;
        int kundenNummer = 0;
        int auftragsNr = 0;
        int monat = 0;
        for (int i = 0; i < VKA.length; i++) {
            if (vertreterNr !=  VKA[i][0]){
          printSum("Summe              " ,  nettoproMonat, provisionGesamtVertreter);
provisionGesamtVertreter = 0; 
                    agen =  getAgentData(VKA[i][0]);
                vertreterNr = VKA[i][0];
                nettoproMonat = 0;
   
                printAgentData(agen);

            }

            if (kundenNummer != VKA[i][1]) {
                customer = getCustomerData(VKA[i][1]);
                kundenNummer = VKA[i][1];
             System.out.println();
                printCustomerData(customer);
            }



          order =  getOrderData(VKA[i][2]);


          if (vertreterGesamtMax < nettoproMonat){
                vertreterGesamtMax = nettoproMonat;
               vertreterGesamtNr = vertreterNr;
            }
             test = order.getNr();

             netto = order.getNetto();
     
             nettoproMonat += netto;

             nettoGesamt += netto;
             prov = order.getProv();
             double pro = netto * prov / 100.0;
        provisionGesamtVertreter += pro;

             provisionGesamt += pro;


             
             System.out.println();

            printOrderData(order);

        }

                  System.out.println();
             printSum ("Summen gesamt           " , nettoGesamt, provisionGesamt);


            printMaxText(vertreterGesamtNr, vertreterGesamtMax);
        // Hier endet der Code zur Loesuprng der Aufgabe
        //=======================================================







 //=======================================================

      //=======================================================
   }
}