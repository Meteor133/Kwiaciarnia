public class Flower {
    private String nazwa;
    private String kolor;
    private String wielkość;
    private int cena;

    public void show(){
        System.out.println("Parametry tego kwiatu są następujące");
        System.out.println("nazwa:" + " " +nazwa + "\n " +"kolor:" + " " + kolor + "\n " + "wielkość:" +  " " + wielkość + "\n " + "cena:" + " " + cena + "\n");
    }

    @Override
    public String toString() {
        return "Flower{" +
                "nazwa='" + nazwa + '\'' +
                ", kolor='" + kolor + '\'' +
                ", wielkość='" + wielkość + '\'' +
                ", cena=" + cena +
                '}';
    }

    public Flower(String nazwa, String kolor, String wielkość, int cena) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.wielkość = wielkość;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public String getWielkość() {
        return wielkość;
    }

    public int getCena() {
        return cena;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public void setWielkość(String wielkość) {
        this.wielkość = wielkość;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
