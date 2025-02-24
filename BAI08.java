package LABTUAN1;
import java.util.Scanner;

public class BAI08 {
	public static int sodau(int so) {
		while(so >= 10) {
			so = so/10;
		}
		return so;
	}
	public static int socuoi(int so) {
		return so%10;
	}

	public static void main(String[] args) {
		int so;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap so= ");
		so = kb.nextInt();
		 
		int sodau = sodau(so);
		int socuoi = socuoi(so);
				
		System.out.print("So dau= " +sodau);
		System.out.print(" So cuoi= " +socuoi);
		
	}

}
