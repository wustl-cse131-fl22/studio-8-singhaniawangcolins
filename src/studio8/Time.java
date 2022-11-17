package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean is24Hr;
	

	public Time(int hour, int minute, boolean is24Hr) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.is24Hr = is24Hr;
	}
	
	


	@Override
	public String toString() {
		return hour+ ":" + minute;
	}




	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}




	public static void main(String[] args) {
		Time rightNow = new Time(13, 47, true);
		System.out.println(rightNow);
		Time minuteAgo= new Time(13,47,true);
		System.out.println(minuteAgo);
		System.out.println(rightNow.equals(minuteAgo));
		
 
    	
    }

}