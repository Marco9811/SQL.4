import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "Velletri98");

        Statement statement = connection.createStatement();

        Statement stmt = connection.createStatement();

        String alter = "ALTER TABLE students ADD country VARCHAR(30);";

        stmt.executeUpdate(alter);

        stmt.executeUpdate("UPDATE students SET country = \"Italy\" where student_id = 1;");
        stmt.executeUpdate("UPDATE students SET country = \"Italy\" where student_id = 2;");
        stmt.executeUpdate("UPDATE students SET country = \"Germany\" where student_id = 3;");
        stmt.executeUpdate("UPDATE students SET country = \"Germany\" where student_id = 4;");

        connection.close();
    }
}
