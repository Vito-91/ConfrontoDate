package ConfrontoDate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class MainConfronto {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

System.out.print("Inserisci la prima data (yyyy-MM-dd): ");
    LocalDate data1 = LocalDate.parse(input.nextLine());

System.out.print("Inserisci la seconda data (yyyy-MM-dd): ");
    LocalDate data2 = LocalDate.parse(input.nextLine());

    //Confronto tra le due date.
        if (data1.isAfter(data2)) {
            System.out.println("La prima data è più recente della seconda.");
        } else if (data1.isBefore(data2)) {
            System.out.println("La seconda data è più recente della prima.");
        } else {
            System.out.println("Le due date sono uguali.");
        }

    //Giorni che passano da Data1 a Data2.
        long DifferenzaGiorni = ChronoUnit.DAYS.between(data1, data2);
        System.out.println("La differenza è di " + (DifferenzaGiorni) + " giorni.");


   }
}