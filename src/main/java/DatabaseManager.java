import java.sql.*;

public class DatabaseManager {
    String url="jdbc:postgresql://localhost:5432/knygynas";
    private static final String USERNAME="postgres";
    private static final String PASSWORD="postgres";
    private Connection connection;

    public DatabaseManager() {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, USERNAME, PASSWORD);

        } catch (SQLException  | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void pridetiAutoriu(Autorius autorius){
        String query="INSERT INTO autoriai(autoriaus_id,vardas, pavarde, gimimo_metai, tautybe) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement=connection.prepareStatement(query);
            preparedStatement.setInt(1, autorius.getAutoriausId());
            preparedStatement.setString(2, autorius.getVardas());
            preparedStatement.setString(3, autorius.getPavarde());
            preparedStatement.setDate(4, Date.valueOf(autorius.getGimimoMetai()));
            preparedStatement.setString(5, autorius.getTautybe());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
