//FQN: Fully Qualified Name(전체 경로)
//import kr.seoul.sesac.util.libs.Finance;
//import kr.seoul.sesac.util.libs.HumanResource;
import kr.seoul.sesac.util.libs.*;

public class Main {
	public static void main(String[] args) {
		//kr.sesac.uitl.libs.Finance f = new kr.sesac.uitl.libs.Finance(); 전체 경로
		//kr.sesac.uitl.libs.HumanResource hr = new kr.sesac.uitl.libs.HumanResource(); 전체 경로
		Finance f = new Finance();
		HumanResource hr = new HumanResource();
		System.out.println(f.money);
		System.out.println(hr.salary);
	}
}
