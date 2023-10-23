package Articles;

public class Tools {
    private String nazwa;
    private String firma;
    private int wysokość;
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

    public int getWysokość() {
        return wysokość;
    }

    public void setWysokość(int wysokość) {
        this.wysokość = wysokość;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }



    public Tools(String nazwa, String firma, int wysokość, int cena) {
        this.nazwa = nazwa;
        this.firma = firma;
        this.wysokość = wysokość;
        this.cena = cena;
    }






}
