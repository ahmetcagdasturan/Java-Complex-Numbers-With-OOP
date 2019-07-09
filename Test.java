import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		
		Complex R1 = new Complex(2,-1);
		System.out.println("1.number created by test method");
		System.out.println("R(1) = " +R1);
		
		Complex R2 = new Complex(num1,num2);
		System.out.println("2.number read from the user.");
		System.out.println("R(2) = " +R2);
		
		File file = new File("/Users/ahmetcagdasturan/Desktop/input.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		int x1 = Integer.parseInt(br.readLine());
		int x2 = Integer.parseInt(br.readLine());
		Complex R3 = new Complex(x1,x2);
		System.out.println("3.number is read from the file");
		System.out.println("R(3) = " + R3);
		
		Complex result = Complex.multiply(R1, R2);
		System.out.println(result);
		R1.multiply(R2);
		Complex.add(R2, R3);
		
	}

}
