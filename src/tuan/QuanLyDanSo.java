package tuan;

public class QuanLyDanSo {
	public static void main(String[] args) {
		NhanKhau nKhau = new NhanKhau();
		HoKhau hKhau = new HoKhau();
		System.out.println(" Nhập thông tin nhân khẩu");
		nKhau.nhap();
		System.out.println(" Nhập thông tin hộ khẩu");
		hKhau.nhap();
		System.out.println("thông tin nhân khẩu");
		nKhau.display();
		System.out.println("thông tin hộ khẩu");
		hKhau.display();
	}
}
