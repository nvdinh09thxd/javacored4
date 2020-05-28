package baitap3;

public class QuanLyDanSo {
	public static void line() {
		System.out.println("-----------------------------------");
	}

	public static void main(String[] args) {
		NhanKhau nk = new NhanKhau();
		HoKhau hk = new HoKhau();
		System.out.println("Nhap thong tin nhan khau");
		nk.inputData();
		line();
		System.out.println("Xuat thong tin nhan khau");
		nk.display();
		line();
		System.out.println("Nhap thong tin ho khau");
		hk.inputData();
		line();
		System.out.println("Xuat thong tin ho khau");
		hk.display();
		line();
	}
}
