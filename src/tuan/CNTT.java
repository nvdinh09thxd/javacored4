package tuan;

import java.util.Scanner;

public class CNTT extends sinhVien {
	int dToan;
	int dTin;

	public int getdToan() {
		return dToan;
	}

	public void setdToan(int dToan) {
		this.dToan = dToan;
	}

	public int getdTin() {
		return dTin;
	}

	public void setdTin(int dTin) {
		this.dTin = dTin;
	}

	public CNTT(int dToan, int dTin) {
		super();
		this.dToan = dToan;
		this.dTin = dTin;
	}

	public CNTT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CNTT(int maSV, String tenSV) {
		super(maSV, tenSV);
		// TODO Auto-generated constructor stub
	}

	public float tongdiem() {
		float tongDiem = 0;
		return tongDiem = (dToan + dTin);
	}

	public void setSV() {
		super.setSV();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập điểm Toán: ");
		this.dToan = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập điểm Tin: ");
		this.dTin = Integer.parseInt(sc.nextLine());
	}

	public void view() {
		super.view();
		System.out.println("Điểm Toán: " + dToan);
		System.out.println("Điểm Toán: " + dTin);
		System.out.println("Tổng điểm: " + tongdiem());
	}

	public static void main(String[] args) {
		CNTT sv = new CNTT();
		sv.setSV();
		sv.view();
	}
}
