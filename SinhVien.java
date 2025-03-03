package LABTUAN2;
import java.util.Scanner;

public class SinhVien {
	private int MSSV;
	private String HoTen;
	private double DiemLT;
	private double DiemTH;
	
	public SinhVien() {
		this.MSSV = 0;
		this.HoTen = "";
		this.DiemLT = 0;
		this.DiemTH = 0;
	}
	
	public SinhVien(int mssv, String name, double diemlt, double diemth) {
		this.MSSV = mssv;
		this.HoTen = name;
		this.DiemLT = diemlt;
		this.DiemTH = diemth;
	}
	
	public int getMaSV() {
		return MSSV;
	}
	
	public void setMaSV(int mssv) {
		this.MSSV = mssv;
	}
	
	public String getHoten() {
		return HoTen;
	}
	
	public void setHoten(String name) {
		this.HoTen = name;
	}
	public double getDiemlt() {
		return DiemLT;
	}
	public void setDiemlt(double diemlt) {
		this.DiemLT = diemlt;
	}
	public double getDiemth() {
		return DiemTH;
	}
	public void setDiemth(double diemth) {
		this.DiemTH = diemth;
	}
	public double diemtrungbinh() {
		return (DiemLT + DiemTH) / 2;
	}
	
	public String toString () {
		return "Ma SV: " + MSSV + ", Ho va Ten: " + HoTen + ", Diem LT: " + DiemLT + ", Diem TH: " + DiemTH + ", Diem Trung Bnh: " + diemtrungbinh();
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		SinhVien sv1 = new SinhVien(137, "Le Tran Tan Phat", 9.0, 6.0);
		SinhVien sv2 = new SinhVien(138, "Nguyen Thanh Phat", 8.5, 9.0);
		SinhVien sv3 = new SinhVien();
		
		System.out.print("Nhap ma sinh vien: ");
        sv3.setMaSV(kb.nextInt());
        kb.nextLine(); // 

        System.out.print("Nhap Ho va Ten: ");
        sv3.setHoten(kb.nextLine());

        System.out.print("Nhap diem ly thuyet: ");
        sv3.setDiemlt(kb.nextDouble());

        System.out.print("Nhap diem thuc hanh: ");
        sv3.setDiemth(kb.nextDouble());
		
		System.out.println("MASV\t Ho va ten \t\t Diem Ly thuyet \t Diem Thuc hanh \t Diem Trung binh");
		System.out.println("-----------------------------------------------------");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}


