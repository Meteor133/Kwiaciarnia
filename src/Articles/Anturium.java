package Articles;

public class Anturium extends Flower{
    public Anturium(String nazwa, String kolor, String wielkość, int cena) {
        super(nazwa, kolor, wielkość, cena);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("informacje: może być silnie trujący");
    }
}
