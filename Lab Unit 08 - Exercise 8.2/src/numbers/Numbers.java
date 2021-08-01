package numbers;

import java.lang.Math. *;
import java.lang.Number.*;

/*8.2 Create class Number with only one private instance variable as a double
primitive type. To include the following methods (include respective
constructors) isZero( ), isPositive(), isNegative( ), isOdd( ), isEven( ),
isPrime(), isAmstrong() the above methods return boolean primitive type.
getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above
methods return double primitive type. void listFactor(), void dispBinary().*/

public class Numbers {
	
	private double double1;
	private long long1;
 
	public Numbers(){
	
		double1 = 108.0d;
		long1 = 249;
	
	}
	
	public Numbers(double d, long l){ 
 
		double1 = d;
		long1 = 1;
	
	}
	
	public boolean isZero(){
 
		if (double1 == 0.0)
			return true;
		else
			return false;
	
	}
	
	public boolean isPositive(){
 
		if(double1 > 0.0)
			return true;
		else
			return false;
 
	}
	
	public boolean isNegative(){
 
		if (double1 < 0.0)
			return true ;
		else
			return false;
 
	}
	
	public boolean isodd(){
 
		if (double1 % 2 != 0.0)
			return true;
		else 
			return false;
	}
	
	public boolean isEven(){
 
		if (double1 % 2 == 0.0)
			return true ;
		else 
			return false;
	}
	
	public boolean isPrime(){
 
		int lastn; 
		double num;
		boolean flag;
		
		num = Math.sqrt(long1);
		lastn = (int)num;
		flag = true;
		
		for (int i = 2; i < lastn; i++){
			
			if (long1 != i){
				
				if( long1 % i == 0){
				
					flag = false;
					break;
			
				}
			}
		}
		
		if (flag)
			return true;
		else 
			return false;
	}
	
	public boolean isAmstrong(){
		
		if (double1 == 0.0)
			return true;
		else 
			return false;
	}
	
	public double getFactorial(){
		
		double num = 1;
		
		for(int i = 1;i < long1; i++)
			num *=i;
		return num;
	
	}
	
	public double getSqrt(){
 
		double num;
		num = (double) long1;
		num = Math.sqrt(num);
		return num;
		
	}
	
	public double getSqr(){
	
		double num;
		num = (double) long1;
		num = num * num;
		return num;
		
	}
	public double sumDigits(){ 
	
		double sum = 0;
		 
		while(long1 > 9){
			 
			sum += long1 % 10;
			long1 = long1 / 10;
		 
		}
		 
		sum += long1;
		return sum;
	}
	
	public double getReverse(){
		
		double reverse = 0;
		double temp;
		while (long1 > 9){
			
			temp = long1 % 10;
			reverse = reverse * 10 + temp;
			long1 = long1/10;
			System.out.println ("\n"+ temp + "\t" + reverse +" \t "+ long1);
		
		}
	 
		reverse = reverse * 10 +long1;
		System.out.println ("Inside class" + reverse);
		return reverse;
		
	}
	public void dispBinary(){
	
		System.out.println("ByteValue of long1 :" + Long.toBinaryString(long1));
	
	}
	
	public static void main (String [] args){
	
		Numbers mynum = new Numbers( );
		//double num = 199;
		System.out.println("The given numbers are 108.0d and 249");
		System.out.println ("\nisZero " + mynum.isZero());
		System.out.println ("\nisPositive " + mynum. isPositive());
		System.out.println ("\nisNegative " + mynum.isNegative());
		System.out.println ("\nisOdd " + mynum.isodd());
		System.out.println ("\nisEven " + mynum.isEven());
		System.out.println ("\nisPrime " +mynum.isPrime());
		System.out.println ("\ngetFactorial " + mynum.getFactorial());
		System.out.println ("\ngetSqrt " + mynum. getSqrt());
		System.out.println ("\ngetSqr " + mynum.getSqr());
		System.out.println ("\nsumDigits " + mynum.sumDigits());
		System.out.println ("\ngetReverse " + mynum.getReverse());
		mynum.dispBinary();
		System.out.println ("\nisPrime " +mynum.isPrime());
	
	}
} 