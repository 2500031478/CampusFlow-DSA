import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static void main(String[] args) {

        try {

            // 👇 ee line add cheyyi
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/dsa",
                "postgres",
                "Vishalini@07"
            );

            System.out.println("Database Connected Successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}