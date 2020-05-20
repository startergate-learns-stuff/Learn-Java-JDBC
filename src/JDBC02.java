import java.sql.*;
public class JDBC02 {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            if (conn != null) {
                System.out.println("접속 성공");
            } else {
                System.out.println("접속 실패");
            }

            String SQL = "INSERT INTO mygsm VALUES ('3220_최호승', 'gsm3220', 18)";

            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            System.out.println("입력 성공");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
