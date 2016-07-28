//Multi level 

import java.io.*;
class A
	{
		public void display1()
		{
		System.out.println("I'm in A");
		}
	}
class B extends A
	{
		public void display2()
		{
		super.display1();
		System.out.println("I'm in B");
		}
	}
class C extends B
	{
	
		public void display()
		{
		super.display2();	
		System.out.println("I'm in C");
		}
	}
class Alphabets
	{
		public static void main(String args[])
		{
		C obj= new C();
		obj.display();
//obj.display2();
//obj.display1();
		}
	}
