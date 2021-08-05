package Opps;

public class Methodoverloading {
	public void StudentID(int num) {
		System.out.println("studentid"+123);

	}

	public void StudentID(String name) {
		System.out.println("studentid"+"raja");
	}

	public void StudentID(String mail, int num) {
		System.out.println("studentid"+"ysraja");
	}

	public static void main(String[] args) {
		Methodoverloading py = new Methodoverloading();
		py.StudentID(123);
		py.StudentID("raja");
		py.StudentID("ysraja");
	}
}