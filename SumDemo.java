package com.java.basic;

public class SumDemo {
public static void main(String[] args) {
	
	SumDemo s=new SumDemo();
int s1=	s.getSum(12, 10);
	System.out.println("add of a and b is "+s1);
	

}public int getSum(int a, int b) {
		  int carry = 0;
		  while (b != 0) {
		   carry = a & b;
		   a = a ^ b;
		   b = carry << 1;
		  }
		  return a;
		 }
}
