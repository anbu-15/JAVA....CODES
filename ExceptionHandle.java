package ExceptionHandling;

public class ExceptionHandle {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		//Using Try Catch Keyword
		try {
		int c=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Dont divide by zero by ArithmeticException");
		}
		catch(Exception e) {
			System.out.println("Dont divide by zero by Exception");
		}
		if(a<10) {
			System.out.println(a);
		}
		//dividen(a,b);
		
	}

	private static int dividen(int a,int b) throws ArithmeticException {
		
		if(b==0) {
			throw new ArithmeticException("Dont Divide by zero");
		}
		System.out.println("I'm Sorry this is for testing ");
		return a/b;
		
	}
	
	
	
	

}
