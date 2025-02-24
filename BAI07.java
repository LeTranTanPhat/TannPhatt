package LABTUAN1;
import java.util.Scanner;

public class BAI07 {

	public static void main(String[] args) {
		float a,b,c,d,e;
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Nhap diem Toan= ");
		a = kb.nextFloat();
		
		System.out.print("Nhap diem Ly= ");
		b = kb.nextFloat();
		
		System.out.print("Nhap diem Sinh= ");
		c = kb.nextFloat();
		
		System.out.print("Nhap diem Hoa= ");
		d = kb.nextFloat();
		
		System.out.print("Nhap diem May tinh= ");
		e = kb.nextFloat();
		
		float tyle = ((a+b+c+d+e)/50)*100;
		
		if (tyle >= 90) {
			
			System.out.print("Hang A");
			
		} else if (tyle >= 80) {
			
			System.out.print("Hang B");
			
		} else if (tyle >= 70) {
			
			System.out.print("Hang C");
			
		} else if (tyle >= 60) {
			
			System.out.print("Hang D");
			
		} else if (tyle >= 40) {
			
			System.out.print("Hang E");
			
		} else {
			
			System.out.print("Hang F");
		}
	}

}
