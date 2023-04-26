import java.sql.*;

public class FirstExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/research";
    static final String USER = "root";
    static final String PASS = "";

    static final String QUERY = "SELECT * FROM authors";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY)) {
            // Extract data from result set
            while (rs.next()) {
                // Retrieve by column name
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("author_id: " + rs.getString("author_id"));
                System.out.println("articles: " + rs.getString("articles"));
                System.out.println("affiliations: " + rs.getString("affiliations"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}