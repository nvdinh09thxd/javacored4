package tuan;

import java.util.Scanner;

public class hocSinh {
	String hoTen;
	String Lop;
	float Toan;
	float Ly;
	float Hoa;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return Lop;
	}

	public void setLop(String lop) {
		Lop = lop;
	}

	public float getToan() {
		return Toan;
	}

	public void setToan(float toan) {
		Toan = toan;
	}

	public float getLy() {
		return Ly;
	}

	public void setLy(float ly) {
		Ly = ly;
	}

	public float getHoa() {
		return Hoa;
	}

	public void setHoa(float hoa) {
		Hoa = hoa;
	}

	public hocSinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public hocSinh(String hoTen, String lop, float toan, float ly, float hoa) {
		super();
		this.hoTen = hoTen;
		Lop = lop;
		Toan = toan;
		Ly = ly;
		Hoa = hoa;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Họ và tên: ");
		this.hoTen = sc.nextLine();
		System.out.println(" Lớp: ");
		Lop = sc.nextLine();
		System.out.println(" Điểm toán:  ");
		Toan = Float.parseFloat(sc.nextLine());
		System.out.println(" Điểm Lý: ");
		Ly = Float.parseFloat(sc.nextLine());
		System.out.println(" Điểm Hóa: ");
		Hoa = Float.parseFloat(sc.nextLine());
	}

	public float DTB() {
		float DTB = ((Toan  + Ly + Hoa) / 3);
		return DTB;
	}

	public void display() {
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("Lớp: " + Lop);
		System.out.println("Điểm Toán: " + Toan);
		System.out.println("Điểm Lý: " + Ly);
		System.out.println("Điểm Hóa: " + Hoa);
		System.out.println(" Điểm trung bình: " + DTB());
	}
	public static void main(String[] args) {
		hocSinh hs = new hocSinh();
		hs.nhap();
		hs.display();
	}
}
