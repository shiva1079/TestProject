package ifstatement;
/**
 * 
 * @author shiva
 *
 */
public class IfExample {
	public void voteEligible() {
		int age = 16;
		if (age > 18) {
			System.out.println("vote eligible");
		} else {
			System.out.println("not vote eligible");
		}

	}

	public void voteEligible(int agenumber) {

		if (agenumber > 18) {
			System.out.println("vote eligible");
		} else {
			System.out.println("not vote eligible");
		}

	}

	public static void main(String[] args) {
		IfExample se = new IfExample();
		se.voteEligible();
		se.voteEligible(50);
		se.voteEligible(10);

	}

}
