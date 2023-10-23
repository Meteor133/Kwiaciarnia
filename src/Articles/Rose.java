package Articles;

public class Rose extends Flower{

    public Rose(String nazwa, String kolor, String wielkość, int cena) {
        super(nazwa, kolor, wielkość, cena);

    }
    public void show(){
        super.show();
        System.out.println("informacje: posiada ostrę kolce" );
    }
}
