import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
    static final String DB_URL = "jdbc:mysql://localhost:3306/research";
    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement()
        ) {
            // Execute a query
            // authors (author_id, articles, affiliations,email)
            System.out.println("Inserting records into the table...");
            String sql = "INSERT INTO authors (author_id, articles, affiliations, email) VALUES ('100', '0', 'Harvard', 'correo@gmail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO authors (author_id, articles, affiliations, email) VALUES ('101', '0', 'Harvard', 'correo@gmail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO authors (author_id, articles, affiliations, email) VALUES ('102', '0', 'Harvard', 'correo@gmail.com')";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO authors (author_id, articles, affiliations, email) VALUES('103', '0', 'Harvard', 'correo@gmail.com')";
            stmt.executeUpdate(sql);
            System.out.println("Inserted records into the table...");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
