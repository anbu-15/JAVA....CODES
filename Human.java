package Cloning;

import java.util.Iterator;

public class Human implements Cloneable { //way to tell the jvm that we use object cloning
	int age;
	String name;
	int[] arr;
	
	public Human(int age, String name) {
		this.age=age;
		this.name=name;
		this.arr=new int[] {1,12,3,23,4,3};
	}

	

//	public Human(Human obj) {
//		this.age=obj.age;
//		this.name=obj.name;
//	}
	
	public Object clone() throws CloneNotSupportedException {
		//returning a Shallow copy shallow copy
//		return super.clone();
		
		//this is deep copy 
		Human anbarasu=(Human) super.clone(); // this is actually shallow copy
		
		//make a deep copy
		anbarasu.arr=new int[anbarasu.arr.length];
		for(int i=0;i<anbarasu.arr.length;i++) {
			anbarasu.arr[i]=this.arr[i];
		}
		return anbarasu;
		
	}
}
