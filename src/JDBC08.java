import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBC08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String id = "java";
        String pwd = "java3220";
        int age = 18;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(URL, user, password);

            String query = "UPDATE TBLMEM SET PWD = ?, AGE = ? WHERE ID = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, pwd);
            ps.setInt(2, age);
            ps.setString(3, id);
            int cnt = ps.executeUpdate();
            if (cnt > 0) {
                System.out.println("수정 성공");
            } else {
                System.out.println("수정 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
