package Employe;
/**
 * 
 * @author shiva
 *
 */
public class Employe {
	int empId;
	String emname;
	float salary;
	String company;

	public void getEmpId() {
		empId = 1234;
		System.out.println("Employe id"+empId);
			
		}
	public void getEmpsalary(float salary) {
		System.out.println("Employe id"+salary);
	}
	public void getEmname() {
		emname = "shiva";
		System.out.println("Employe id"+emname);
		
		
	}
    public void getcompany(String company) {
		System.out.println("Employe id"+company);
    	
    }
	public static void main(String[] args) {
		Employe em = new Employe();
		em.getEmpId();
		em.getEmpsalary(555.0f);
		em.getEmname();
		
		em.getcompany("shiva infotech");
	}

}
