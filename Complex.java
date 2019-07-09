
public class Complex {

	private int real;
	private int imaginary;
	
	public Complex(int real, int imaginary) {
		
		this.real = real;
		this.imaginary = imaginary;
	}
	public static Complex add(Complex c1, Complex c2) {
		
		int n1 = c1.real + c2.real;
		int n2 = c1.imaginary + c2.imaginary;
		Complex c3 = new Complex(n1,n2);
		return c3;
		
	}
	public static Complex multiply(Complex c1, Complex c2) {
		
		int n1 = c1.real*c2.real - c1.imaginary*c2.imaginary;
		int n2 = c1.real*c2.imaginary - c2.real*c1.imaginary;
		
		Complex c3 = new Complex(n1,n2);
		
		return c3;
	}
	public Complex add(Complex c1) {
		
		int n1 = this.real + c1.real;
		int n2 = this.imaginary + c1.imaginary;
		Complex c2 = new Complex(n1,n2);
		return c2;
		
	}
	public Complex multiply(Complex c1) {
		
		int n1 = this.real*c1.real-this.imaginary*c1.imaginary;
		int n2 = this.real*c1.imaginary - this.imaginary*c1.real;
		Complex c2 = new Complex(n1,n2);
		return c2;
		
	}
	public String toString() {
		
		return this.real + "+" + this.imaginary + "i";
	}
}
