import java.sql.*;

public class StudentDAO {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "root";
        String pass = "your_password";

        try {
            Connection con = DriverManager.getConnection(url, user, pass);

            String insertSQL = "INSERT INTO students (id, name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSQL);
            ps.setInt(1, 101);
            ps.setString(2, "John");
            ps.executeUpdate();

            String updateSQL = "UPDATE students SET name = ? WHERE id = ?";
            ps = con.prepareStatement(updateSQL);
            ps.setString(1, "Johnny");
            ps.setInt(2, 101);
            ps.executeUpdate();

            System.out.println("Insert and Update successful.");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
