package LABTUAN1;
import java.util.Scanner;

public class BAI06 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap canh a= ");
		a = kb.nextInt();
		
		System.out.print("Nhap canh b= ");
		b = kb.nextInt();
		
		System.out.print("Nhap canh c= ");
		c = kb.nextInt();
		
		if ( a+b>c && a+c>b && b+c>a) {
			
			System.out.print("Day la tam giac!");
		} else {
			System.out.print("Day khong phai la tam giac!");
		}

	}

}
