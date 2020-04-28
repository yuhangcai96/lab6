/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class Month {
    public class Month {
    	private int monthNumber;
	
	public Month() {
		monthNumber=1;
	}
	public Month(int monthNumber) {
		if(monthNumber<1||monthNumber>12)
			this.monthNumber=1;
		else
		{
			this.monthNumber=monthNumber;
		}
	}
	
	public Month(String monthName)
	{
		switch(monthName)
		{
		case "January":monthNumber=1;
                break;
		case "February":monthNumber=2;
                break;
		case "March":monthNumber=3;
                break;
		case "April":monthNumber=4;
                break;
		case "May":monthNumber=5;
                break;
		case "June":monthNumber=6;
                break;
		case "July":monthNumber=7;
                break;
		case "August":monthNumber=8;
                break;
		case "September":monthNumber=9;
                break;
		case "October":monthNumber=10;
                break;
		case "November":monthNumber=11;
                break;
		case "December":monthNumber=12;
                break;
		}
		
		
	}

	public int getMonthNumber() {
		return monthNumber;
	}


	public void setMonthNumber(int monthNumber) { 
		this.monthNumber = monthNumber;
	}
	
	public String getMonthName()
	{
		String month="";
		switch(monthNumber)
		{
		case 1:month="January";
                break;
		case 2:month="February";
                break;
		case 3:month="March";
                break;
		case 4:month="April";
                break;
		case 5:month="May";
                break;
		case 6:month="June";
                break;
		case 7:month="July";
                break;
		case 8:month="August";
                break;
		case 9:month="September";
                break;
		case 10:month="October";
                break;
		case 11:month="November";
                break;
		case 12:month="December";
                break;
		}
		return month;
		
	}
	
	@Override
	public String toString() {
		return getMonthName();
	}
	
	public boolean equals(Month name)
	{
		if(monthNumber==name.monthNumber)
		{
			return true;
		}else{
			return false;
		}
		
	}
	public boolean greaterThan(Month name)
	{
		if(monthNumber<name.monthNumber)
		{
			return true;
		}else{
			return false;
		}
		
	}
	public boolean lessThan(Month name)
	{
		if(monthNumber>name.monthNumber)
		{
			return true;
		}else{
			return false;
		}
		
	}

	public static void main(String[] args) {
		Month month1=new Month();
		Month month2=new Month();
		
		
		System.out.println("The monthNumber of month1 is:"+month1.getMonthNumber());
		System.out.println("The monthNumber of month2 is:"+month2.toString());
	
		if(month2.equals(month1))
		{
			System.out.println("The months of month1 and month2 are equal.");
		}else
		{
			System.out.println("The months of month1 and month2 are not equal.");
		}	

}
