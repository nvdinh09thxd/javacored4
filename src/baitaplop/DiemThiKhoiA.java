package baitaplop;

import java.util.Scanner;

public class DiemThiKhoiA {
	String hoTen;
	int diemToan;
	int diemLy;
	int diemHoa;

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(int diemToan) {
		this.diemToan = diemToan;
	}

	public int getDiemLy() {
		return diemLy;
	}

	public void setDiemLy(int diemLy) {
		this.diemLy = diemLy;
	}

	public int getDiemHoa() {
		return diemHoa;
	}

	public void setDiemHoa(int diemHoa) {
		this.diemHoa = diemHoa;
	}

	public DiemThiKhoiA(String hoTen, int diemToan, int diemLy, int diemHoa) {
		super();
		this.hoTen = hoTen;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}

	public DiemThiKhoiA() {
		super();
	}

	public void inputData() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập ho ten: ");
		String hoTen = input.nextLine();
		System.out.print("Nhập diem toan: ");
		int toan = Integer.parseInt(input.nextLine());
		System.out.print("Nhập diem ly: ");
		int ly = Integer.parseInt(input.nextLine());
		System.out.print("Nhập diem hoa: ");
		int hoa = Integer.parseInt(input.nextLine());
		setHoTen(hoTen);
		setDiemToan(toan);
		setDiemLy(ly);
		setDiemHoa(hoa);
	}

	public String toString() {
		return "Ho ten: " + getHoTen() + ", diem TB = " + diemTB();
	}

	public float diemTB() {
		return (this.diemToan + this.diemLy + this.diemHoa) / 3;
	}
}
