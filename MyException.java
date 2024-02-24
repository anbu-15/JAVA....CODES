package ExceptionHandling;

import java.util.jar.Attributes.Name;

public class MyException extends Exception{
	public static void main(String[] args) throws MyException {
		String name="anbu";
		try{
			MyException my=new MyException(name);
		}catch(Exception e) {
//		System.out.println("He is Legent");
		}
		}
		
	public MyException(String message)throws MyException{
	super(message);
	if (message.equals("anbu")) {
		System.out.println(("He is Legent")); 
		throw new MyException("He is legent");
		
	}
	System.out.println("anbu");
}
}
