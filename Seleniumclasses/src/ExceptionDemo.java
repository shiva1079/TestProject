
public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("today our topic is exception handling");
            try {
            	int a=10;
    			int b=0;
    			int c=a/b;
    			System.out.println(a);
    			System.out.println(b);
    			System.out.println(c);
            	
            }
		
		catch(ArithmeticException ae){
		ae.printStackTrace();//exception name, reason line number,method
      // System.out.println(ae.toString());name,reason
			
		}
            //try and catch block will faill final block is worked
		finally {
			
			System.out.println("from finally");
		}
		
		System.out.println("Welcome to the telugu");
		System.out.println("by shiva");
		
		
	}

}
