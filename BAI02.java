package LABTUAN1;
import java.util.Scanner;

public class BAI02 {

	public static void main(String[] args) {
		
		double a, b;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap chieu dai = ");
		a = kb.nextDouble();
		
		System.out.print("Nhap chieu rong = ");
		b = kb.nextDouble();
		
		double dientich = a*b;
		System.out.print("Dien tich hinh chu nhat = " +dientich);
		

	}

}
