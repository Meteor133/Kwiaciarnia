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
            System.out.println("jakie chcesz kupić kwiaty?");
            System.out.println("któreś z popularnych? lub podaj własne");
            String odp1 = scan.nextLine();
                if(odp1.equals("popularne")){
                    System.out.println("Róża");
                    System.out.println(("Aloes"));
                    String odp2 = scan.nextLine();
                    if(odp2.equals("Róża")){
                        Rose róża = new Rose("róża", "czerwony", "duża",9);

                    }
                }

        }




    }
}