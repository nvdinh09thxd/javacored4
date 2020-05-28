package baitap1;

public class HocSinhChuyenToan extends HocSinh {
	public float diemTB() {
		return (float) (this.toan * 2 + this.ly + this.hoa) / 4;
	}

	public static void main(String[] args) {
		HocSinhChuyenToan hsct = new HocSinhChuyenToan();
		hsct.inputData();
		hsct.display();
	}

}
