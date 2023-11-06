package Articles;

public class Fertilizer {
    public Fertilizer(String nazwa, int cena, String producent) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.producent = producent;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    private String nazwa;
    private int cena;
    private String producent;
}
