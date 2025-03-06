package BAITAPTUAN7;
import java.util.Scanner;
public class HinhHoc {
	public final float Pi = 3.14f;
	public String ten;
	public float ChuVi;
	public float DienTich;
	public float TheTich;
	
	public HinhHoc(String name, float chuvi, float dientich, float thetich ) {
		this.ten=name;
		this.ChuVi=chuvi;
		this.DienTich=dientich;
		this.TheTich=thetich;
	}
	public void xuatTen() {
		System.out.println("Ten hinh: "+ten);
	}
	public void inChuVi() {
		System.out.println("Chu vi la: "+ChuVi);
	}
	public void inDienTich() {
		System.out.println("Dien tich la: " +DienTich);
	}
	public void inTheTich() {
		System.out.println("The tich la: "+TheTich);
	}
	}


