import kr.gsm.MemberVO;

import java.lang.reflect.Member;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC05 {
    public static void main(String[] args) {
        List<MemberVO> list = new ArrayList<>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            String URL = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
            String user = "hr";
            String password = "hr";
            Connection conn = DriverManager.getConnection(URL, user, password);
            Statement st = conn.createStatement();
            String query = "SELECT * FROM TBLMEM";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String id = rs.getString("id");
                String pwd = rs.getString("pwd");
                int age = rs.getInt("age");
                // System.out.println(id + "\t" + pwd + "\t" + age);
                MemberVO vo = new MemberVO(id, pwd, age);
                list.add(vo);
            }

            listPrint(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void listPrint(List<MemberVO> list) {
        System.out.println("3220_최호승");
        for (MemberVO item: list) {
            System.out.println(item);
        }
    }
}
