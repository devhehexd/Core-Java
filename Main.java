//FQN: Fully Qualified Name(��ü ���)
//import kr.seoul.sesac.util.libs.Finance;
//import kr.seoul.sesac.util.libs.HumanResource;
import kr.seoul.sesac.util.libs.*;

public class Main {
	public static void main(String[] args) {
		//kr.sesac.uitl.libs.Finance f = new kr.sesac.uitl.libs.Finance(); ��ü ���
		//kr.sesac.uitl.libs.HumanResource hr = new kr.sesac.uitl.libs.HumanResource(); ��ü ���
		Finance f = new Finance();
		HumanResource hr = new HumanResource();
		System.out.println(f.money);
		System.out.println(hr.salary);
	}
}
