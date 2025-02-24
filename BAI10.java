package LABTUAN1;
import java.util.Scanner;

public class BAI10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int demchuso = 0;
		int so;
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap day so nguyen = ");
		so = kb.nextInt();
		
		while (so != 0) {
			so = so / 10;
			++demchuso;
		}
		
		System.out.print("So cac chu so la " +demchuso );

	}

}
