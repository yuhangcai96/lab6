import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Danny
 */
public class LandTract {
    public class LandTract {
    	private double length;
	private double width;
	
	

	public LandTract() {
		super();
	}

	public LandTract(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area()
	{
		return length*width;
	}
	
	public boolean equals(LandTract l) {
		return (area()==l.area());
	}
	
	

	@Override
	public String toString() {
		return "[Land area:" + area() + "]";
	}

	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the length and width of the first piece of land: ");
		double l1=sc.nextDouble();
		double w1=sc.nextDouble();
		System.out.println("Please enter the length and width of the second piece of land: ");
		double l2=sc.nextDouble();
		double w2=sc.nextDouble();
		
		LandTract land1=new LandTract(l1,w1);
		LandTract land2=new LandTract(l2,w2);
		
		System.out.println("First"+land1.toString());
		System.out.println("Second"+land2.toString());
		
		if(land1.equals(land2))
		{
			System.out.println("These two pieces of land are equal in size.");
		}else
		{
			System.out.println("These two pieces of land are not equal in size.");
		}
	}

}
