import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scan.next();

        System.out.print("PWD: ");
        String pwd = scan.next();

        System.out.print("AGE: ");
        int age = Integer.parseInt(scan.next());

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            String query = "INSERT INTO TBLMEM VALUES ('" + id + "', '" + pwd + "', " + age + ")";
            int cnt = st.executeUpdate(query);
            if (cnt > 0) {
                System.out.println("입력 성공");
            } else {
                System.out.println("입력 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
