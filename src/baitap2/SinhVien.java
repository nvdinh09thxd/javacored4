package baitap2;

import java.util.Scanner;

public class SinhVien {
	int MaSV;
	String TenSV;

	public int getMaSV() {
		return MaSV;
	}

	public void setMaSV(int maSV) {
		MaSV = maSV;
	}

	public String getTenSV() {
		return TenSV;
	}

	public void setTenSV(String tenSV) {
		TenSV = tenSV;
	}

	public SinhVien(int maSV, String tenSV) {
		super();
		MaSV = maSV;
		TenSV = tenSV;
	}

	public SinhVien() {
		super();
	}

	public void setSV() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ma sinh vien: ");
		this.MaSV = Integer.parseInt(sc.nextLine());
		System.out.print("Ten sinh vien: ");
		this.TenSV = sc.nextLine();
	}

	public void viewSV() {
		System.out.println("Ma sinh vien: " + this.MaSV);
		System.out.println("Ten sinh vien: " + this.TenSV);
	}

	public static void main(String[] args) {
		SinhVien sv = new SinhVien();
		sv.setSV();
		sv.viewSV();
	}
}
