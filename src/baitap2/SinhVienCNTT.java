package baitap2;

import java.util.Scanner;

public class SinhVienCNTT extends SinhVien {
	int dtoan;
	int dtin;

	public int getDtoan() {
		return dtoan;
	}

	public void setDtoan(int dtoan) {
		this.dtoan = dtoan;
	}

	public int getDtin() {
		return dtin;
	}

	public void setDtin(int dtin) {
		this.dtin = dtin;
	}

	public SinhVienCNTT(int maSV, String tenSV, int dtoan, int dtin) {
		super(maSV, tenSV);
		this.dtoan = dtoan;
		this.dtin = dtin;
	}

	public SinhVienCNTT() {
		super();
	}

	public int tongDiem() {
		return this.dtin + this.dtoan;
	}

	public void setSV() {
		super.setSV();
		Scanner sc = new Scanner(System.in);
		System.out.print("Diem toan: ");
		this.dtoan = Integer.parseInt(sc.nextLine());
		System.out.print("Diem tin: ");
		this.dtin = Integer.parseInt(sc.nextLine());
	}

	public void viewSV() {
		super.viewSV();
		System.out.println("Diem Toan: " + this.dtoan);
		System.out.println("Diem Tin: " + this.dtin);
		System.out.println("Tong diem: " + this.tongDiem());
	}
	public static void main(String[] args) {
		SinhVienCNTT svcntt = new SinhVienCNTT();
		svcntt.setSV();
		svcntt.viewSV();
	}
}
