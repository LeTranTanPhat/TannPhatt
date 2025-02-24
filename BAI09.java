package LABTUAN1;

import java.util.Scanner;

public class BAI09 {
	public static int tongcacsohang(int cacsonguyen) {
		int tongcacsohang = 0;
		
		while (cacsonguyen > 0) {
			tongcacsohang = tongcacsohang + cacsonguyen%10;
			cacsonguyen = cacsonguyen/10;
		}
		
		return tongcacsohang;
	}
	public static int tichcacsohang(int cacsonguyen) {
		if (cacsonguyen == 0) return 0;
		int ketqua = 1;
		while (cacsonguyen > 0) {
			ketqua *= cacsonguyen % 10;
			cacsonguyen /= 10;
		}
		return ketqua;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cacsonguyen;
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap cac so nguyen = ");
		cacsonguyen = kb.nextInt();
		int tongcacsohang = tongcacsohang(cacsonguyen);
		int tichcacsohang = tichcacsohang(cacsonguyen);
		
		System.out.print("Tong cac chu so la: " +tongcacsohang);
		System.out.print(" Tich cac chu so la: " +tichcacsohang);
		 

	}

}
