import kr.gsm.MemberDAO;

import java.util.Scanner;

public class JDBC11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scan.next();

        MemberDAO dao = new MemberDAO();
        int cnt = dao.delete(id);

        if (cnt > 0) {
            System.out.println("삭제 성공");
        } else {
            System.out.println("삭제 실패");
        }
    }
}
