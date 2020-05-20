import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC03 {
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

            String SQL = "UPDATE MYGSM SET PWD='1004', AGE=15 WHERE ID='gsm'";

            Statement st = conn.createStatement();
            st.executeUpdate(SQL);
            System.out.println("수정 성공_3220_최호승");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
