package LABTUAN1;
import java.util.Scanner;

public class BAI05 {

	public static void main(String[] args) {
		double a,b,c;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap a= ");
		a = kb.nextDouble();
		
		System.out.print("Nhap b= ");
		b = kb.nextDouble();
				
		System.out.print("Nhap c= ");
		c = kb.nextDouble();	
		double min = a;
		
		if (a > b && b < c && a > c) {
			
			System.out.print(b+ " la so nho nhat");
			
		} if ( a > c && c < b && a > b ) {
			
			System.out.print(c+ " la so nho nhat");
			
		} else {
			
			System.out.print(a+ " la so nho nhat");
		}

	}

}
