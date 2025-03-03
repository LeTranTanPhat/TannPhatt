package LABTUAN2;
import java.util.Scanner;

public class HinhChuNhat {
	private double chieudai;
	private double chieurong;
	
	public HinhChuNhat (double cd, double cr) {
		this.chieudai = cd;
		this.chieurong = cr;
	}
	
	public void setChieuDai ( double cd) {
		if (cd > 0) {
			this.chieudai = cd;
		} else {
			System.out.print("Chieu dai phai lon hon 0! ");
		}
	}
	public double getChieuDai() {
		return chieudai;
	}
	
	public void setChieuRong(double cr) {
		if (cr > 0) {
			this.chieurong = cr;
		} else {
			System.out.print("Chieu rong phai lon hon 0 ");
		}
	}
	
	public double getChieuRong() {
		return chieurong;
	}
	
	public double Chuvi() {
		return (chieudai + chieurong) * 2;
	}
	
	public double Dientich() {
		return chieudai * chieurong;
	}
	
	public String toString() {
		return "Hinh chu nhat [Chieu dai = " + chieudai + ", Chieu rong = " + chieurong + ", Chu vi = " +Chuvi() + ", Dien tich = " +Dientich() + "]";
	}
	
	public static void main (String[] args) {
		Scanner keyb = new Scanner(System.in);
		double cd, cr;
		
		do {
			System.out.print("Nhap chieu dai = ");
			cd = keyb.nextDouble();
			if ( cd <= 0) System.out.print("Chieu dai phai lon hon 0! Hay nhap lai = ");
		} while (cd <= 0);
		
		do {
			System.out.print("Nhap chieu rong = ");
			cr = keyb.nextDouble();
			if (cr <= 0 ) System.out.print("Chieu rong phai lon hon 0! Vui long nhap lai = ");
		} while (cr <= 0);
		
		HinhChuNhat hcn = new HinhChuNhat(cd,cr);
		System.out.print(hcn);
	}
}

