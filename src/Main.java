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

            }


        }
        else if(odp.equals("narzędzia")){

        }
        else if(odp.equals("nawozy")){

        }




    }
}