/*
Name: Complex.java
Author: LillAnne Jackson
Edited by: Edgardo Cuello
Edit date: Sep 23, 2013
Purpose: This is a class used to define Complex number types. It has the methods to add, subtract, multiply, and divide complex numbers.
Credits:
	Lillanne Jackson:
		Default constructors
		Constructor with two parameters
		Accessor for the "real" attribute
		Mutator for the "real" attribute
		Accessor for the "imaginary" attribute
		Mutator for the "imaginary" attribute
		toString() Method
	
	Edgardo Cuello:
		Constructor with one parameter
		add() method
		subtract() method
		multiply() method
		divide() method
		Edit of the toString() method for better appearance of complex numbers
		Tester (main)
		All comments
*/

public class Complex {
	private int real;
	private int imaginary;

	//Default Constructor
	public Complex () {
		this.real = 0;
		this.imaginary = 0;
	}

	//Constructor for new complex number with:
	// real component = r
	// imaginary component = 0
	public Complex (int r) {
		this.real = r;
		this.imaginary = 0;	
	}
	
	// Constructor for a new complex number, with: 
	// - real component = r
	// - imaginary component = i
	public Complex (int r, int i) {
		this.real = r;
		this.imaginary = i;
	}

	// Accessor for the "real" attribute
	public int getReal() {
		return this.real;
	}

	// Mutator for the "real" attribute
	public void setReal(int real) {
		this.real = real;
	}

	// Accessor for the "imaginary" attribute
	public int getImaginary() {
		return this.imaginary;
	}

	// Mutator for the "imaginary" attribute
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	//Inputs: A complex number
	//Outputs : The addition of this complex number to the input complex number
	public Complex add(Complex val) {
		int r = this.real + val.real;
		int i = this.imaginary + val.imaginary;
		Complex a = new Complex (r,i);
		return a;
	}
	
	//Inputs: a new complex number
	//Outputs : The subtraction of this complex number to the input complex number
	public Complex subtract(Complex val) {
		int r = this.real - val.real;
		int i = this.imaginary - val.imaginary;
		Complex a = new Complex(r,i);
		return a;
	}
	
	//Inputs: A complex number
	//Outputs : The multiplication of this complex number to the input complex number
	public Complex multiply(Complex val) {
		int r = (this.real * val.real) - (this.imaginary * val.imaginary);
		int i = (this.imaginary * val.real) + (this.real * val.imaginary);
		Complex a = new Complex(r,i);
		return a;
	}
	
	//Inputs: A complex number
	//Outputs : The division of this complex number to the input complex number with real and imaginary values rounded down to the nearest integer
	public Complex divide(Complex val) {
		int denom = (val.real * val.real) + (val.imaginary * val.imaginary);
		int r = ((this.real * val.real) + (this.imaginary * val.imaginary)) / denom;
		int i = ((this.imaginary * val.real) - (this.real * val.imaginary)) / denom;
		Complex a = new Complex(r,i);
		return a;
	}
	
	//Prints out the complex number
	public String toString() {
	
		String result;
		if(imaginary >0) {
			if(real == 0){                  //When real is 0 and imaginary is positive
				result = imaginary + "i";
			}
			
			else{                           //When real is not 0 and imaginary is positive
				result = real + " + " + imaginary + "i";
			}
		}
		
		else if(imaginary == 0) {
			if(real == 0) {                 //When both imaginary and real are 0
				result = "0";
			}
			
			else{                           //When real is not 0 and imaginary is 0
				result = real + " ";
			}
		}
		
		else{
			if(real == 0){                  //When real is 0 and imaginary is negative
				result = imaginary + "i";
			}
			
			else{                           //When real is not 0 and imaginary is negative
				result = real + " - " + (-imaginary) + "i";
			}
		}
		
		return result;
	} // End of toString() method
	
	// In an instance method you need an instance of a class (an object) to execute this method. 
	// For a static method you don't need one because this method is defined within the class
	
	public static void main(String[] args) {             // Tester

		Complex a = new Complex (0,1);                    //Testing all possibilities for the toString() method
		Complex b = new Complex (1,1);
		Complex c = new Complex ();
		Complex d = new Complex (1,0);
		Complex e = new Complex (0,-1);
		Complex f = new Complex (1,-1);
		
		System.out.print("Should Output 1i: ");            //When real is 0 and imaginary is positive
		System.out.println(a.toString());
		
		System.out.print("Should Output 1 + 1i: ");        //When real is not 0 and imaginary is positive
		System.out.println(b.toString());
	
		System.out.print("Should Output 0: ");             //When both imaginary and real are 0
		System.out.println(c.toString());
		
		System.out.print("Should Output 1: ");             //When real is not 0 and imaginary is 0
		System.out.println(d.toString());
		
		System.out.print("Should Output -1i: ");           //When real is 0 and imaginary is negative
		System.out.println(e.toString());
		
		System.out.print("Should Output 1 - 1i: ");        //When real is not 0 and imaginary is negative
		System.out.println(f.toString());
		
		Complex aReal = new Complex(12);                  //Testing the constructor with one parameter
		System.out.print("Should Output 12: ");
		System.out.println(aReal.toString());
		
		Complex cTestA = new Complex(10,3);                // Testing the add() method
		Complex cTestB = new Complex(2,-1);
		System.out.print("Should Output 12 + 2i : ");
		System.out.println(cTestA.add(cTestB));
		
		System.out.print("Should Output 8 + 4i : ");	   //Testing the subtract() method
		System.out.println(cTestA.subtract(cTestB));
		
		System.out.print("Should Output 23 - 4i : ");	   //Testing the multiply() method
		System.out.println(cTestA.multiply(cTestB));
		
		System.out.print("Should Output 3 + 3i : ");	   //Testing the divide() method
		System.out.println(cTestA.divide(cTestB));
		
	}	
}