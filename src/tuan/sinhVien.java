package tuan;

import java.util.Scanner;

public class sinhVien {
	int maSV;
	String tenSV;
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public sinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sinhVien(int maSV, String tenSV) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
	}
	public void setSV() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Nhập mã sinh viên: ");
		this.maSV= Integer.parseInt(sc.nextLine());
		System.out.println(" Nhập tên sinh viên: ");
		this.tenSV= sc.nextLine();
		
	}
	public void view () {
		System.out.println("Mã sinh viên: "+maSV);
		System.out.println("Tên sinh viên: "+tenSV);
	}
//	public static void main(String[] args) {
//		sinhVien sv = new sinhVien();
//		sv.setSV();
//		sv.view();
//	}
	
}
