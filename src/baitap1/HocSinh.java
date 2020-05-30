package baitap1;

import java.util.Scanner;

public class HocSinh {
	String hoTen;
	String lop;
	int toan;
	int ly;
	int hoa;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	public int getToan() {
		return toan;
	}

	public void setToan(int toan) {
		this.toan = toan;
	}

	public int getLy() {
		return ly;
	}

	public void setLy(int ly) {
		this.ly = ly;
	}

	public int getHoa() {
		return hoa;
	}

	public void setHoa(int hoa) {
		this.hoa = hoa;
	}

	public HocSinh(String hoTen, String lop, int toan, int ly, int hoa) {
		super();
		this.hoTen = hoTen;
		this.lop = lop;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
	}

	public HocSinh() {
		super();
	}

	public float diemTB() {
		return (float) (this.toan + this.ly + this.hoa) / 3;
	}

	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ho ten: ");
		this.hoTen = sc.nextLine();
		System.out.print("Lop: ");
		this.lop = sc.nextLine();
		System.out.print("Toan: ");
		this.toan = Integer.parseInt(sc.nextLine());
		System.out.print("Ly: ");
		this.ly = Integer.parseInt(sc.nextLine());
		System.out.print("Hoa: ");
		this.hoa = Integer.parseInt(sc.nextLine());
	}

	public void display() {
		System.out.println("Ho ten: " + this.hoTen);
		System.out.println("Lop: " + this.lop);
		System.out.println("Toan: " + this.toan);
		System.out.println("Ly: " + this.ly);
		System.out.println("Hoa: " + this.hoa);
		System.out.println("Diem TB: " + this.diemTB());
	}

	public static void main(String[] args) {
		HocSinh hs = new HocSinh();
		hs.inputData();
		hs.display();
	}
}
