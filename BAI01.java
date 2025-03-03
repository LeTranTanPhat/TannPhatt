package LABTUAN2;
import java.util.Scanner;
import java.util.Arrays;

public class BAI01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bai01_a
		Scanner kb = new Scanner(System.in);
		int a;
		System.out.print("Nhap so phan tu: ");
		a = kb.nextInt();
		int[] mang = new int[a];
		System.out.println("Nhap cac phan tu cua mang: ");
		
		for (int i = 0; i < a; i++) {
			System.out.print("a["+ i +"]= ");
			mang[i] = kb.nextInt();
			
		}
		//CauB
		System.out.print("Cac phan tu cua mang: " + Arrays.toString(mang));	
		
		//CauC
		int x;
		System.out.print(" \nNhap so x trong mang can tim: ");
		x = kb.nextInt();
		
		boolean tim = false;
		
		for (int i = 0; i < a; i++) {
			if (mang[i] == x) {
				System.out.print(x+ " xuat hien tai vi tri: " +i);
				tim = true;
			}
			
		}
		if (!tim) {
			System.out.print(x+ "khong xuat hien trong mang!");
		}
		//CauD
		int lonnhat = mang[0];
		int vitrilonnhat = 0;
		for (int i = 1; i < a; i++) {
			if (mang[i] > lonnhat) {
				lonnhat = mang[i];
				vitrilonnhat = i;
			} 
		}
		System.out.print("\nGia tri lon nhat trong mang la: "+lonnhat);
		System.out.print("\nVi tri phan tu lon nhat la: " +vitrilonnhat );
		//CauE
		int nhonhat = mang[0];
		for (int i = 1; i < a; i++) {
			if (mang[i] < nhonhat) {
				nhonhat = mang[i];
			}
		}
		System.out.print("\nGia tri nho nhat trong mang: " +nhonhat);
		
		//CauG
		Arrays.sort(mang);
		System.out.print("\nSap xep mang theo thu tu tang dan: " +Arrays.toString(mang));
	}

}
