package LABTUAN1;
import java.util.Scanner;

public class BAI03 {

	public static void main(String[] args) {
		
		double doF;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap Do F= ");
		doF = kb.nextDouble();
	
		double doC = (doF-32)/1.8;
		
		System.out.print("Do C= " +doC);

	}

}
