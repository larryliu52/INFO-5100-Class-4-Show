
public class Jr extends LeBron {

	private String collegeName;
	
	
	public Jr(int height, String gender, boolean bBallTalent, String collegeName) {
		super(height, gender, bBallTalent);
		
		this.collegeName = collegeName;
	}

	public void print() {
	System.out.print("Jr: ");
	super.print();
	System.out.println(" " + collegeName);
	}
	
}
