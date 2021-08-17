package tuan;

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
		// TODO Auto-generated constructor stub
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		System.out.println("Nhập ngày sinh: ");
		this.ngaySinh = sc.nextLine();
		System.out.println("Nhập giới tính: ");
		this.gioiTinh = sc.nextLine();
	}

	public void display() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Giới tính: " + gioiTinh);
	}
}
