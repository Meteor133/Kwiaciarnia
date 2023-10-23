package Articles;

public class Aloes extends Flower{

    public Aloes(String nazwa, String kolor, String wielkość, int cena) {
        super(nazwa, kolor, wielkość, cena);
    }

    @Override
    public void show(){
        super.show();
        System.out.println("informacje: posiada właściwości lecznicze");
    }

}
