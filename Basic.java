 package enumExamples;

public class Basic {
	enum Week implements A{
		Monday,TUesday,Wednesday,Thursday,Firday,Saturday,Sunday;
		//this are the enum constants
		//this is always public,static and final
		//since its final you can create chold enums
		//this type is Week
		//creating constructor
		 Week() {
				System.out.println("Construtor called for " + this);
			}
		 public void hello() {
			 System.out.println("Hi this is hello method");
		 }
	}
	
	
	 //this is not public or protected only private or default
	 //why? we dont want to create new objects only constant number of object
	 //this is not the enum concept, that why
	 
	 //internally: public static final Week Monday=new Week();
	
	public static void main(String[] args) {
		Week week;
		 week=Week.Monday;
		System.out.println();
		for(Week day:Week.values()) {
			System.out.println(day);
			//System.out.println(week.ordinal());
		}
	}

}

// enum can implement as many as interface you want but it cant extend class 
//abstract or not allowed