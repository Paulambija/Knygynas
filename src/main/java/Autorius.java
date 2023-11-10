import java.time.LocalDate;

public class Autorius {
    private int autoriausId;
    private String vardas;
    private String pavarde;
    private LocalDate gimimoMetai;
    private String tautybe;

    public Autorius(int autoriausId, String vardas, String pavarde, LocalDate gimimoMetai, String tautybe) {
        this.autoriausId = autoriausId;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.gimimoMetai = gimimoMetai;
        this.tautybe = tautybe;
    }

    public int getAutoriausId() {
        return autoriausId;
    }

    public void setAutoriausId(int autoriausId) {
        this.autoriausId = autoriausId;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public LocalDate getGimimoMetai() {
        return gimimoMetai;
    }

    public void setGimimoMetai(LocalDate gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }

    public String getTautybe() {
        return tautybe;
    }

    public void setTautybe(String tautybe) {
        this.tautybe = tautybe;
    }
}
