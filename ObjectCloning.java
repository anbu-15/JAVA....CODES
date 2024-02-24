package Cloning;

import java.util.Arrays;

public class ObjectCloning  {
	public static void main(String[] args) throws CloneNotSupportedException  {
	Human anbu=new Human(21,"anbarasu");
//	Human arasu=new Human(anbu);
	
	Human anbarasu=(Human)anbu.clone();
	
		System.out.println(anbarasu.age +" "+ anbarasu.name);
		System.out.println(Arrays.toString(anbarasu.arr));
	
		anbarasu.arr[0]=100;
		anbarasu.age=25;
		//this is shallow copy
		System.out.println(Arrays.toString(anbu.arr));
		System.out.println(Arrays.toString(anbarasu.arr));
		System.out.println(Arrays.toString(anbu.arr));
		System.out.println(anbu.age +" "+ anbarasu.age);
		
}
}
