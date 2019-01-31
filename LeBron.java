
public class LeBron {

	private int height;
	private String gender;
	private boolean bBallTalent;
	
	public LeBron(int height, String gender, boolean bBallTalent) {
		super();
		this.height = height;
		this.gender = gender;
		this.bBallTalent = bBallTalent;
	}

	public void print() {
		System.out.print(height + " " + gender + " " + bBallTalent);
	}

	
}
