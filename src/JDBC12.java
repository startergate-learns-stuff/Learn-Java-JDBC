import kr.gsm.MemberDAO;
import kr.gsm.MemberVO;

import java.util.List;

public class JDBC12 {
    public static void main(String[] args) {
        MemberDAO dao = new MemberDAO();
        List<MemberVO> members = dao.getAllList();

        if (members.size() == 0) {
            System.out.println("데이터 없음");
            return;
        }

        for (MemberVO member: members) {
            System.out.println(member.getId() + '\t' + member.getPwd() + '\t' + member.getAge());
        }

        System.out.println();

        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i));
        }
    }
}
