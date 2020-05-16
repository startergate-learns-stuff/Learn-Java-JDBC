import java.sql.*;
public class JDBC02 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "system";
            String password = "system";
            Connection conn = DriverManager.getConnection(URL, user, password);
            if (conn != null) {
                System.out.println("접속 성공");
            } else {
                System.out.println("접속 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
