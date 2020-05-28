import kr.gsm.MemberDAO;
import kr.gsm.MemberVO;

import java.util.Scanner;

public class JDBC09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ID: ");
        String id = scan.next();

        System.out.print("PWD: ");
        String pwd = scan.next();

        System.out.print("AGE: ");
        int age = Integer.parseInt(scan.next());

        MemberDAO dao = new MemberDAO();
        int cnt = dao.insert(new MemberVO(id, pwd, age));

        if (cnt > 0) {
            System.out.println("입력 성공");
        } else {
            System.out.println("입력 실패");
        }
    }
}
