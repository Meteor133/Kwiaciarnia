package Articles;

public class Tools {
    private String nazwa;
    private String firma;
    private int cena;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Tools{" +
                "nazwa='" + nazwa + '\'' +
                ", firma='" + firma + '\'' +
                ", cena=" + cena +
                '}';
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }



    public Tools(String nazwa, String firma, int cena) {
        this.nazwa = nazwa;
        this.firma = firma;
        this.cena = cena;
    }






}
