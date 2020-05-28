package baitaplop;

import java.util.Scanner;

public class DiemThiUuTien extends DiemThiKhoiA {
	int diemUuTien;

	public int getDiemUuTien() {
		return diemUuTien;
	}

	public void setDiemUuTien(int diemUuTien) {
		this.diemUuTien = diemUuTien;
	}

	public DiemThiUuTien() {
		super();
	}

	public DiemThiUuTien(String hoTen, int diemToan, int diemLy, int diemHoa, int diemUuTien) {
		super(hoTen, diemToan, diemLy, diemHoa);
		this.diemUuTien = diemUuTien;
	}

	public void inputData() {
		Scanner input = new Scanner(System.in);
		super.inputData();
		System.out.print("Nhập diem uu tien: ");
		int uutien = Integer.parseInt(input.nextLine());
		setDiemUuTien(uutien);
	}

	public float diemTB() {
		return super.diemTB() + diemUuTien;
	}

}
