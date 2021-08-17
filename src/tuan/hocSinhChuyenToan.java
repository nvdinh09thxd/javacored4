package tuan;

public class hocSinhChuyenToan extends hocSinh {
	public float DTB() {
		float DTB = (((Toan * 2) + Ly + Hoa) / 4);
		return DTB;
	}
	public static void main(String[] args) {
		hocSinhChuyenToan hss= new hocSinhChuyenToan();
		hss.nhap();
		hss.display();
	}
}
