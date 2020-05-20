import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC04 {
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

            String SQL = "SELECT * FROM MYGSM ORDER BY ID DESC";

            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(SQL);
            while (res.next()) {
                String id = res.getString("id");
                String pwd = res.getString("pwd");
                int age = res.getInt("age");

                System.out.println(id + '\t' + pwd + '\t' + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
