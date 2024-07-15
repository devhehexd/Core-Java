
public class SungjukMgmt {

	public static void main(String[] args) {
		
		Student younghee = new Student();
		new Input().input(younghee);
		new Calc().calc(younghee);
		new Output().output(younghee);

	}
	
	
}
