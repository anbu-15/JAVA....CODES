package BusResevation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {

	String passengerName;
	int busNo;
	Date date;
	
	Booking(){
		System.out.println("Enter name of the Passenger:");
		try (Scanner sc = new Scanner(System.in)) {
			passengerName = sc.next();
			System.out.println("Enter Bus NO:");
			busNo = sc.nextInt();
			System.out.println("Enter Date dd-mm-yyyy:");
			String dateInput=sc.next();
			SimpleDateFormat dateFormate = new SimpleDateFormat("dd-mm-yyyy");
			
			try {
				date = dateFormate.parse(dateInput);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses){
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) {
				capacity=bus.getCapacity(); 
			}
		}
		int booked=0;
		for(Booking b:bookings) {
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
			
		}
		return booked < capacity ? true:false;
		
	}
}
