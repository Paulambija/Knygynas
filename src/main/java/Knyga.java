import java.time.LocalDate;


public class Knyga {
    private int knygosId;
    private String pavadinimas;
    private LocalDate metai;
    private String zanras;
    public Knyga(int knygosId, String pavadinimas, LocalDate metai, String zanras){
        this.knygosId=knygosId;
        this.pavadinimas=pavadinimas;
        this.metai=metai;
        this.zanras=zanras;
    }

    public int getKnygosId() {
        return knygosId;
    }

    public void setKnygosId(int knygosId) {
        this.knygosId = knygosId;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public LocalDate getMetai() {
        return metai;
    }

    public void setMetai(LocalDate metai) {
        this.metai = metai;
    }

    public String getZanras() {
        return zanras;
    }

    public void setZanras(String zanras) {
        this.zanras = zanras;
    }

}
