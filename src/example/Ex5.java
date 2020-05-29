package example;

public class Ex5 {
	public static void main(String[] args) {
		TenNguoiNuocNgoai ngoai = new TenNguoiNuocNgoai("Nguyen Hoang", "Anh");
		System.out.println("Ngoai: " + ngoai.toString());

		TenNguoiViet viet = new TenNguoiViet("Nguyen Hoang", "Anh");
		System.out.println("Viet: " + viet.toString());
	}
}
