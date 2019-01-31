
public class Consultation {

//	public void list(Jr jr) {
//		jr.print();
//	}
//	
//	public void list(Bryce br) {
//		br.print();
//	}
	public void list(LeBron lb) {
		lb.print();
	}
	
	public static void main(String[] args) {
		Consultation agent = new Consultation();
		agent.list(new Jr(185, "Male", true, "NEU"));
		System.out.println("----------------");
		agent.list(new Bryce(170, "Male", false, "SeattleHighSchool"));
		
	}

}
