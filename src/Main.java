import Articles.Aloes;
import Articles.Anturium;
import Articles.Flower;
import Articles.Rose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Witaj na stronie naszej kwiaciarni");
        Scanner scan = new Scanner(System.in);
        System.out.println("Chcesz kupić kwiaty lub inne artykuły");

        System.out.println("kwiaty");
        System.out.println("narzędzia");
        System.out.println("nawozy");

        String odp = scan.nextLine();

        if(odp.equals("kwiaty")){
            System.out.println("Chcesz kupić: Różę, Anturium, Aloesa lub innych kwiatek");
            String odp1 = scan.nextLine();
            if(odp1.equals("Róża")){
                Rose róża = new Rose("Róża", "czerwony", "duża", 6);
            } else if (odp1.equals("Anturium")) {
                Anturium anturium = new Anturium("Anturium","różowe", "małe", 13);
            } else if (odp1.equals("Aloes")) {
                Aloes aloes = new Aloes("Aloes","zielony", "średni", 19);
            } else if (odp1.equals("inny kwiatek")) {
                System.out.println("jaka nazwa?");
                String nazwa_kwiatka = scan.nextLine();
                System.out.println("jak kolor?");
                String kolor_kwiatka = scan.nextLine();
                System.out.println("jak duży ma być kwiatek?");
                String wielkośc_kwiatka = scan.nextLine();

                Flower kwiatek = new Flower(nazwa_kwiatka, kolor_kwiatka, wielkośc_kwiatka, 10);
            }


        }
        else if(odp.equals("narzędzia")){

        }
        else if(odp.equals("nawozy")){

        }




    }
}