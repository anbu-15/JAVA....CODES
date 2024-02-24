package BusResevation;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,3));
		buses.add(new Bus(3,true,48));
		
		int userOpt=1;
	
		Scanner scanner=new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusinfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and Enter 2 to Exit");
			userOpt=scanner.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your booking is Confirmed");
				}
				else 
					System.out.println("Sorry Bus is full,Try another Bus or Date");
				
			}
			else
			{
				System.out.println("Exiting..");
			}
		}

	}

}
