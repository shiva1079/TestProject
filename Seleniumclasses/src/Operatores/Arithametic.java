package Operatores;
/**
 * 
 * @author shiva
 *
 */


public class Arithametic {
	int a =8,b=10,c=15;
	public void ArithamaticOperators() {
		System.out.println("a+b------->"+(a+b));
		System.out.println("a-b------->"+(a-b));
		System.out.println("a*b------->"+(a*b));
		System.out.println("a/b------->"+(a/b));
		System.out.println("a%b------->"+(a%b));		
	}
	public void RelationalOeratores() {
		
		System.out.println("a==b------->"+(a==b));
		System.out.println("a!=b------->"+(a!=b));
		System.out.println("a>b------->"+(a>b));
		System.out.println("a<b------->"+(a<b));
		System.out.println("a>=b------->"+(a>=b));
		System.out.println("a<=b------->"+(a<=b));		

	}	
	public void LogicalOperators() {
		System.out.println((a>b)&&(b<c));
		System.out.println((a<b)||(b>c));
		System.out.println(!(b>a));
		
	}
	public void AssignmentOperator() {
		System.out.println("a+=b------->"+(a+=b));
		System.out.println("a-=3------->"+(a-=3));
		System.out.println("a*=6------->"+(a*=6));
		System.out.println("a/=b------->"+(a/=b));
		System.out.println("a%=5------->"+(a%=5));
	}
	
	public static void main(String[] args) {
		Arithametic ar = new Arithametic();
		ar.ArithamaticOperators();
		ar.RelationalOeratores();
		ar.LogicalOperators();
		ar.AssignmentOperator();
		
	}
	
	}

