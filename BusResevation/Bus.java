package BusResevation;

public class Bus {
	
	private int busNo;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.setBusNo(no);
		this.setAc(ac);
		this.setCapacity(cap);
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public void displayBusinfo() {
		System.out.println("Bus No:"+busNo+" Ac:"+ac+" Total capacity:"+capacity);
	}
	
}
