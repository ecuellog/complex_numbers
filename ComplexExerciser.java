/*
Name: ComplexExerciser.java
Author: Edgardo Cuello 
Purpose: To test the Complex1 class by creating objects using the constructors and calling their methods
		- Also, To test the new methods in Complex class
Edit date: Sep 23, 2013.
Credits: 
	Complex1.java  -  LillAnne Jackson
*/

import java.io.*;
import java.util.*;

public class ComplexExerciser{
	public static void main(String[] args) throws FileNotFoundException {
	
	Complex1 c1= new Complex1(2 , 4);
	Complex1 c2= new Complex1(4 , -5);
	
	System.out.println(c1.toString());
	System.out.println(c2.toString());
	
	File file = new File("ComplexData.txt");
	
	Scanner f = new Scanner (file);
		
	int size = f.nextInt();

	Complex1 array[] = new Complex1[size] ;
		
		for(int i = 0 ; i < size ; i++) {
			array[i] = new Complex1();
			array[i].setReal(f.nextInt());
			array[i].setImaginary(f.nextInt());
			System.out.println(array[i].toString());
		}

		//Part 2 of assignment
		
		File newfile = new File("ComplexData.txt");
	
	Scanner s = new Scanner (newfile);
		
	size = s.nextInt();
		
	Complex cArray[] = new Complex[size] ;
	Complex result = new Complex();	
	Complex sComplex = new Complex(2 , 4);
	Complex mComplex = new Complex(4 , -5);

		for(int i = 0 ; i < size ; i++) {
			cArray[i] = new Complex();
			cArray[i].setReal(s.nextInt());
			cArray[i].setImaginary(s.nextInt());
			
			result = result.add(cArray[i]);
		}
		
			result = result.subtract(sComplex);
			result = result.multiply(mComplex);
			System.out.println(result.toString());
		
	}
}

