package tuan;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
	String diaChi;
	String congTac;

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getCongTac() {
		return congTac;
	}

	public void setCongTac(String congTac) {
		this.congTac = congTac;
	}

	public HoKhau(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congTac) {
		super(hoTen, ngaySinh, gioiTinh);
		this.diaChi = diaChi;
		this.congTac = congTac;
	}

	public HoKhau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HoKhau(String hoTen, String ngaySinh, String gioiTinh) {
		super(hoTen, ngaySinh, gioiTinh);
		// TODO Auto-generated constructor stub
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập địa chỉ hiện nay: ");
		this.diaChi = sc.nextLine();
		System.out.println("Nhập nơi công tác: ");
		this.congTac = sc.nextLine();
	}

	public void display() {
		System.out.println("Địa chỉ hiện nay : " + diaChi);
		System.out.println("Nơi công tác: " + congTac);
	}

}
