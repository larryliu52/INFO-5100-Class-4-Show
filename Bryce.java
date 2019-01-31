
public class Bryce extends LeBron{
	
//	protected int height() {
//		return 170;
//	}
//	
//	protected String gender() {
//		return "Male";
//	}
//	
//	protected boolean bBallTalent() {
//		return false;
//	}
	
	
	private String highSchoolName;
	
	public Bryce(int height, String gender, boolean bBallTalent, String highSchoolName) {
		super(height, gender, bBallTalent);
		
		this.highSchoolName = highSchoolName;
	}

//	public void print() {
//		System.out.println(height + " " + gender + " " + bBallTalent + " " + highSchoolName);
		
//	}
	public void print() {
		System.out.print("Br: ");
		super.print();
		System.out.println(" " + highSchoolName);
	}
	
	
}
