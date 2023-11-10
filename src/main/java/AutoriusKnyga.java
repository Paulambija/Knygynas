public class AutoriusKnyga {
private int knygosId;
private int autoriausId;

    public AutoriusKnyga(int knygosId, int autoriausId) {
        this.knygosId = knygosId;
        this.autoriausId = autoriausId;
    }

    public int getKnygosId() {
        return knygosId;
    }

    public void setKnygosId(int knygosId) {
        this.knygosId = knygosId;
    }

    public int getAutoriausId() {
        return autoriausId;
    }

    public void setAutoriausId(int autoriausId) {
        this.autoriausId = autoriausId;
    }
}
