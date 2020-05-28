package baitap3;

import java.util.Scanner;

public class NhanKhau {
	String hoTen;
	String ngaySinh;
	String gioiTinh;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public NhanKhau(String hoTen, String ngaySinh, String gioiTinh) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
	}

	public NhanKhau() {
		super();
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Ngay sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.print("Gioi tinh: ");
		this.gioiTinh = sc.nextLine();
	}
	public void display() {
		System.out.println("Ho ten: "+this.hoTen);
		System.out.println("Ngay sinh: "+this.ngaySinh);
		System.out.println("Gioi tinh: "+this.gioiTinh);
	}
}
