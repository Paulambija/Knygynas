import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbm = new DatabaseManager();
        Autorius autorius = new Autorius(1, "Jonas", "Jonaitis", LocalDate.of(1990, 2, 16), "lietuvis");
        dbm.pridetiAutoriu(autorius);

    }
}
