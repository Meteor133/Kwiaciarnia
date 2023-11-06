import Articles.*;

import java.util.ArrayList;
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

                System.out.println("ile ma być ?");
                String odp2 = scan.nextLine();
                int x = Integer.parseInt(odp2);
                ArrayList<Flower> kwiatki = new ArrayList<Flower>();
                for (int i =0; i < x; i++){
                    kwiatki.add(róża);
                }
                System.out.println("Cena za to wynosi:" + " " + róża.getCena() * x);
                System.out.println("czy pokazać co zostało kupione");
                String odp3 = scan.nextLine();
                if(odp3.equals("tak")){
                    kwiatki.toString();
                    System.out.println(kwiatki);
                }





            } else if (odp1.equals("Anturium")) {
                Anturium anturium = new Anturium("Anturium","różowe", "małe", 13);

                System.out.println("ile ma być ?");
                String odp2 = scan.nextLine();
                int x = Integer.parseInt(odp2);
                ArrayList<Flower> kwiatki = new ArrayList<Flower>();
                for (int i =0; i < x; i++){
                    kwiatki.add(anturium);
                }
                System.out.println("Cena za to wynosi:" + " " + anturium.getCena() * x);
                System.out.println("czy pokazać co zostało kupione");
                String odp3 = scan.nextLine();
                if(odp3.equals("tak")){
                    kwiatki.toString();
                    System.out.println(kwiatki);
                }

            } else if (odp1.equals("Aloes")) {
                Aloes aloes = new Aloes("Aloes","zielony", "średni", 19);

                System.out.println("ile ma być ?");
                String odp2 = scan.nextLine();
                int x = Integer.parseInt(odp2);
                ArrayList<Flower> kwiatki = new ArrayList<Flower>();
                for (int i =0; i < x; i++){
                    kwiatki.add(aloes);
                }
                System.out.println("Cena za to wynosi:" + " " + aloes.getCena() * x);
                System.out.println("czy pokazać co zostało kupione");
                String odp3 = scan.nextLine();
                if(odp3.equals("tak")){
                    kwiatki.toString();
                    System.out.println(kwiatki);
                }

            } else if (odp1.equals("inny kwiatek")) {
                System.out.println("jaka nazwa?");
                String nazwa_kwiatka = scan.nextLine();
                System.out.println("jak kolor?");
                String kolor_kwiatka = scan.nextLine();
                System.out.println("jak duży ma być kwiatek?");
                String wielkośc_kwiatka = scan.nextLine();

                Kwiatek kwiatek = new Kwiatek(nazwa_kwiatka, kolor_kwiatka, wielkośc_kwiatka, 10);

                System.out.println("ile ma być ?");
                String odp2 = scan.nextLine();
                int x = Integer.parseInt(odp2);
                ArrayList<Flower> kwiatki = new ArrayList<Flower>();
                for (int i =0; i < x; i++){
                    kwiatki.add(kwiatek);
                }
                System.out.println("Cena za to wynosi:" + " " + kwiatek.getCena() * x);
                System.out.println("czy pokazać co zostało kupione");
                String odp3 = scan.nextLine();
                if(odp3.equals("tak")){
                    kwiatki.toString();
                    System.out.println(kwiatki);
                }

            }




        }
        else if(odp.equals("narzędzia")){

        }
        else if(odp.equals("nawozy")){

        }
        else {
            System.out.println("wpisano niepoprawną opcję");
        }




    }
}