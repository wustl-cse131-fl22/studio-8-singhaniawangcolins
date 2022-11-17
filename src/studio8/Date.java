package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;
    
	/**
	 * 
	 * @param month
	 * @param day
	 * @param year
	 * @param isHoliday: is this a holiday? true if yes, false if no
	 */
	public Date(int month, int day, int year, boolean isHoliday) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	@Override
	public String toString() {
		return "Date: " + month + "/" + day + "/" + year + " Holiday? " + isHoliday;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date christmas = new Date(12,25,2022,true);
		
		Date thanksgiving = new Date(11,24,2022,true);
		
		Date christmas2 = new Date(12,25,2022,true);
		
		Date brendonsBday = new Date(3,30,2003,true);
		
		Date random = new Date(6,22,1995,false);
		
		LinkedList<Date> List = new LinkedList<Date>();
		List.add(christmas);
		List.add(christmas2);

		System.out.println(List);
		
		HashSet<Date> set = new HashSet<Date>();
		set.add(christmas);
		set.add(christmas2);
		System.out.println(set);
    }

}
